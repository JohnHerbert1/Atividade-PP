package control;

import Execption.UsuarioNaoEncontradoExeception;
import dto.UsuarioDTO;
import model.Usuario;
import view.ProgramaView;

public class UsuarioControler {
	
	private static UsuarioControler instaciControler;
	private Usuario usuarioModel;
	private ProgramaView view;
	
	public UsuarioControler() {
		usuarioModel = new Usuario();
		view = new ProgramaView();
	}
	
	public static UsuarioControler getInstaciControler() {
		if(instaciControler == null) {
	    return	new UsuarioControler();
		}
		
		return instaciControler;
	}
	
	public void creatUser(String nome,int idade,int hashID) {
		UsuarioDTO user = new UsuarioDTO(nome,idade,hashID);
		usuarioModel.userConecteCreat(user);
	}
	
	public void readUser(UsuarioDTO user) {
		try {	
			view.displayUser(usuarioModel.userConecteRead(user));
		}catch(UsuarioNaoEncontradoExeception erro) {
			System.out.println(erro);
		}
	}
	
	public void displayViewUsers() {
		view.displayUsers(usuarioModel.usersConecteDisplay());
	}
	
}
