package com.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.entities.Area;

/**
 * Session Bean implementation class AreaBean
 */
@Stateless
public class AreaBean implements AreaBeanRemote {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public AreaBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void crear(Area area) {
		em.persist(area);
		em.flush();
	}

	@Override
	public Area leerUno(Long id) {
		return em.find(Area.class, id);
	}

	@Override
	public List<Area> leerTodos() {
		TypedQuery<Area> query = em.createNamedQuery("leerTodos", Area.class);
		return query.getResultList();
	}

	@Override
	public void actualizar(Area area) {
		em.merge(area);
		em.flush();
	}

	@Override
	public void borrar(Long id) {
		Area area = em.find(Area.class, id);
		em.remove(area);
		em.flush();
	}

}
