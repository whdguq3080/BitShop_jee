<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String pass = request.getParameter("pass");
String ssn = request.getParameter("ssn");

String year = "";
String month= "";
String day = "";
String gender = "";

char c = ssn.charAt(7);
switch(c){
case '1' : case '3':
		gender = "남자";
		break;
case '2' : case '4':
	gender = "여자";
	break;
case '5' : case '6':
	gender = "외국인";
	break;
default : 
	gender = "잘못 입력되었습니다."; 
	break;
}

double bmi = 0.0;
double weight= Double.parseDouble(request.getParameter("weight"));
double height= Double.parseDouble(request.getParameter("height"));
String bmi1 ="";

bmi = weight/(height*height*0.0001);

if(bmi>=40){
	bmi1 = "고도비만";
}else if(bmi>=35){
	bmi1 = "중등도비만";
}else if(bmi>=30){
	bmi1 = "경도비만";
}else if(bmi>=25){
	bmi1 = "과체중";
}else if(bmi>=18.5){
	bmi1 = "정상";
}else{
	bmi1= "잘못 입력되었습니다.";
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%= name %> 님 환영합니다.  <br />
 <h3>가입한 ID : <%= id %></h3> <br />
 <h3>이 름 : <%=name %></h3> <br />
 <h3>가입한 비번 : *********</h3> <br />
 <h3>생년월일 : <%=year %>년 <%= month  %>월<%= day %> 일생</h3> <br />
 <h3>성 별  : <%=gender %></h3> <br />
 <h3>BMI : <%=bmi1 %></h3> <br />
 <a href=join-form.jsp>로그인으로 이동</a>
 <a href="../index.jsp">홈으로 이동</a>
</body>
</html>