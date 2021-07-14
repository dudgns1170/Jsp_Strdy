/**
 * 
 */

function productCheck(){
	if(document.frm.name.value.length ==0){
	alert("상품명명이 존재하지 않습니다.");
	frm.name.focus();
		return false;
		}
	if(document.frm.price.value.length ==0)
	{
	alert("가격을 입력 해 주세요");
	frm.price.focus();
		return false;}
	if(isNaN(document.frm.price.value==0))
	{alert("설명을 입력해주세요");
	frm.description.focus();
	return false;
	}
	return true;
}