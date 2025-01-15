package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;
import model.UserSingleton;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class LoginHistoryServlet
 */
@WebServlet("/LoginHistoryServlet")
public class LoginHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserSingleton us = UserSingleton.getInstance();   

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginHistoryServlet() {
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
		HttpSession session = request.getSession(false);
		if(session == null) {
			response.sendRedirect("login.jsp");
		}else {
			String name = (String) session.getAttribute("name");
			User user = us.getUser(name);
			List<String> logins = user.getLogins();
			request.setAttribute("logins", logins);
			request.getRequestDispatcher("history.jsp").forward(request, response);

		}
	}
}
