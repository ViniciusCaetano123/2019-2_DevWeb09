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

import br.com.petshop.model.Cliente;
import br.com.petshop.model.Funcionario;

@Repository
public class FuncionarioDAO {
Connection connection;
	
	@Autowired
	public FuncionarioDAO(DataSource dataSource) throws ClassNotFoundException{
		try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
				funcionario.setNacionalidade(rs.getString("nacionalidade"));
				funcionario.setDataNasc(rs.getString("dataNasc"));
				funcionario.setCpf(rs.getString("cpf"));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setDataNasc(rs.getString("dataNasc"));
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
