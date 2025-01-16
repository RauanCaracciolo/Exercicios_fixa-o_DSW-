package controller.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CommandFactory {
	public static Command getCommand(String action, HttpServletRequest request, HttpServletResponse response) {
		if(action == null || action.isEmpty()) {
			return new DefaultCommand();
		}else {
			switch(action) {
				case "login":{
					return new LoginCommand();
				}
				case "logout":{
					return new LogoutCommand();
				}
				case "register":{
					return new RegisterCommand();
				}
				default:{
					return new DefaultCommand();
					}
				}
		}	
	}
}
		