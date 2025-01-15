package model;

public class Student {

	private String code;
	private String name;
	private String email;
	private String[] courses;
	
	public Student(String code, String name, String email, String[] courses) {
		setCode(code);
		setName(name);
		setEmail(email);
		setCourses(courses);
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
}
