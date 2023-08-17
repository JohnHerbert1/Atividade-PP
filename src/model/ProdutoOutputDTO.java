package model;

import java.time.LocalDate;

public class ProdutoOutputDTO {
	
	private int produtoID;
	private String nome;
	private LocalDate validade;
	
	public int getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(int hashID) {
		this.produtoID = hashID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
		
}
