package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Materia;
import com.exception.ServiciosException;

@Remote
public interface MateriasBeanRemote {
	
	public void crear(Materia materia) throws ServiciosException;
	public void actualizar(Materia materia) throws ServiciosException;
	public void borrar(Long id) throws ServiciosException;
	public List<Materia> obtenerTodos();
	public List<Materia> obtenerTodos(String filtro);

}
