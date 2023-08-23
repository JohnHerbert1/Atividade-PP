package dao;

import java.util.ArrayList;

import Execption.ProducteNotFoudExecption;
import Execption.ProdutoIgualExecption;
import dto.ProdutoDTO;


public class ProdutoDAO implements CrudDAO<ProdutoDTO> {

	private ArrayList<ProdutoDTO> todosOsProdutos;

	
	public ProdutoDAO() {
		this.todosOsProdutos = new ArrayList<>();
	}
	
	@Override
	public ArrayList<ProdutoDTO> getList() {
		return todosOsProdutos;
	}

	@Override
	public boolean create(Object object) throws ProdutoIgualExecption {
		ProdutoDTO produtoDTO = (ProdutoDTO) object;
		for(int i = 0; i < todosOsProdutos.size();i++) {
			if(todosOsProdutos.get(i).getNome().equals(produtoDTO.getNome())) {
				throw new ProdutoIgualExecption();
			}
		}
		todosOsProdutos.add(produtoDTO);
		return true;
	}

	@Override
	public ProdutoDTO read(Object object) throws ProducteNotFoudExecption {
		ProdutoDTO producteDTO = (ProdutoDTO) object;
		for(int i = 0; i < todosOsProdutos.size();i++) {
			if(todosOsProdutos.get(i).getNome().equals(producteDTO.getNome())) {
				return todosOsProdutos.get(i);
			}
		}
		throw new ProducteNotFoudExecption();
	}

	@Override
	public boolean update(Object object) {
		return true;
	}

	@Override
	public void delect(Object object) {
		
	}
}