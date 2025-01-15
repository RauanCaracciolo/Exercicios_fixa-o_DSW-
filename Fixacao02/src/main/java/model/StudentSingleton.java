package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentSingleton {

	private static StudentSingleton instance;
	
	private Map<String, Student> students;
	private List<Student> jsbList;
	private List<Student> kotlinList;
	private List<Student> jwsList;
	
	public List<Student> getJsbList() {
		return jsbList;
	}

	public void setJsbList(List<Student> jsbList) {
		this.jsbList = jsbList;
	}

	public List<Student> getKotlinList() {
		return kotlinList;
	}

	public void setKotlinList(List<Student> kotlinList) {
		this.kotlinList = kotlinList;
	}

	public List<Student> getJwsList() {
		return jwsList;
	}

	public void setJwsList(List<Student> jwsList) {
		this.jwsList = jwsList;
	}

	private StudentSingleton() {
		students = new HashMap();
		jsbList = new LinkedList();
		kotlinList = new LinkedList();
		jwsList = new LinkedList();
	}
	
	public static StudentSingleton getInstance() {
		if(instance == null) {
			instance = new StudentSingleton();
		}
		return instance;
	}
	
	public boolean addStudent(String code, String name, String email, String[] courses) {
		if(!students.containsKey(code)) {
			Student std = new Student(code, name, email, courses);
			students.put(code, std);
			for(int i = 0; i < courses.length; i++) {
				switch(courses[i]) {
				case"jsb":
					jsbList.add(std);
					break;
				case"kotlin":
					kotlinList.add(std);
					break;
				case"jws":
					jwsList.add(std);
					break;
				}
			}
			return true;
		}
		return false;
	}
	public Student getStudent(String code) {
		if(students.containsKey(code)) {
			return students.get(code);
		}
		return null;
	}
}
