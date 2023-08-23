package dto;

import java.time.LocalDate;


public class ProdutoDTO {
	private String nome;
	private int produtoID;
	private LocalDate validade;
	private int valor;
	
	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(String nome,int productID,LocalDate validade,int valor) {
		setNome(nome);
		setProdutoID(productID);
		setValidade(validade);
		setValor(valor);
	}
	
	public String toString() {
		return "Produto: " + nome + " ProdutoID: " + produtoID + " Valor: " + valor;
	}
	
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(int produtoID) {
		this.produtoID = produtoID;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	
	
	
	
	
}
