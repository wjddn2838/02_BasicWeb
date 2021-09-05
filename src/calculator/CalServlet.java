package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class CalServlet extends HttpServlet{

	
	public CalServlet() {}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("first-num"));
		int num2 = Integer.parseInt(req.getParameter("second-num"));
		char operator = req.getParameter("operator").charAt(0);
		int result = 0;
		switch(operator) {
		case '+' : result = num1+num2; break;
		case '-' : result = num1-num2; break;
		case '*' : result = num1*num2; break;
		case '/' : result = num1/num2; break;
		}
		//출력
		req.setAttribute("first", num1);
		req.setAttribute("second", num2);
		req.setAttribute("operator", operator);
		req.setAttribute("result", result);
		
		//보내기
		RequestDispatcher view = req.getRequestDispatcher("/calculator/calResult.jsp");
		view.forward(req, resp);
	}
}
