package model;

import java.util.LinkedList;
import java.util.List;

public class User {
	
	String name;
	String password;
	List<String> logins;
	
	public User(String name, String password) {
		setName(name);
		setPassword(password);
		logins = new LinkedList<String>();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}

	public List<String> getLogins() {
		return logins;
	}

	public void registerLogin(String time) {
		logins.add(time);
	}
}
