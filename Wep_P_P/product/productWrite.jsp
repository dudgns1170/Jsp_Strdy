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
<h1> 상품 등록 페이지</h1>
<form method="post" enctype="multipart/form-data" name="frm">

<table>
<tr>
<th>상품명</th>
<td> <input type="text" name="name" size=80> </td>
</tr>
<tr>
<th>가격</th>
<td> <input type="text" name="price" > </td>
</tr>
<tr>
<th>사진</th>
<td> <input type="file" name="pictureUrl" > <br>
(주의사항 : 이미지를 변경하고자 할때만 선택하시요) </td>
</tr>
<tr>
<th>설명</th>
<td> <textarea cols="80" rows="10" name="description"></textarea> </td>
</tr>
</table>
<br>
<input type="submit" value="등록" onclick="return productCheck()">
<input type="reset" value="다시 작성">
<input type="button" value="목록" onclick="location.href=productlist.do">


</form>



</div>
</body>
</html>