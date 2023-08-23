package model;

import java.util.ArrayList;

import Execption.UsuarioIgualExecption;
import Execption.UsuarioNaoEncontradoExeception;
import dao.UsuarioDAO;
import dto.UsuarioDTO;

public class Usuario {
	
	//private static Usuario instaciModel;
	//private UsuarioDTO user;
	private UsuarioDAO instanciDAO;
	
	public Usuario() {
		//user = new UsuarioDTO(); 
		instanciDAO = new UsuarioDAO();
	}
	
//	public static synchronized Usuario getInstaciModel() {
//		if(instaciModel == null) {
//		return	new Usuario();
//		}
//		return instaciModel;
//	}
	
	
	public void userConecteCreat(UsuarioDTO user) {
		try {
		instanciDAO.create(user);
		}catch(UsuarioIgualExecption erro) {
			System.out.println(erro.getMessage());
		}
	}
	
	public UsuarioDTO userConecteRead(UsuarioDTO user)  throws UsuarioNaoEncontradoExeception {
		return instanciDAO.read(user);
		
	}
	
	public ArrayList<UsuarioDTO> usersConecteDisplay() {
		return instanciDAO.getList();
	}

}
