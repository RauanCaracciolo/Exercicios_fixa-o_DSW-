package model.entity;

public class Usuario {
	private String completeName;
	private String email;
	private String senha;
	
	
	
	public Usuario(String completeName, String email, String senha) {
		super();
		this.completeName = completeName;
		this.email = email;
		this.senha = senha;
	}
	public String getCompleteName() {
		return completeName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
