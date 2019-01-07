<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>
<div id="open-result">
	<h1 style="font-size: 40px; color: #888" >  성공</h1>
	<%
	System.out.println("오픈리절트옴");
	AccountBean acc = (AccountBean)request.getAttribute("acc");
	%>
	<%=acc%>
</div>
