package com.Myht.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Testservlet
 */
@WebServlet("/Testservlet")
public class Testservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Testservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("gb2312");
		PrintWriter out=resp.getWriter();
		
		out.println("<html>");
		out.println("<head><title>LoggerServlet</title></head>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("<h1>简单过滤器 Servlet</h1>");
		out.println("<b>请求的 URI 为: </b>"+req.getAttribute("URI")+"<br>");
		out.println("<b>请求的 地址  为: </b>"+req.getAttribute("RAddress")+"<br>");
		out.println("<b>请求的主机号  为: </b>"+req.getAttribute("RHost")+"<br>");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
