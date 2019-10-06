package br.com.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.petshop.jdbc.ConnectionFactory;
import br.com.petshop.model.Usuario;

public class LoginDAO {
	
	Connection connection;
	
	public LoginDAO() throws ClassNotFoundException{
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public boolean existeUsuario(Usuario usuario){
		
			String sql = "select * from usuarios where login= ? and senha = MD5(?)";
			
			try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			
			ResultSet rs = stmt.executeQuery();
			
			stmt.execute();
			
			if(rs.next())
			{
				stmt.close();
				return true;
			}
			else
			{
				stmt.close();
				return false;
			}
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
}
