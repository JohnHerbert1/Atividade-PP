package control;

import java.time.LocalDate;

import Execption.ProducteNotFoudExecption;
import dto.ProdutoDTO;
import model.Produto;
import view.ProgramaView;

public class ProdutoControler {
	
	private static	ProdutoControler instanciProdutoCTL;
	private Produto produtoModel;
	private ProgramaView view;
	
	public ProdutoControler() {
		this.produtoModel = new Produto();
		this.view = new ProgramaView();
	}
	
	public static ProdutoControler getProdutoControlerInstaci() {
		if(instanciProdutoCTL == null) {
			return new ProdutoControler();
		}
		return instanciProdutoCTL;
	}
	
	public void creatProduct(String nome,int ID,LocalDate validade,int valor) {
		ProdutoDTO produtoDTO = new ProdutoDTO(nome,ID,validade,valor);
		produtoModel.applyTarifa(produtoDTO);
		produtoModel.productConectCreate(produtoDTO);
	}
	
	public void displayAllProduct() {
		view.displayProducts(produtoModel.productConectDisplay());
	}
	
	public void displayProducte(ProdutoDTO produto) {
	try {
		view.displayProducte(produtoModel.producteConectRead(produto));
	}catch (ProducteNotFoudExecption erro) {
		System.out.println(erro);
	}
		
	}
	
}
