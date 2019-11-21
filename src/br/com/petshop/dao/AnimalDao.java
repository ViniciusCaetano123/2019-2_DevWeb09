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

import br.com.petshop.model.Animal;
import br.com.petshop.model.Funcionario;
import br.com.petshop.model.Usuario;



@Repository
public class AnimalDao {
	Connection connection;
	
	@Autowired
	public AnimalDao(DataSource dataSource) throws ClassNotFoundException{
		try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
    public void remove(Animal animal){
		try{
			PreparedStatement stmt = this.connection.prepareStatement
			("delete from animal where id = ?");
			
			stmt.setInt(1, animal.getId());
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
    
	public void adiconar(Animal animal){
		String sql = "insert into animal (nome,porte,raca,sexo,idDono)	values(?,?,?,?,?)";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, animal.getNome());
			stmt.setString(2, animal.getPorte());
			stmt.setString(3, animal.getRaca());
			stmt.setString(4, animal.getSexo());
			stmt.setInt(5, animal.getIdDono());
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException (e);
		}
	}
	
	public int totalFuncionario(){
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from animal");
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

	public void altera(Animal animal){
		String sql = "update animal set nome=?,porte=?,raca=?,sexo=?,idDono=? where id=?";
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, animal.getNome());
			stmt.setString(2, animal.getPorte());
			stmt.setString(3, animal.getRaca());
			stmt.setString(4, animal.getSexo());
			stmt.setInt(5, animal.getIdDono());
			stmt.setLong(6, animal.getId());
				
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public List<Animal> lista(){
		try{
			List<Animal> animais = new ArrayList<Animal>();
			PreparedStatement stmt = this.connection.prepareStatement
			("select animal.id,animal.idDono, animal.nome,animal.porte,animal.raca,animal.sexo from "
					+ "animal join cliente on animal.idDono = cliente.id");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Animal animal = new Animal();
				
				animal.setId(rs.getInt("id"));
				animal.setIdDono(rs.getInt("idDono"));
				animal.setNome(rs.getString("nome"));
				animal.setPorte(rs.getString("porte"));
				animal.setRaca(rs.getString("raca"));
				animal.setSexo(rs.getString("sexo"));
			
				
				animais.add(animal);
			}
			rs.close();
			stmt.close();
			return animais;	
			}catch(SQLException e){
				throw new RuntimeException(e);
		}
	}
	public Animal buscaPorId(int id){
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from animal");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{

				if(id == rs.getLong("id"))
				{
					Animal animal = new Animal();

					animal.setId(rs.getInt("id"));
					animal.setNome(rs.getString("nome"));
					animal.setPorte(rs.getString("porte"));
					animal.setRaca(rs.getString("raca"));
					animal.setSexo(rs.getString("sexo"));
					animal.setIdDono(rs.getInt("idDono"));
					
					
					return animal;
				}
			}
				return null;
			}catch(SQLException e){
				throw new RuntimeException(e);
			}	
	}
}