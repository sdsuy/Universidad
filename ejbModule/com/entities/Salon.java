package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Salon
 *
 */

@Entity

public class Salon implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType=Auto)
	private Long id;
	
	@Column(length=40)
	private String nombre;
	
	private int cap_max;
	
	private boolean bandera;
	
	@Enumerated(value=EnumType.String)
	private Tipo tipo;
	
	public enum Tipo 
	{
		LABORATORIO,COMUN,EXAMEN
		
	}
	
	
	public Salon() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCap_max() {
		return cap_max;
	}
	public void setCap_max(int cap_max) {
		this.cap_max = cap_max;
	}
	public boolean isBandera() {
		return bandera;
	}
	public void setBandera(boolean bandera) {
		this.bandera = bandera;
	}

   
}
