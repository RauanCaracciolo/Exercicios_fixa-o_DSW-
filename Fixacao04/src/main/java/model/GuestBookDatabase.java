package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GuestBookDatabase {

	private static GuestBookDatabase instance;
	List<String> users;
	List<String> msgs;
	List<String> datas;
	
	private GuestBookDatabase() {
		users = new LinkedList<String>();
		msgs = new LinkedList<String>();
		datas  = new LinkedList<String>();
	}
	
	public static GuestBookDatabase getInstance() {
		if(instance == null) {
			instance = new GuestBookDatabase();
		}
		return instance;
	}
	public void add(String user, String msg) {
		users.add(user);
		msgs.add(msg);
		datas.add(new Date().toString());
	}

	public List<String> getUsers() {
		return users;
	}

	public List<String> getMsgs() {
		return msgs;
	}

	public List<String> getDatas() {
		return datas;
	}

	
}
