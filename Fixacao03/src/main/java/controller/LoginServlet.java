package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.UserSingleton;

import java.io.IOException;
import java.util.Date;

import org.apache.tomcat.jakartaee.bcel.classfile.Constant;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserSingleton us = UserSingleton.getInstance();   

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	 
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(us.login(name, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			session.setAttribute("time", new Date().toString());
			session.setMaxInactiveInterval(5 * 60);
			
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("response", "erro no login! tente novamente.");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}
	}
}
