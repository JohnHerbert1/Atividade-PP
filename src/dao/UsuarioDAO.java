package dao;

import java.util.ArrayList;

import Execption.UsuarioIgualExecption;
import Execption.UsuarioNaoEncontradoExeception;
import dto.UsuarioDTO;

public class UsuarioDAO implements CrudDAO<UsuarioDTO> {
	
//	private static UsuarioDAO instaciDAO;
	private ArrayList<UsuarioDTO> todosOsUsuarioDTOs;

	public UsuarioDAO() {
		todosOsUsuarioDTOs = new ArrayList<UsuarioDTO>();
	}

	
	public ArrayList<UsuarioDTO> getList() {
		return  todosOsUsuarioDTOs;
	}

	@Override
	public boolean create(Object object) throws UsuarioIgualExecption {
		UsuarioDTO user = (UsuarioDTO) object;
		for(int i = 0; i < todosOsUsuarioDTOs.size();i++) {
			if(todosOsUsuarioDTOs.get(i).getNome().equals(user.getNome())) {
				throw new UsuarioIgualExecption();
			}
		}
		todosOsUsuarioDTOs.add(user);	
		return true;
		
	}

	@Override
	public UsuarioDTO read(Object users) throws UsuarioNaoEncontradoExeception {  
		UsuarioDTO user = (UsuarioDTO) users;
		for(int i = 0; i < todosOsUsuarioDTOs.size();i++) {
			if(todosOsUsuarioDTOs.get(i).getNome().equals(user.getNome())) {
				return todosOsUsuarioDTOs.get(i);
			}
		}
		
		throw new UsuarioNaoEncontradoExeception();
		
	
	}

	@Override
	public boolean update(Object object) {
		UsuarioDTO user = (UsuarioDTO) object;
		return true;
		
	}

	@Override
	public void delect(Object object) {
		
	}

}
