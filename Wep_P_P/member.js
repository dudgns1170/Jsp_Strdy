/**
 * 
 */
/**
 * 
 */
function loginCheck(){
	if (document.loginform.userid.value == ""){
		alert("아이디를 입력해 주세요.");
		document.loginform.userid.focus();
		return false;
	} else if (document.loginform.pwd.value == ""){
		alert("비밀번호를 입력해주세요.");
		document.loginform.pwd.focus();
		return false;
	} else {
		return true;
	}
}
function idCheck() {
	// 사용자 아이디가 입력되었는지 확인 루틴 구현
	if (document.joinform.userid.value == "") {
		alert("사용자 아이디를 입력해주세요.");
		document.joinform.userid.focus();
		return false;
	}
	// 아이디 중복 체크를 위한 페이지는 새로운 창에 출력한다.(idcheck.jsp)
	var url = "idCheck.do?userid=" + document.joinform.userid.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}

function idok(userid)
{
	opener.frm.userid.value= document.frm.userid.value;
	opener.frm.reid.value=document.frm.userid.value;
	self.cloes();
}