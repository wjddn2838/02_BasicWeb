<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Element 실습</title>
</head>
<body>
	<h1>JSP(Java Server Pages) Element 실습페이지</h1>
	<hr>
<!--  스크립틀릿-->
<!-- int a = 10; -->
	<%
		int a = 10;//자바 코드
		String str = "Hello JSP!";
		out.println("1. a : "+a+"<br>");
	%>
	2. a : <%= a %>	
	<br>
	<%
		for(int i = 1;i<7;i++){
			out.println("<h"+i+">");
			out.println("제목태그(자바로 작성)");
			out.println("</h"+i+">");
		}
	%>
	<br>
	<%!
		public int add(int num1, int num2) {
			return num1+num2;
		}
	%>
	<span style="color:pink">함수를 사용한 결과는</span>
	<%= add(100,200) %>
</body>
</html>