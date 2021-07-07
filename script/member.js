function loginCheck(){
	if(document.frm.userid.value.length==0)
	{
		alert("아이디 입력");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value == "")
	{
		alert("암호를 입력해주세여");
		frm.pwd.focus();
		return false;
	}
	return true;
}