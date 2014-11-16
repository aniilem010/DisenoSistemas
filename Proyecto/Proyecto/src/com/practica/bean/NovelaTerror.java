package com.practica.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import com.practica.utils.ConectaDB;
@ManagedBean

@SessionScoped
public class NovelaTerror {
	
	private Connection conexion=null;
	private ResultSet rs;
	ConectaDB conectar;
		
	public String nombre_libro;
	public String precio;   
	   
	  

	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public String getNombre_libro() {
		return nombre_libro;
	}


	public void setNombre_libro(String nombre_libro) {
		this.nombre_libro = nombre_libro;
	}


	public NovelaTerror(){
		 conectar= new ConectaDB();		
		 rs = conectar.consultaCategoria1();
		 System.out.println("YA ENTRO nt");
		
	}
	
	
	


	public ResultSet getRs() {
		ConectaDB conectar=new ConectaDB();
		rs=conectar.consultaCategoria1();
		System.out.println("YA ENTRO");				
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	
}

