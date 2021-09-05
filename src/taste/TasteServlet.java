package taste;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/taste")
public class TasteServlet extends HttpServlet {

	public TasteServlet() {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("person-name");
		String userColor = req.getParameter("color");
		String userPet = req.getParameter("pet");
		String [] userFood = req.getParameterValues("food");//여러개를 가져오기 때문에 배열에 넣어준다.
		
		req.setAttribute("userName", userName);
		req.setAttribute("userColor", userColor);
		req.setAttribute("userPet", userPet);
		req.setAttribute("userFoods", userFood);
		
		req.getRequestDispatcher("/taste/personTasteResult.jsp").forward(req, resp);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>취향테스트 결과</title></head>");
		out.println("<body><h2>개인취향테스트 결과화면</h2>");
		out.println(userName+"님의 개인취향은");
		if(userColor.equals("red")) {
			out.println("<span style='color:red;'>빨간색</span>을 좋아하고");	
		}else if(userColor.equals("blue")) {
			out.println("<span style='color:blue;'>파란색</span>을 좋아하고");
		}else if(userColor.equals("yellow")) {
			out.println("<span style='color:yellow;'>노란색</span>을 좋아하고");
		}else if(userColor.equals("green")) {
			out.println("<span style='color:green;'>초록색</span>을 좋아하고");
		}
		
		if(userPet.equals("puppy")) {
			out.println("강아지를 좋아합니다.");
		}else if(userPet.equals("kitty")) {
			out.println("고양이를 좋아합니다.");
		}else if(userPet.equals("bird")) {
			out.println("새를 좋아합니다.");
		}else if(userPet.equals("chick")) {
			out.println("병아리를 좋아합니다.");
		}
		out.println("좋아하는 음식은");
		for(String food : userFood) {
			if(food.equals("zzazang")) {
				out.println("짜장면,");
			}else if(food.equals("jjam")) {
				out.println("짬뽕,");
			}else if(food.equals("tang")) {
				out.println("탕수육,");
			}else if(food.equals("yang")) {
				out.println("양장피,");
			}else if(food.equals("pal")) {
				out.println("팔보채,");
			}
		}
		out.println("입니다.");
	}
}
