package model.dao;

import java.sql.SQLException;

import model.dao.conection.UserDatabaseConection;
import model.entity.Usuario;

public class DatabaseUserDao implements UserDao{
	@Override
	public boolean create(Usuario user) {
		if(user != null) {
			var sql = "INSERT INTO Usuario(nome, email, senha) VALUES(?, ?, ?)";
			int rows = -1;
			try{
				var connection = UserDatabaseConection.getConnection();
				var statement = connection.prepareStatement(sql);
				statement.setString(1, user.getCompleteName());
				statement.setString(2, user.getEmail());
				statement.setString(3, user.getSenha());
				
				rows = statement.executeUpdate();
				
				statement.close();
				connection.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			return rows >0;
					
		}else {
			return false;
		}
	}
	public String get(String email) {
		var sql = "SELECT senha FROM Usuario WHERE email = ?";
		try {
			var connection = UserDatabaseConection.getConnection();
			var statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			
			try(var result = statement.executeQuery()){
				if(result.next()) {
					return result.getString("senha");
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

}
