package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="cadastro",schema ="visiotech")
public class CadastroModel implements Serializable {
private static final long serialVersionVID =1L;

@Id
@Column(name="nome")
private Integer Nome;
@Column(name="email")
private Integer email;
@Column(name="senha")
private Integer senha;
@Column(name="repitasenha")
private Integer repitasenha;
@Column(name="usuario")
private Integer usuario;
public Integer getNome() {
	return Nome;
}
public void setNome(Integer nome) {
	Nome = nome;
}
public Integer getEmail() {
	return email;
}
public void setEmail(Integer email) {
	this.email = email;
}
public Integer getSenha() {
	return senha;
}
public void setSenha(Integer senha) {
	this.senha = senha;
}
public Integer getRepitasenha() {
	return repitasenha;
}
public void setRepitasenha(Integer repitasenha) {
	this.repitasenha = repitasenha;
}
public Integer getUsuario() {
	return usuario;
}
public void setUsuario(Integer usuario) {
	this.usuario = usuario;
}



}

