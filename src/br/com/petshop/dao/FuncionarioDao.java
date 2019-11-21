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

import br.com.petshop.model.Funcionario;
import br.com.petshop.model.Usuario;



@Repository
public class FuncionarioDao {
	Connection connection;
	
	@Autowired
	public FuncionarioDao(DataSource dataSource) throws ClassNotFoundException{
		try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
	
	public void remove(Funcionario funcionario){
		try{
			PreparedStatement stmt = this.connection.prepareStatement
			("delete from funcionario where id = ?");
			
			stmt.setInt(1, funcionario.getId());
			stmt.execute();
			stmt.close();

			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void adiciona(Funcionario funcionario){
		String sql = "insert into funcionario (id,nome, nascimento,nacionalidade , uf, sexo,email) " +
					"values (?, ?, ?, ?,?,?,?)";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, funcionario.getId());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getNascimento());
			stmt.setString(4, funcionario.getNacionalidade());
			stmt.setString(5, funcionario.getUf());
			stmt.setString(6, funcionario.getSexo());
			stmt.setString(7, funcionario.getEmail());
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException (e);
		}
	}
	
	public int totalFuncionario() {
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionario");
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
	

	
	public void altera(Funcionario funcionario){
		String sql = "update funcionario set nome=? , nascimento=?, nacionalidade=?, uf=?, sexo=?, email=? where id=?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getNascimento());
			stmt.setString(3, funcionario.getNacionalidade());
			stmt.setString(4, funcionario.getUf());
			stmt.setString(5, funcionario.getSexo());
			stmt.setString(6, funcionario.getEmail());
			stmt.setLong(7, funcionario.getId());
				
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public Funcionario buscaPorId(int id){
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionario");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{

				if(id == rs.getLong("id"))
				{
					Funcionario funcionario = new Funcionario();

					funcionario.setId(rs.getInt("id"));
					funcionario.setNome(rs.getString("nome"));
					funcionario.setNascimento(rs.getString("nascimento"));
					funcionario.setNacionalidade(rs.getString("nacionalidade"));
					funcionario.setUf(rs.getString("uf"));
					funcionario.setSexo(rs.getString("sexo"));
					funcionario.setEmail(rs.getString("email"));
					
					
					return funcionario;
				}
			}
				return null;
			}catch(SQLException e){
				throw new RuntimeException(e);
			}	
	}
	
	public List<Funcionario> lista(){
		try{
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = this.connection.prepareStatement
			("SELECT * FROM funcionario");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Funcionario funcionario = new Funcionario();
				
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setNascimento(rs.getString("nascimento"));
				funcionario.setNacionalidade(rs.getString("nacionalidade"));
				funcionario.setUf(rs.getString("uf"));
				funcionario.setSexo(rs.getString("sexo"));
				funcionario.setEmail(rs.getString("email"));
				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();
			return funcionarios;	
			}catch(SQLException e){
				throw new RuntimeException(e);
		}
	}
	

}