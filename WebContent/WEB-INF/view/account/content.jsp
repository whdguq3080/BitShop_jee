<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.*" %>
<div id="content">
<%
String compo = request.getAttribute("compo")+"";
switch(compo){
case "acc-success" :
	%>
	<h1>계좌정보는</h1>
	<%
	AccountBean acc = (AccountBean)request.getAttribute("acc");
	 %>
	 <%= acc %>
	<%
	break;
}
%>
</div>