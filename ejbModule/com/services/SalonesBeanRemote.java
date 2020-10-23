package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Salon;

@Remote
public interface SalonesBeanRemote {
	
	void crear(Salon salon);
	Salon leerUno(Long id); 
	List<Salon> leerTodos();
	void actualizar(Salon salon);
	void borrar(Long id);

}
