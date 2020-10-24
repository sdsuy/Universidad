package com.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Salon
 *
 */

@Entity
@Table(name="salon")
@NamedQuery(name="obtenerTodos", query="SELECT s FROM Salon s")
public class Salon implements Serializable {

	
//	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "salon-generator", sequenceName = "salon_sequence", allocationSize = 20)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "salon-generator")
	private Long id;
	
	@Column(length=40)
	private String nombre;
	
	@Column(name="cap_max")
	private int capacidadMaxima;
	
	private boolean bandera;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	

	public enum Tipo 
	{
		LABORATORIO,COMUN,EXAMEN		
	}
	
	@ManyToOne(optional=false)
	private Area area;
	
	@OneToMany
	private List<Material> materiales = new ArrayList<>();
	
	
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
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public boolean isBandera() {
		return bandera;
	}
	public void setBandera(boolean bandera) {
		this.bandera = bandera;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public List<Material> getMateriales() {
		return materiales;
	}
	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}
   
}
