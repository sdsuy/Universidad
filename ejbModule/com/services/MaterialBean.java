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
public class MaterialBean implements MaterialBeanRemote {
	
	@PersistenceContext
	private EntityManager manager;

    /**
     * Default constructor. 
     */
    public MaterialBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void crear(Material material) throws ServiciosException {
		try {
			manager.persist(material);
			manager.flush();
		} catch(PersistenceException e){
			throw new ServiciosException("No se pudo crear el material");
		}
		
	}

	@Override
	public void actualizar(Material material) throws ServiciosException {
		try {
			manager.merge(material);
			manager.flush();
		} catch(PersistenceException e){
			throw new ServiciosException("No se pudo actualizar el material");
		}
		
	}

	@Override
	public void borrar(Long id) throws ServiciosException {
		try{
			Material material = manager.find(Material.class, id);
			manager.remove(material);
			manager.flush();
		}catch(PersistenceException e){
			throw new ServiciosException("No se pudo borrar el material");
		}
		
	}

	@Override
	public List<Material> obtenerTodos() {
		TypedQuery<Material> query = manager.createQuery("SELECT m FROM Materiales m",Material.class); 
		return query.getResultList();
	}

	@Override
	public List<Material> obtenerTodos(String filtro) {
		TypedQuery<Material> query = manager.createQuery("SELECT m FROM Materiales m WHERE m.nombre LIKE :nombre",Material.class)
				.setParameter("nombre", filtro); 
		return query.getResultList();
	}

}
