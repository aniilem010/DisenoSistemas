package com.practica.bean;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.faces.application.FacesMessage;
	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.SessionScoped;
	import javax.faces.context.FacesContext;
	import javax.naming.Context;
	import javax.naming.InitialContext;
	import javax.naming.NamingException;
	import javax.sql.DataSource;

	import org.primefaces.context.RequestContext;
	@ManagedBean

	@SessionScoped
	public class AltaLibro{

	public String nombre_libro;
	private String autor; 
	private String editorial;
	private String descripcion;
	private String precio;
	private int cat_libro;

	public int resultado;


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


	public int getCat_libro() {
		return cat_libro;
	}


	public void setCat_libro(int cat_libro) {
		this.cat_libro = cat_libro;
	}


	public Connection getConexion() {
		return conexion;
	}


	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	private Connection conexion=null;


	PreparedStatement prepared = null;
	ResultSet result = null;
	String Query = null;
	Statement inst=null;

	

	public String altaLib() {
		  Context ctx;
	      DataSource ds;            
	       try {     
			ctx=new InitialContext();
	        ds=(DataSource)ctx.lookup("java:/melina");      
			this.conexion=ds.getConnection();		
			Statement consulta1 = conexion.createStatement();
			consulta1.execute("INSERT INTO libros (nombre_libro,autor,editorial,descripcion,precio,cat_libro)  VALUES ('"+nombre_libro+"','"+autor+"','"+editorial+"','"+descripcion+"','"+precio+"',"+cat_libro+")");
			
	      } catch (SQLException e) {  
	  	
	  		} catch (NamingException e) {
		
	  		}      
	       return "menuV2";
	      		  
		}
	}

