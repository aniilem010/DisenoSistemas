package com.practica.utils;


import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;




/**
 *
 * @author 
 */


public class ConectaDB{
	
	
	private Connection conexion=null;
	 
	
	private ResultSet rs = null;
	private Statement instruccion=null;
	
	boolean permiso=false;
	

public Connection open(){
      Context ctx;
       DataSource ds;
       
       System.out.println("bandera1");     
    
       try {     
		ctx=new InitialContext();
		ds=(DataSource)ctx.lookup("java:/melina");      
		this.conexion=ds.getConnection();
		
		System.out.println("bandera2");
	
      
      } catch (SQLException e) {
  	  		e.printStackTrace();
  	} catch (NamingException e) {
		e.printStackTrace();
}
      
      return this.conexion;
      		  
      }
     
    public ResultSet consultaUsuario(){    	
    	open();  
    
    	try {
			conexion.setAutoCommit(false);	
			instruccion=conexion.createStatement();
			rs=instruccion.executeQuery("SELECT nombre,clave,permisos FROM usuarios");
			conexion.commit();
        	
    	} catch (SQLException e) {			
			e.printStackTrace();
		}
    	
    	return rs;    	
    }
    
    
	
  public ResultSet consultaLibros(){    	
    	open();       
    	try {
			conexion.setAutoCommit(false);
			instruccion=conexion.createStatement();
			rs=instruccion.executeQuery("SELECT id_libro,nombre_libro,autor,editorial,descripcion,precio FROM libros");
			conexion.commit(); 
    	
    	} catch (SQLException e) {			
			e.printStackTrace();
		}   	
    		return rs;    	
    }
  
  

 public ResultSet consultaCategoria1(){
  	  	open();
  
  	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=1");
		conexion.commit();  	
  	} catch (SQLException e) {			
			e.printStackTrace();
		}
  			return rs;  	
  }

 public ResultSet suspenso(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=2");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet novela(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=3");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
   
 public ResultSet biografia(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=4");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 
 public ResultSet novela_historica(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=5");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 
 public ResultSet calculo(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=6");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet algebra(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=7");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet autoestima(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=8");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet historia(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=9");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet filosofia(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=10");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet computacion(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=11");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet ciencia_ficcion(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=12");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet relato(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=13");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 public ResultSet comic(){
	  	open();

	  try {
		conexion.setAutoCommit(false);
		instruccion=conexion.createStatement();
		rs=instruccion.executeQuery("SELECT nombre_libro, precio FROM `libros`,`categoria` WHERE id_cat=cat_libro AND id_cat=14");
		conexion.commit();  	
	} catch (SQLException e) {			
			e.printStackTrace();
		}
			return rs;  	
}
 
    
}