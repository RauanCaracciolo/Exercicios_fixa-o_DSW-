package controller.command;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.cypher.Cypher;
import model.dao.DatabaseUserDao;
import model.entity.Usuario;

public class RegisterCommand implements Command {
	
	private DatabaseUserDao base = new DatabaseUserDao();
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String nome = request.getParameter("completeName");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		try {
			base.create(new Usuario(nome, email, Cypher.cypher(senha)));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		response.sendRedirect("index.jsp");
		return null;
	}
}