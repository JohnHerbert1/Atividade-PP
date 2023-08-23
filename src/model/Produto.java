package model;

import java.util.ArrayList;

import Execption.ProducteNotFoudExecption;
import Execption.ProdutoIgualExecption;
import dao.ProdutoDAO;
import dto.ProdutoDTO;

public class Produto {
	
	private ProdutoDAO produtoDAO;
	
	public Produto() {
		produtoDAO = new ProdutoDAO();
	}
	
	public void productConectCreate(ProdutoDTO produtoDTO) {
		try {
		produtoDAO.create(produtoDTO);
		}catch(ProdutoIgualExecption erro) {
			System.out.println(erro);
		}
	}

	public ArrayList<ProdutoDTO> productConectDisplay() {
		  return produtoDAO.getList();
	}
	
	public ProdutoDTO producteConectRead(ProdutoDTO produtoRead) throws ProducteNotFoudExecption {
		return produtoDAO.read(produtoRead);
	}
	
	public void  applyTarifa(ProdutoDTO produto) {
		 int tarifa = (int) (produto.getValor() * 0.5f);
		 produto.setValor(tarifa); 
	}
	
}
