<%@page import="java.sql.Connection"%>
<%@page import="com.saeyan.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

MemberDAO memDao =MemberDAO.getInstance();
Connection conn = memDao.getConnection();
out.println("db연동 성공");

%>
</body>
</html>