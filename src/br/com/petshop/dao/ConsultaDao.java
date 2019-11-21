package br.com.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.petshop.model.Consulta;

@Repository
public class ConsultaDao {
Connection connection;
	
	@Autowired
	public ConsultaDao(DataSource dataSource) throws ClassNotFoundException{
		try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
	public void adiciona(Consulta consulta){
		String sql = "insert into consulta (idCliente,idFuncionario,servico,data) " +
					"values (?, ?, ?, ?)";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, consulta.getIdCliente());
			stmt.setInt(2, consulta.getIdFuncionario());
			stmt.setString(3, consulta.getServico());
			stmt.setString(4, consulta.getData());
		
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException (e);
		}
	}
	public int totalConsultas() {
		try{
			PreparedStatement stmt = this.connection.prepareStatement("SELECT consulta.idCliente,consulta.idFuncionario,cliente.nome, funcionario.nome, consulta.servico, consulta.Data, consulta.id FROM consulta join cliente on cliente.id = consulta.idCliente join funcionario on funcionario.id = consulta.idFuncionario;");
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
	
	public void altera(Consulta consulta){
		String sql = "update consulta set  idCliente=?,idFuncionario=?, servico=?, Data=? where id=?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setInt(1, consulta.getIdCliente());
			stmt.setInt(2, consulta.getIdFuncionario());
			stmt.setString(3, consulta.getServico());
			stmt.setString(4, consulta.getData());
			stmt.setInt(5, consulta.getId());
		
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
public Consulta buscaPorId(int id){
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement("SELECT consulta.idCliente,consulta.idFuncionario,cliente.nome, funcionario.nome, consulta.servico, consulta.Data, consulta.id FROM consulta join cliente on cliente.id = consulta.idCliente join funcionario on funcionario.id = consulta.idFuncionario;");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{

				if(id == rs.getLong("id"))
				{
					Consulta consulta = new Consulta();

					consulta.setId(rs.getInt("id"));
					consulta.setIdCliente(rs.getInt("idCliente"));
					consulta.setIdFuncionario(rs.getInt("idFuncionario"));
					consulta.setServico(rs.getString("servico"));
					consulta.setData(rs.getString("Data"));
					
					
					return consulta;
				}
			}
				return null;
			}catch(SQLException e){
				throw new RuntimeException(e);
			}	
	}
	
	public List<Consulta> lista(){
		try{
			List<Consulta> consultas = new ArrayList<Consulta>();
			PreparedStatement stmt = this.connection.prepareStatement
			("SELECT consulta.idCliente,consulta.idFuncionario,cliente.nome, funcionario.nome, consulta.servico, consulta.Data, consulta.id FROM consulta join cliente on cliente.id = consulta.idCliente join funcionario on funcionario.id = consulta.idFuncionario;");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Consulta consulta = new Consulta();
				
				consulta.setId(rs.getInt("id"));
				consulta.setIdCliente(rs.getInt("idCliente"));
				consulta.setIdFuncionario(rs.getInt("idFuncionario"));
				consulta.setServico(rs.getString("servico"));
				consulta.setData(rs.getString("Data"));
				consultas.add(consulta);
			}
			rs.close();
			stmt.close();
			return consultas;	
			}catch(SQLException e){
				throw new RuntimeException(e);
		}
	}
	
	public void remove(Consulta consulta){
		try{
			PreparedStatement stmt = this.connection.prepareStatement
			("delete from consulta where id = ?");
			
			stmt.setInt(1, consulta.getId());
			stmt.execute();
			stmt.close();

			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
}
