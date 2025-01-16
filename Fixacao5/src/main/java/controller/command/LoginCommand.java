package controller.command;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.cypher.Cypher;
import model.dao.DatabaseUserDao;

public class LoginCommand implements Command{
	
	private DatabaseUserDao base = new DatabaseUserDao();

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		senha = Cypher.cypher(senha);
		if(senha.equals(base.get(email))) {
			HttpSession session = request.getSession();
			session.setAttribute("user", email);
			session.setMaxInactiveInterval(5 * 60);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		return null;
	}

}
