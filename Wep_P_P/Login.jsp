<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>�α���</h2>
<form action="Login.do" method="post" name="frm">
<table>
<tr>
<td>���̵�</td>
<td><input type="text" name="userid" value="$(userid)" >  </td>
</tr>
<tr>
<td>�� ȣ</td>
<td><input type="password" name="pwd"> </td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="�α���" onclick="return loginCheck()">
<input type="reset" value="���">
<input type="button" value=" ȸ������" onclick="location.href'join.do'">
</td>
</tr>



</table>



</form>
</body>
</html>