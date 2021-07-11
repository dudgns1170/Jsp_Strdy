<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="member.js"></script>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>
<h2>회원 가입 입력</h2>
<br>
<form action="join.do" method="post" name="joinform">
<table>
<tr>
<td>이름 </td>
<td><input type="text" name="name" size="20">  </td>
</tr>
<tr>
<td> 아이디</td>
<td><input type="text" name= "userid" size="20" id="userid">
<input type="hidden" name= "reid" size="20">
<input type="button" value="중복 체크" onclick="idCheck()">
</td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" name= "pwd" size="20"></td>
</tr>
<tr>
<td>이메일</td>
<td><input type="text" name= "email" size="20"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="text" name= "phone" size="20"></td>
</tr>
<tr>
<td colspan="1"  align="center">
<input type="submit" value="확인" onclick="return idCheck()">
<input type="reset" value="취소">
</td>
</tr>
<tr>
<td colspan="2"> ${message }</td>
</tr>
</table>
</form>
</body>
</html>