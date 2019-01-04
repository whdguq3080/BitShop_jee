<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/resources/css/style.css" />
</head>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<h1 id="title">계좌 관리</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<ul id="navi-bar">
				<li id="active"><a href="home.do">홈</a></li>
				<li><a href="member.do">회원관리</a></li>
				<li style="background-color: green;"><a href="account.do">계좌관리</a></li>
				<li><a href="article.do">게시판</a></li>
				<li><a href="admin.do">관리자</a></li>
			</ul>
		</td>
	</tr>
	<tr style="height : 300px">
		<td id="side-menu">
			<table>
				<tr>
					<td>계좌 생성</td>
				</tr>
				<tr>
					<td>계좌 목록</td>
				</tr>
				<tr>
					<td>계좌검색(이름)</td>
				</tr>
				<tr>
					<td>계좌검색(계좌번호)</td>
				</tr>
				<tr>
					<td>총계좌수</td>
				</tr>
				<tr>
					<td>계좌번호채크</td>
				</tr>
				<tr>
					<td>입금</td>
				</tr>
				<tr>
					<td>출금</td>
				</tr>
				<tr>
					<td>계좌삭제</td>
				</tr>
			</table>
		</td>
		<td>
			<div>
					<h1 style="font-size: 40px; color: #888" >  성공</h1>
					<%@ include file="content.jsp" %>
					<form action="account.do">
					<input type="hidden" name="dir" value="account"/>
					<input type="submit" id="btn" value="확인" />
					</form>
			</div>
		</td>
	</tr>
</table>
</body>
</html>
</body>
</html>