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
	@SequenceGenerator(name = "material-generator", sequenceName = "material_sequence", allocationSize = 20)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "material-generator")
	private Long id;
	
	@Column(length=60)
	private String nombre;
	
	@Column(length=100)
	private String descripcion;

	
	public Material() {
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


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
   

