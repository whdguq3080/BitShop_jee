<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css "/>
</head>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<h1 id="title">게시판 </h1>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div id="navi-bar">
					<ul>
                        <li><a href="home.do">홈</a></li>
                        <li><a href="member.do">회원관리</a></li>
                        <li><a href="account.do">계좌관리</a></li>
                        <li><a href="article.do"><font color="green">게시판</font></a></li>
                        <li><a href="admin.do">관리자</a></li>
                    </ul>
				</div>
			</td>
		</tr>
		<tr style="height: 300px">
			<td id="side-menu">
			<table>
                <tr>
                    <td>글쓰기</td>
                </tr>
                <tr>
                    <td>글 목록</td>
                </tr>
                <tr>
                    <td>글 검색(글쓴이)</td>
                </tr>
                <tr>
                    <td>글 검색(글번호)</td>
                </tr>
                <tr>
                    <td>글 갯수</td>
                </tr>
                <tr>
                    <td>글 정보 수정</td>
                </tr>
                <tr>
                    <td>글삭제</td>
                </tr>
            </table>
			</td>
			<td></td>
		</tr>
	</table>
</body>
</html>