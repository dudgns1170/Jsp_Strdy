<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="product/sh.css">
</head>
<body>
<div id="wrap" align="center">
<h1>��ǰ ����Ʈ- ������</h1>
<table class="list" border="1">
<tr>
<td colspan="5" style="border: white; text-align: right: ;" >
<a href="productWrite.do">��ǰ ���</a></td>
</tr>

<tr>
<th>��ȣ</th>
<th>�̸�</th>
<th>����</th>
<th>����</th>
<th>����</th>

</tr>

<c:forEach var="product" items="${productList}">

<tr>
<td>${product.code}</td>
<td>${product.name}</td>
<td>${product.price}</td>

<td>
<a href="productUpdate.do?code=${product.code} "></a>
</td>
<td>
<a href="productDelete.do?code=${product.code}"></a>
</td>
</tr>
</c:forEach>

</table>

</div>
</body>
</html>