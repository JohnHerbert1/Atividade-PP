package dao;

import pojo.Produto;
import pojo.Usuario;

public interface CrudProdutoDAO {
	
	public Produto creatProduct(Produto produto);
	
	public Produto readProduct(Produto produto);
	
	public Produto updateProduct(Produto produto);
	
	public void deleteProduct(Produto produto);
	
	

}
