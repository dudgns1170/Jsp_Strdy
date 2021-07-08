<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="member.js"></script>
</head>
<body>
<body>
	<h3>Log In</h3>
	<form method="POST" action="/login.do" name="loginform">
		<table>
			<tr>
				<td>아이디</td>
				<td colspan="2"><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td colspan="2"><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Log In" onclick="return loginCheck()"></td>
				<td style="text-align: center"><input type="reset" value="cancle"></td>
				<td style="text-align: right"><input type="button" value="Join" onclick="location.href='join.do'">
				<td>
			</tr>
		</table>
	</form>
</body>
</html>



