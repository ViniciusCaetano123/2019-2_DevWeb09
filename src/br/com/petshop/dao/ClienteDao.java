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
	
	public void remove(Cliente cliente){
		try{
			PreparedStatement stmt = this.connection.prepareStatement
			("delete from clientee where id = ?");
			
			stmt.setInt(1, cliente.getId());
			stmt.execute();
			stmt.close();

			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void adiciona(Cliente cliente){
		String sql = "insert into clientee (id,nome, nascimento,nacionalidade , uf, sexo,email) " +
					"values (?, ?, ?, ?,?,?,?)";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getNascimento());
			stmt.setString(4, cliente.getNacionalidade());
			stmt.setString(5, cliente.getUf());
			stmt.setString(6, cliente.getSexo());
			stmt.setString(7, cliente.getEmail());
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException (e);
		}
	}
	
	public int totalCliente() {
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from clientee");
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
	

	
	public void altera(Cliente cliente){
		String sql = "update clientee set nome=? , nascimento=?, nacionalidade=?, uf=?, sexo=?, email=? where id=?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getNascimento());
			stmt.setString(3, cliente.getNacionalidade());
			stmt.setString(4, cliente.getUf());
			stmt.setString(5, cliente.getSexo());
			stmt.setString(6, cliente.getEmail());
			stmt.setLong(7, cliente.getId());
				
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public Cliente buscaPorId(int id){
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from clientee");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{

				if(id == rs.getLong("id"))
				{
					Cliente cliente = new Cliente();

					cliente.setId(rs.getInt("id"));
					cliente.setNome(rs.getString("nome"));
					cliente.setNascimento(rs.getString("nascimento"));
					cliente.setNacionalidade(rs.getString("nacionalidade"));
					cliente.setUf(rs.getString("uf"));
					cliente.setSexo(rs.getString("sexo"));
					cliente.setEmail(rs.getString("email"));
					
					
					return cliente;
				}
			}
				return null;
			}catch(SQLException e){
				throw new RuntimeException(e);
			}	
	}
	
	public List<Cliente> lista(){
		try{
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = this.connection.prepareStatement
			("SELECT * FROM clientee");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setNascimento(rs.getString("nascimento"));
				cliente.setNacionalidade(rs.getString("nacionalidade"));
				cliente.setUf(rs.getString("uf"));
				cliente.setSexo(rs.getString("sexo"));
				cliente.setEmail(rs.getString("email"));
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
