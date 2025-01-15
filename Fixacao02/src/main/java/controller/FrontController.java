package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConversionStrategy strategy;
       public FrontController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request, response);
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request,response);
	}
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String action = request.getParameter("action");
		String redirect = "ex01.jsp";
		switch(action) {
			case"convert":
				String valueS = request.getParameter("value");
				if(valueS != null) {
					double valueD = Double.parseDouble(valueS);
					String type = request.getParameter("type");
					if(type.equals("celsius")) {
						strategy = new CelsiusStrategy();
						request.setAttribute("response", strategy.conversion(valueD) + "C");
					}else if(type.equals("fahrenheit")) {
						strategy = new FahrenheitStrategy();
						request.setAttribute("response", strategy.conversion(valueD) +"F");
					}
				}else {
					request.setAttribute("response", "Erro, adicione um valor a ser convertido!");
				}
				redirect = "ex01.jsp";
				break;
			case"register":
				StudentSingleton students = StudentSingleton.getInstance();
				String code = request.getParameter("code");
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String[] courses = request.getParameterValues("courses");
	
				if(students.addStudent(code, name, email, courses)) {
					request.setAttribute("code", code);
					request.setAttribute("name", name);
					request.setAttribute("email", email);
					request.setAttribute("courses", courses);
					redirect = "ex02register.jsp";
				}else {
					request.setAttribute("response", "Ja existe um usuario com esse prontuario!");
					redirect = "ex02.jsp";
				}
				break;
			case"relatory":
				StudentSingleton stds = StudentSingleton.getInstance();
				String type = request.getParameter("type");
				List<Student> list;
				if(type.equals("jsb")) {
					list = stds.getJsbList();
				}else if(type.equals("kotlin")) {
					list = stds.getKotlinList();
				}else if(type.equals("jws")) {
					list = stds.getJwsList();
				}else {
					break;
				}
				List<String> codes = new LinkedList<String>(); 
				List<String> names = new LinkedList<String>(); 
				List<String> emails = new LinkedList<String>(); 
				for(int i = 0; i< list.size(); i++) {
					Student std = list.get(i);
					codes.add(std.getCode());
					names.add(std.getName());
					emails.add(std.getEmail());
				}
				request.setAttribute("codes", codes.toArray());
				request.setAttribute("names", names.toArray());
				request.setAttribute("emails", emails.toArray());
				redirect = "ex02relatory.jsp";
				break;
		}
		request.getRequestDispatcher(redirect).forward(request, response);
	}
}
