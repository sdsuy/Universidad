package com.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Material;
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
	public void crear(Material materia) throws ServiciosException {
		try {
			manager.persist(materia);
			manager.flush();
		} catch(PersistenceException e){
			throw new ServiciosException("No se pudo crear la materia");
		}
		
	}

	@Override
	public void actualizar(Material materia) throws ServiciosException {
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
			Material materia = manager.find(Material.class, id);
			manager.remove(materia);
			manager.flush();
		}catch(PersistenceException e){
			throw new ServiciosException("No se pudo borrar la materia");
		}
		
	}

	@Override
	public List<Material> obtenerTodos() {
		TypedQuery<Material> query = manager.createQuery("SELECT m FROM Materia m",Material.class); 
		return query.getResultList();
	}

	@Override
	public List<Material> obtenerTodos(String filtro) {
		TypedQuery<Material> query = manager.createQuery("SELECT m FROM Materia m WHERE m.nombre LIKE :nombre",Material.class)
				.setParameter("nombre", filtro); 
		return query.getResultList();
	}

}
