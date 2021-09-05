<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//	String userName = request.getParameter("person-name");
//	String userColor = request.getParameter("color");
//	String userPet = request.getParameter("pet");
//	String [] userFood = request.getParameterValues("food");
	String userName = (String)request.getAttribute("userName");
	String userColor = (String)request.getAttribute("userColor");
	String userPet = (String)request.getAttribute("userPet");
	String [] userFoods = (String [])request.getAttribute("userFoods");
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>취향 테스트 결과</title>
</head>
<body>
	<h2>개인 취향 테스트 결과화면</h2>
	<span><%= userName %>님의 개인취향은 </span> 
	<%
		if(userColor.equals("red")) {
	%>
		<span style='color:red;'>빨간색</span>을 좋아하고
	<%
		}else if(userColor.equals("blue")) {
	%>
		<span style='color:blue;'>파란색</span>을 좋아하고
	<%
		}else if(userColor.equals("yellow")) {
	%>
		<span style='color:yellow;'>노란색</span>을 좋아하고
	<%
		}else if(userColor.equals("green")) {
	%>
		<span style='color:green;'>초록색</span>을 좋아하고
	<%
		}
	%>
	<%
		if(userPet.equals("puppy")) {
	%>
			강아지를 좋아합니다.
	<%
		}else if(userPet.equals("kitty")) {
	%>
			고양이를 좋아합니다.
	<%
		}else if(userPet.equals("bird")) {
	%>
			새를 좋아합니다.
	<%
		}else if(userPet.equals("chick")) {
	%>	
			병아리를 좋아합니다.
	<%
		}
	%>	
	좋아하는 음식은
	<%
		for(String food : userFoods) {
			if(food.equals("zzazang")) {
	%>
				짜장면,
	<%
			}else if(food.equals("jjam")) {
	%>
				짬뽕,
	<%
			}else if(food.equals("tang")) {
	%>
				탕수육,
	<%
			}else if(food.equals("yang")) {
	%>
				양장피,
	<%
			}else if(food.equals("pal")) {
	%>
				팔보채,
	<%
			}
		}
	%>
	입니다.

	
</body>
</html>