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
	<form method="POST" action="${pageContext.request.contextPath }/memberUpdate.do" name="joinform">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" readonly="readonly" value="${mVo.name }"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid" readonly="readonly" value="${mVo.userid }"></td>
			</tr>
			<tr>
				<td>암호</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>암호확인</td>
				<td><input type="password" name="pwdpwd"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email" value="${mVo.email }"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phone" value="${mVo.phone }"></td>
			</tr>
			<tr>
				<td>등급</td>

				<td><c:choose>
						<c:when test="${mVo.admin == 0 }">
							<input type="radio" name="admin" value="0" checked="checked">일반회원
							<input type="radio" name="admin" value="1">관리자
							</c:when>
						<c:otherwise>
							<input type="radio" name="admin" value="0">일반회원
							<input type="radio" name="admin" value="1" checked="checked">관리자
							</c:otherwise>
					</c:choose></td>
			</tr>
			<tr>
				<td><input type="submit" value="OK" onclick="return joinCheck()"></td>
				<td><input type="reset" value="cancle"></td>
			</tr>
			<tr>
				<td colspan="2">${message }</td>
			</tr>
		</table>
	</form>

</body>
</html>