<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="UTF-8">
  <title>Login Page </title>


</head>


 <link rel="stylesheet" href="loginForm.css">
<body>
  <form  name="log"action = "loginProcess.jsp" method="post" >
   <!-- 전송할 페이지(서버) 지정 -->
    <table>
      <tr>
        <td colspan="3" align=center bgcolor="">
          <b>
            <font size=11>Login</font>
          </b>
        </td>
      </tr>

      <tr>
        <td>아이디 : </td>
        <td><input type="text" name="id" maxlength="20"></td>
         <!-- 아이디 입력값 8자리 제한 -->
      </tr>
      <tr>
          <td>비밀번호 : </td>
        <td><input type="password" name="pw" maxlength="15"></td>
         <!-- 비밀번호 입력값 8자리 제한 -->
      </tr>
      <tr>
        <td colspan="3" align=center>
          <br>
          <div>
          <input class="btn hover1"  type="submit"  value="로그인" >
          </div>
          <br>
  
          
        	<input class="btn hover3" type="button" name="" value="Sign_up" onclick="location.href='joinForm.jsp'">
	
		       <div class="btn1">
           비밀번호를 잊으셨습니까?
          <input id="put2"type="button" value="비밀번호 찾기" onclick="location.href='FindPw.jsp'" >
           </div>
        </td>
      </tr>
    </table>
    
  </form>

 <script type="text/javascript">
 // 실시간 상담 가능 기능
        var Tawk_API = Tawk_API || {},
          Tawk_LoadStart = new Date();
        (function() {
          var s1 = document.createElement("script"),
            s0 = document.getElementsByTagName("script")[0];
          s1.async = true;
          s1.src = 'https://embed.tawk.to/609632a5185beb22b30b4590/1f55bbm6p';
          s1.charset = 'UTF-8';
          s1.setAttribute('crossorigin', '*');
          s0.parentNode.insertBefore(s1, s0);
        })();
      </script>
</body>

</html>
