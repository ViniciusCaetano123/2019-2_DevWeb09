package br.com.petshop.jdbc;
import java.sql.*;
public class ConnectionFactory {
	
	public Connection getConnection() throws ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver");
        try {
        	return DriverManager.getConnection("jdbc:mysql://184.107.94.187/2019-2_DevWeb09", "2019-2_DevWeb09", "2019-2_DevWeb09");
        }catch(SQLException e){
        	System.out.println("Erro de conexao");
			throw new RuntimeException(e+"\nNAO FOI POSSIVEL CONECTAR NO BANCO DE DADOS");
		}
	}
}

