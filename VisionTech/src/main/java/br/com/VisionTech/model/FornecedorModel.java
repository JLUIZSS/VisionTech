package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="fornecedor",schema ="visiontech")
public class FornecedorModel implements Serializable {
private static final long serialVersionVID =1L;

@Id
@Column(name="id_fornecedor")
private Integer id_fornecedor;
@Column(name="CNPJ")
private Integer CNPJ;
public Integer getId_fornecedor() {
	return id_fornecedor;
}
public void setId_fornecedor(Integer id_fornecedor) {
	this.id_fornecedor = id_fornecedor;
}
public Integer getCNPJ() {
	return CNPJ;
}
public void setCNPJ(Integer cNPJ) {
	CNPJ = cNPJ;
}

}