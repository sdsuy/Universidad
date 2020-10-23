package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Material;
import com.exception.ServiciosException;

@Remote
public interface MateriasBeanRemote {
	
	public void crear(Material material) throws ServiciosException;
	public void actualizar(Material material) throws ServiciosException;
	public void borrar(Long id) throws ServiciosException;
	public List<Material> obtenerTodos();
	public List<Material> obtenerTodos(String filtro);

}
