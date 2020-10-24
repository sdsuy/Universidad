package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Salon;
import com.exception.ServiciosException;

@Remote
public interface SalonesBeanRemote {
	
	void crear(Salon salon) throws ServiciosException;
	void actualizar(Salon salon) throws ServiciosException;
	void borrar(Long id) throws ServiciosException;
	List<Salon> obtenerUno(String filtro); 
	List<Salon> obtenerTodos();
	
	void asignarArea(Long idSalon, Long idArea) throws ServiciosException;
	void asignarMaterial(Long idSalon, Long idMaterial) throws ServiciosException;

}
