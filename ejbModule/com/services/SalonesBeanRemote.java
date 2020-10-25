package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Salon;
import com.exception.ServiciosException;

@Remote
public interface SalonesBeanRemote {
	
	public void crear(String nombre, Long idDepartamento) throws ServiciosException;
	public void actualizar(Salon salon) throws ServiciosException;
	public void borrar(Long id) throws ServiciosException;
	public List<Salon> obtenerUno(String filtro); 
	List<Salon> obtenerTodos();
	
	void asignarArea(Long idSalon, Long idArea);
	void asignarMaterial(Long idSalon, Long idMaterial);

}
