package view;

import java.util.ArrayList;
import dto.ProdutoDTO;
import dto.UsuarioDTO;

public class ProgramaView {
	
//	private static ProgramaView instaciView;
//	private Usuario usuarioModel = Usuario.getInstaciModel();
	
//	public ProgramaView() {
//		
//	}
	
//	public static ProgramaView getInstaciView() {
//		if(instaciView == null) {
//			return new ProgramaView();
//		}
//		
//		return instaciView;
//	}
	
	
	public void displayUsers(ArrayList<UsuarioDTO> users) {
		System.out.println("All Users:");
		System.out.println("-------------------------");
		for(UsuarioDTO user: users ) {
			System.out.println(user);
		}
		System.out.println("-----------FIM-----------");
	}
	
	public void displayProducts(ArrayList<ProdutoDTO> products) {
		System.out.println("All Products:");
		System.out.println("-------------------------");
		for(ProdutoDTO product : products) {
			System.out.println(product);			
		}
		System.out.println("-----------FIM-----------");

	}
	
	public void displayUser(UsuarioDTO user) {
		System.out.println("User especifico: ");
		System.out.println("");
		System.out.println(user);
		System.out.println("---------------------------");
		System.out.println("");
		
	}
	
	public void displayProducte(ProdutoDTO produto) {
		System.out.println("Producte especifico: ");
		System.out.println("");
		System.out.println(produto);
		System.out.println("---------------------------");
		System.out.println("");
	}

}
