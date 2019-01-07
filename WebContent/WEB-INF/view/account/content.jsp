<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="content">
	<form action="account.do">
	입금액 :<input type="text" name="money"/>
	<input type="hidden" name="cmd" value="open-account" />
	<input type="submit" id="btn" value="확인" />
	</form>
</div>
