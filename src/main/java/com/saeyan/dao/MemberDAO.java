package com.saeyan.dao;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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
}
