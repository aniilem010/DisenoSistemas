package com.practica.bean;

import java.sql.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.practica.utils.ConectaDB;

@ManagedBean

@SessionScoped

public class LoginBean {
	
	ConectaDB conectar;
	
	
	
    String nombres;
	
	ResultSet rs;
	
	  String nombreUsuario;
	   int pwdUsuario;
	  
	   String permisoUsuario;  
	   
	   String nombre;
	   String clave;
	   
	   
	   String permisos;
	   
	   boolean per=false;
	   
	   boolean logeado = false;
	  
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}

	
	public boolean isLogeado() {
		return logeado;
	}


	public void setLogeado(boolean logeado) {
		this.logeado = logeado;
	}


	public LoginBean(){
		

		 conectar= new ConectaDB();
		
		rs = conectar.consultaUsuario();
		
	}
	
	
	public String getNombres() {
		return nombres;
	}

	
	
	public String getPermisoUsuario() {
		return permisoUsuario;
	}


	public void setPermisoUsuario(String permisoUsuario) {
		this.permisoUsuario = permisoUsuario;
	}


	public String getPermisos() {
		return permisos;
	}


	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public ResultSet getRs() {

				
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	
	public void getUsuario() {
		
		

		conectar = new ConectaDB();
		
		ResultSet rs = null;
	

rs = conectar.consultaUsuario();	
		
try {
	
	
	while(rs.next() ) {
		
	
		if(nombre.equals(rs.getString("nombre"))){
			
			
		
			 
			 if(clave.equals(rs.getString("clave"))){
				
				 //if(permisos.equals(rs.getString("permisos"))){
			 
			 nombreUsuario=rs.getString("nombre");
			 pwdUsuario=Integer.parseInt(rs.getString("clave"));
			 permisoUsuario=rs.getString("permisos");
			 
			 System.out.println(pwdUsuario);
			 System.out.println(permisoUsuario);

			 //}
			 
			 }
			
		}//termina if
			
		}//termina while
	 if (permisoUsuario.contains("ad")){
		 per=true;
	 }
	 System.out.println(per);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	}
	
	
	
	 public String  login() {
		  
		  System.out.println("estamos en login");
		  getUsuario();
		  
		  String b=null;
		  
	    RequestContext context = RequestContext.getCurrentInstance();
	    FacesMessage msg = null;
	    
	    
	    if (nombre != null && nombre.equals(""+nombreUsuario+"") && clave != null
	        && clave.equals(""+pwdUsuario+"")) {
	      logeado = true;
	      msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@", nombre);
	      
	      
	      System.out.println("usuarioCorrecto");
	      b="menu";
	      
	      
	    } else {
	      msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error",
	                             "Credenciales no validas");
	      
	      logeado = false;
	      System.out.println("usuarioincorrecto");
	      
	      b=null;
	    }
	    
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	    context.addCallbackParam("estaLogeado", logeado);
	    if (logeado)
	      context.addCallbackParam("view", "login.xhtml");
	    
	    System.out.println("entra a logeado");
	    
	    if (logeado==true){
	    	System.out.println("USUARIO CORRECTO");
	    	return "usuarioCorrecto";
	    	
	    }
	    else{
	    	System.out.println("USUARIO INCORRECTO");
	    	return "usuarioIncorrecto";
	    }
	    
	   
	    
	    
	  }
	
	
}