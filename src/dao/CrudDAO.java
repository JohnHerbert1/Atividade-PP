package dao;

import java.util.ArrayList;

public interface CrudDAO <t> {
	
	ArrayList<t> getList();
	
	public boolean create(Object object) throws Exception;
	
	public Object read(Object object) throws Exception;
	
	public boolean update(Object object) throws Exception;
	
	public void delect(Object object);
	
}
