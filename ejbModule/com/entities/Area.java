package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Area
 *
 */
@Entity
@Table(name="areas")
@NamedQuery(name="leerTodos", query="SELECT e FROM Area e")
@NamedQuery(name="leerTodosFiltro", query="SELECT e FROM Area e WHERE e.nombre LIKE :nombre")
public class Area implements Serializable {

	
//	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "area-generator", sequenceName = "area_sequence", allocationSize = 20)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "area-generator")
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
   
}
