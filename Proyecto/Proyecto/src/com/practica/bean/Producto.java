package com.practica.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id_libro;
	private String nombre_libro;
	private String autor;
	private String editorial;
	private String descripcion;
	private String precio;
	private int cant_libro;
	

	public Producto() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdProducto() {
		return this.id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}


	public String getNombre_libro() {
		return nombre_libro;
	}


	public void setNombre_libro(String nombre_libro) {
		this.nombre_libro = nombre_libro;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public int getCant_libro() {
		return cant_libro;
	}


	public void setCant_libro(int cant_libro) {
		this.cant_libro = cant_libro;
	}


	public int getId_libro() {
		return id_libro;
	}


	



	





}