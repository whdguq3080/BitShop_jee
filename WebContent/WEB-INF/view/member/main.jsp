<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css"/>
</head>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<h1 id="title">회원 관리</h1>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div id="navi-bar">
					<ul>
                        <li><a href="home.do">홈</a></li>
                        <li><a href="member.do"><font color="yellow">회원관리</font></a></li>
                        <li><a href="account.do">계좌관리</a></li>
                        <li><a href="article.do">게시판</a></li>
                        <li><a href="admin.do">관리자</a></li>
                    </ul>
				</div>
			</td>
		</tr>
		<tr style="height: 300px">
			<td id="side-menu">
			<table>
                    <tr>
                        <td>회원가입</td>
                    </tr>
                    <tr>
                        <td>회원목록</td>
                    </tr>
                    <tr>
                        <td>회원검색(이름)</td>
                    </tr>
                    <tr>
                        <td>회원검색(ID)</td>
                    </tr>
                    <tr>
                        <td>회원수</td>
                    </tr>
                    <tr>
                        <td>회원정보 수정</td>
                    </tr>
                    <tr>
                        <td>회원 탈퇴</td>
                    </tr>

                </table>
			</td>
			<td></td>
		</tr>
	</table>
</body>
</html>