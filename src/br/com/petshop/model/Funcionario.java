package br.com.petshop.model;

import java.util.Date;

public class Funcionario {

   
 private int id;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNascimento() {
	return nascimento;
}
public void setNascimento(String nascimento) {
	this.nascimento = nascimento;
}
public String getUf() {
	return uf;
}
public void setUf(String uf) {
	this.uf = uf;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String nome;
 private String nascimento;
 private String nacionalidade;
 public String getNacionalidade() {
	return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}
private String uf;
 private String sexo;
 private String email;

    
    
}