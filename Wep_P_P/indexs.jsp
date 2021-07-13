<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="Login.do"> 로그인 페이지이동 </a>
<input type="button" value="modify" onclick="location.href='memberUpdate.do?userid=${loginUser.userid}'">
</body>
</html>