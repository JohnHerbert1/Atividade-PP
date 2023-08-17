package dao;

import pojo.Usuario;

public interface CrudUsersDAO {
	
	public Usuario createUser(Usuario users);
	
	public Usuario readUser(Usuario user);
	
	public Usuario updateUser(Usuario users);
	
	public void deleteUser(Usuario user);
	
}
