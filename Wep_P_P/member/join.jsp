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
<h2>ȸ�� ���� �Է�</h2>
<br>
<form action="join.do" method="post" name="joinform">
<table>
<tr>
<td>�̸� </td>
<td><input type="text" name="name" size="20">  </td>
</tr>
<tr>
<td> ���̵�</td>
<td><input type="text" name= "userid" size="20" id="userid">
<input type="hidden" name= "reid" size="20">
<input type="button" value="�ߺ� üũ" onclick="idCheck()">
</td>
</tr>
<tr>
<td>��й�ȣ</td>
<td><input type="password" name= "pwd" size="20"></td>
</tr>
<tr>
<td>�̸���</td>
<td><input type="text" name= "email" size="20"></td>
</tr>
<tr>
<td>��ȭ��ȣ</td>
<td><input type="text" name= "phone" size="20"></td>
</tr>
<tr>
<td colspan="1"  align="center">
<input type="submit" value="Ȯ��" onclick="return idCheck()">
<input type="reset" value="���">
</td>
</tr>
<tr>
<td colspan="2"> ${message }</td>
</tr>
</table>
</form>
</body>
</html>