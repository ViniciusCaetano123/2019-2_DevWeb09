package br.com.petshop.dao;

import java.sql.SQLException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.petshop.model.Cliente;
import br.com.petshop.model.Usuario;



@Repository
public class ConsultaDAO {
	Connection connection;
	
	@Autowired
	public ConsultaDAO(DataSource dataSource) throws ClassNotFoundException{
		try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
	
	
	public int totalConsulta() {
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from consulta");
			ResultSet rs = stmt.executeQuery();
			int i =0;
			while(rs.next())
			{

				i++;
			}
				return i;
			}catch(SQLException e){
				throw new RuntimeException(e);
			}	
	}
	
	

}
