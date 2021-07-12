package util;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class DBManger {
	
	public static Connection getConnection()
	{
		Connection conn =null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			//lookup에 기재한 내용의 객체를 찾아서 데이터 소스가 반는다
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ((DBManger) ds).getConnection();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return conn;
	}

	
	//select를 수행한 후 리소스 해제를 위한 메소드
	public static void close ( Connection conn,   ResultSet rs , Statement stmt)
	{
	{
	try {
		rs.close();
		conn.close();
		stmt.close();
	
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	}
	//삽입 삭제 수정을 한 후 리소스를 해제 하기 위한 메소드
	public static void close(Connection conn, Statement stma)
	{
		try {
			stma.close();
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
}
