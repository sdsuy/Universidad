package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Area
 *
 */
@Entity

public class Area implements Serializable {

	
//	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=40)
	private String nombre;

	public Area() {
		super();
	}

	public Area(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
   
}
