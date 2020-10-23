package com.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Materia;
import com.exception.ServiciosException;

/**
 * Session Bean implementation class MateriasBean
 */
@Stateless
public class MateriasBean implements MateriasBeanRemote {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public MateriasBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void crear(Materia materia) throws ServiciosException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Materia materia) throws ServiciosException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Long id) throws ServiciosException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Materia> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materia> obtenerTodos(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
