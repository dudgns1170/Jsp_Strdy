<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>로그인</h2>
<form action="Login.do" method="post" name="frm">
<table>
<tr>
<td>아이디</td>
<td><input type="text" name="userid" value="$(userid)" >  </td>
</tr>
<tr>
<td>암 호</td>
<td><input type="password" name="pwd"> </td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="로그인" onclick="return loginCheck()">
<input type="reset" value="취소">
<input type="button" value=" 회원가입" onclick="location.href'join.do'">
</td>
</tr>



</table>



</form>
</body>
</html>