<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

//	String gender = (String)request.getAttribute("gender12");
//	String chkMail = (String)request.getAttribute("chk-mail");
	String gender = (String)request.getAttribute("gender12");
	String chkMail = (String)request.getAttribute("chkMail");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>라디오 선택 결과</title>
</head>
<body>
	성별 : <%= gender %> <br>
	메일 수신 여부 : <%= chkMail %>
</body>
</html>