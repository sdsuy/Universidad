package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Area;

@Remote
public interface AreaBeanRemote {
	
	void crear(Area area);
	Area leerUno(Long id); 
	List<Area> leerTodos();
	void actualizar(Area area);
	void borrar(Long id);

}
