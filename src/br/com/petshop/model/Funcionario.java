package br.com.petshop.model;

import java.util.Date;

public class Funcionario {

   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdAi() {
		return idAi;
	}

	public void setIdAi(int idAi) {
		this.idAi = idAi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

private int id;
   private int idAi;
   private String nome;
   private String cpf;
   private String telefone;
   private String nacionalidade;
   private String email;
   private String dataNasc;
   
   public Funcionario(){
	   this.idAi++;
	   this.id = this.idAi;
   }
   
   
   
    

    
    
}