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
public class ClienteDao {
	Connection connection;
	
	@Autowired
	public ClienteDao(DataSource dataSource) throws ClassNotFoundException{
		try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
	
	public int totalCliente() {
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select count(cliente.id) from cliente");
			ResultSet rs = stmt.executeQuery();
			
			return 1;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}	
	}
	public List<Cliente> lista(){
		try{
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = this.connection.prepareStatement
			("SELECT * FROM cliente");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setNascimento(rs.getDate("datanascimento"));
				cliente.setNacionalidade(rs.getString("nacionalidade"));
				cliente.setUf(rs.getString("uf"));
				cliente.setSexo(rs.getString("sexo"));
				clientes.add(cliente);
			}
			rs.close();
			stmt.close();
			return clientes;	
			}catch(SQLException e){
				throw new RuntimeException(e);
		}
	}
	

}
