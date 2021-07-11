package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.saeyan.dto.MemberVo;

//db연동 해서 작업하는 데이터베이스 처리 클레스
public class MemberDAO {
	//싱글톤  단하나의 ㄱ개체를 갖는다 
	//외부의 수정을 막는다. 
	private MemberDAO() {
		
	}
	
	private static MemberDAO instance = new MemberDAO();
	//답만 얻을 수 있도록 get만 생성
	// 싱글톤 패턴은 무분별한 생성을 막아 무분멸한 메모리 생성을 막는다.
	public static MemberDAO getInstance() {
		return instance;
	}
	//커넥션 메소드 생성
	public Connection getConnection() throws Exception
	{
		Connection conn= null;
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}
	//사용자 유저 인증 확인
	public int userCheck(String userid , String pwd)
	{
		int result =-1;
		String sql = "select pwd from member where userid=?";
		Connection conn =null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			psmt =conn.prepareStatement(sql);
			psmt.setString(1, userid);
			rs = psmt.executeQuery();
			if(rs.next())
			{
				if(rs.getString("pwd") != null && rs.getString("pwd").equals(pwd))
				{
					result =1;
				}else
				{
					result =0;
				}
			}else
			{
				result= -1;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null)
					rs.close();
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return result;
	}
	//컨펌 아이디 하는 거
	public MemberVo getMember(String userid)
	{
		MemberVo mVo= null;
		String sql = "select * from member where userid =?";
		Connection conn = null;
		PreparedStatement ptms = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			ptms= conn.prepareStatement(sql);
			ptms.setString(1, userid);
			rs=ptms.executeQuery();
			if(rs.next())
			{
				mVo = new MemberVo();
				mVo.setName(rs.getString("name"));
				mVo.setUserid(rs.getString("userid"));
				mVo.setPwd(rs.getString("pwd"));
				mVo.setEmail(rs.getNString("enail"));
				mVo.setPhone(rs.getString("phone"));
				mVo.setAdmin(rs.getInt("admin"));
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null)
					rs.close();
				if(ptms != null)
					ptms.close();
				if(conn != null)
					conn.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return mVo;
		
	}
	public int confirmID(String userid)
	{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = -1;

	String sql = "select pwd from member where userid=?";

	try {
		conn = getConnection(); // DB 연결 시도
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userid);

		rs = pstmt.executeQuery();

		if (rs.next()) { // 조회 결과가 있으면 userid가 존재한다는 의미
			result = 1;
		} else {
			// 조회한 결과가 값이 없으므로 userid가 존재하지 않음.
			result = -1;
		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (conn != null) {
				conn.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	return result;
}

	public int  insertMember(MemberVo mVo)
	{
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		int result =0;
		
		String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
		try
		{
			conn= getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getName());
			pstmt.setString(2, mVo.getUserid());
			pstmt.setString(3, mVo.getPwd());
			pstmt.setString(4, mVo.getEmail());
			pstmt.setString(5, mVo.getPhone());
			pstmt.setInt(6, mVo.getAdmin());
			
			result =pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	return result;
	}
}
