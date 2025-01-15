package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserSingleton {
	private static UserSingleton instance;
	private Map<String, User> users;
	
	
	private UserSingleton() {
		users = new HashMap();
	}
	
	public static UserSingleton getInstance() {
		if(instance == null) {
			instance = new UserSingleton();
		}
		return instance;
	}
	
	public void addUser(String name, String password) {
		if(!checkUser(name)) {
			users.put(name, new User(name, password));
		}
		
	}
	public boolean checkUser(String name) {
		if(users.containsKey(name)) {
			return true;
		}
		return false;
	}
	public User getUser(String name) {
		return users.get(name);
	}
	public boolean login(String name, String password) {
		if(users.containsKey(name)) {
			User us = users.get(name);
			if(us.getPassword().equals(password)) {
				us.registerLogin(new Date().toString());
				return true;
			}
		}
		return false;
	}
}
