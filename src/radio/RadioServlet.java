package radio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/radio")
public class RadioServlet extends HttpServlet{

	public RadioServlet() {}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String gender = req.getParameter("gender");
		String chkMail = req.getParameter("chk-mail");
		
		req.setAttribute("gender12", gender);
		req.setAttribute("chkMail", chkMail);
		
		req.getRequestDispatcher("/radio/radioResult.jsp").forward(req, resp);
		
//		resp.setCharacterEncoding("UTF-8");
//		resp.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = resp.getWriter();
//		out.println("성별 : "+ gender+"<br>");
//		out.println("메일 수신 여부: "+ chkMail);
		//성별 : F
		
	}
}
