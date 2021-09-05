<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
//	int firstNum = Integer.parseInt(request.getParameter("first-num"));
//	int secondNum = Integer.parseInt(request.getParameter("second-num"));
//	char operator = request.getParameter("operator").charAt(0); 
	int firstNum = (int)request.getAttribute("first");
	int secondNum = (int)request.getAttribute("second");
	char operator = (char)request.getAttribute("operator");
	int result = (int)request.getAttribute("result");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기 계산 결과</title>
<style>
	span {
	background-color: gold;
	
}
</style>
</head>
<body>
<!--  jsp : Java Server page-->
<!-- 
	html + servlet => JSP
-->
		<span style="color:blue;">
		<%= firstNum %> <%= operator %> <%=secondNum %> = <%= result %>
		</span>
</body>
</html>