<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="sh.css">
</head>
<body>
<div id="wrap" align="center">
<h1> ��ǰ ��� ������</h1>
<form method="post" enctype="multipart/form-data" name="frm">

<table>
<tr>
<th>��ǰ��</th>
<td> <input type="text" name="name" size=80> </td>
</tr>
<tr>
<th>����</th>
<td> <input type="text" name="price" > </td>
</tr>
<tr>
<th>����</th>
<td> <input type="file" name="pictureUrl" > <br>
(���ǻ��� : �̹����� �����ϰ��� �Ҷ��� �����Ͻÿ�) </td>
</tr>
<tr>
<th>����</th>
<td> <textarea cols="80" rows="10" name="description"></textarea> </td>
</tr>
</table>
<br>
<input type="submit" value="���" onclick="return productCheck()">
<input type="reset" value="�ٽ� �ۼ�">
<input type="button" value="���" onclick="location.href=productlist.do">


</form>



</div>
</body>
</html>