package com.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import com.entities.Salon;
import com.exception.ServiciosException;

/**
 * Session Bean implementation class SalonesBean
 */
@Stateless
public class SalonesBean implements SalonesBeanRemote {
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public SalonesBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void crear(Salon salon) throws ServiciosException {
		
		try {
			em.persist(salon);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo crear el Salon");
		}
	}

	@Override
	public void actualizar(Salon salon) throws ServiciosException {
		
		try {
			em.merge(salon);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo actualizar el Salon");
		}
	}

	@Override
	public void borrar(Long id) throws ServiciosException {
		
		try {
			Salon salon = em.find(Salon.class, id);
			em.remove(salon);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo borrar el Salon");
		}
		
	}

	@Override
	public List<Salon> obtenerUno(String filtro) {
		TypedQuery<Salon> query = em.createQuery("SELECT s FROM Salon s WHERE s.nombre LIKE :nombre",Salon.class)
				.setParameter("nombre", filtro); 
		return query.getResultList();
	}

	@Override
	public List<Salon> obtenerTodos() {
		TypedQuery<Salon> query = em.createQuery("SELECT s FROM Salon s",Salon.class);
		return query.getResultList();
	}

	
}
