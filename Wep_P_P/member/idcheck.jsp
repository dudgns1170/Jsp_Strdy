<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="member.js"></script>
</head>
<body>
<h2>�ߺ�Ȯ��</h2>
<form action="idCheck.do" method="get" name="frm">
���̵�<input type="text" name="userid" value="${ userid}">
<input type="submit" value="�ߺ�üũ">
<br>
<c:if test="${ result == 1 }">
<script type="text/javascript">
opener.document.frm.userid.value="";
</script>
${userid }�� �̹� ������� ���̵� �Դϴ�.
</c:if>
<c:if test="${ result == -1 }">
${userid }�� ��� ������ ���̵��Դϴ�.
<input type="button" value="���" class="cancel" onclick="idok('${userid}')">
</c:if>
</form>
</body>
</html>