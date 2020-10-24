package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Area;
import com.exception.ServiciosException;

@Remote
public interface AreaBeanRemote {
	
	void crear(Area area) throws ServiciosException;
	Area leerUno(Long id); 
	List<Area> leerTodos();
	void actualizar(Area area) throws ServiciosException;
	void borrar(Long id) throws ServiciosException;

}
