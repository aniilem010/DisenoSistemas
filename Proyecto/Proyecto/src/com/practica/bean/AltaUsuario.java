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
public class AltaUsuario{

private String nombre;
private String direccion; 
private int telefono;
private String correo;
private int clave;
private int perfil;

public int resultado;


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

public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public int getTelefono() {
	return telefono;
}


public void setTelefono(int telefono) {
	this.telefono = telefono;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


public int getClave() {
	return clave;
}


public void setClave(int clave) {
	this.clave = clave;
}


public int getPerfil() {
	return perfil;
}


public void setPerfil(int perfil) {
	this.perfil = perfil;
}


public String getNombre() {
	return nombre;
}


public void setNombre (String nombre){
	this.nombre= nombre;
}

public String alta() {
	  Context ctx;
      DataSource ds;            
       try {     
		ctx=new InitialContext();
        ds=(DataSource)ctx.lookup("java:/melina");      
		this.conexion=ds.getConnection();		
		Statement consulta = conexion.createStatement();
		consulta.execute("INSERT INTO usuarios (nombre, direccion,telefono,correo,clave,perfil)  VALUES ('"+nombre+"','"+direccion+"',"+telefono+",'"+correo+"',"+clave+",'"+perfil+"')");
		
      } catch (SQLException e) {  
  	
  		} catch (NamingException e) {
	
  		}      
       return "login";
      		  
	}
}



