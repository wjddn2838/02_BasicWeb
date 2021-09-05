package checkbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class CheckBoxServlet extends HttpServlet{

	public CheckBoxServlet() {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.getParameter("place");
		String [] places = req.getParameterValues("place");		
		
		//출력
		req.setAttribute("places", places);
		
		//보내기
		RequestDispatcher view = req.getRequestDispatcher("/checkbox/checkboxResult.jsp");
		view.forward(req, resp);
		
//		resp.setCharacterEncoding("UTF-8");//한글인식할 수 있게 하는것
//		resp.setContentType("text/html; charset=UTF-8");//한글인식할 수 있게 하는것
//		PrintWriter out = resp.getWriter();
//		out.println("<html><head><title>관광지 선택결과</title>");
//		out.println("<style>h2{color : red;}</style></head>");
//		out.println("<body><h2>당신이 선택한 관광지입니다.</h2><hr>");
//		for(String place : places) {
//			out.println("선택한 장소는 : " + place+"<br>");
//		}
//		out.println("</body></html>");
	}
}
