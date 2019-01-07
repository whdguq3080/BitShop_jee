<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 관리</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css "/>
</head>
<body>
<table id="wrapper">
	<tr>
			<td colspan="2">
			<h1 id="title">계좌관리</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr style="height: 300px">
			<td style="width: 30%">
			<%@ include file="side-menu.jsp" %>
			</td>
			<td colspan="2">
			<%
			String dest = String.valueOf(request.getAttribute("dest")) ;
			switch(dest){
			case"NONE":
				%>
				<%@ include file="content.jsp" %>
				<% 
				break;
			case"open-result":
				%>
				<%@ include file="open-result.jsp" %>
				<% 
				break;	
			}
			%>
			</td>
	</tr>
</table>
</body>
</html>