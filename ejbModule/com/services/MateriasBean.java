package com.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.entities.Materia;
import com.exception.ServiciosException;

/**
 * Session Bean implementation class MateriasBean
 */
@Stateless
public class MateriasBean implements MateriasBeanRemote {
	
	@PersistenceContext
	private EntityManager manager;

    /**
     * Default constructor. 
     */
    public MateriasBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void crear(Materia materia) throws ServiciosException {
		try {
			manager.persist(materia);
			manager.flush();
		} catch(PersistenceException e){
			throw new ServiciosException("No se pudo crear la materia");
		}
		
	}

	@Override
	public void actualizar(Materia materia) throws ServiciosException {
		try {
			manager.merge(materia);
			manager.flush();
		} catch(PersistenceException e){
			throw new ServiciosException("No se pudo actualizar la materia");
		}
		
	}

	@Override
	public void borrar(Long id) throws ServiciosException {
		try{
			Materia materia = manager.find(Materia.class, id);
			manager.remove(materia);
			manager.flush();
		}catch(PersistenceException e){
			throw new ServiciosException("No se pudo borrar la materia");
		}
		
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
