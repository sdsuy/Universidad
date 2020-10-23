package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Material
 *
 */
@Entity
@Table(name="materiales")
public class Material implements Serializable {

	
//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_id_material", allocationSize = 20)
	private Long id;
	
	@Column(length=40)
	private String nombre;
	
	@Column(length=40)
	private String descripcion;

	
	public Material() {
		super();
	}


	private Long getId() {
		return id;
	}


	private void setId(Long id) {
		this.id = id;
	}


	private String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private String getDescripcion() {
		return descripcion;
	}


	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
   

