package com.practica.bean;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//import javax.swing.JOptionPane;


import com.practica.utils.ConectaDB;

@ManagedBean (name="librosBean1")
@SessionScoped
public class LibrosBean{	
	Libros libr= new Libros();
	
	int Id;
	private String nnom;
	private String aaut;
	private String edd;
	private String ddes;
	private String ppre;
	int ccat;
		
	List<Libros> lib, libS;
	private ResultSet rs;
		
	public List<Libros> getLibS() {
		return libS;
	}

	public void setLibS(ArrayList<Libros> libS) {
		this.libS = libS;
	}

	public List<Libros> getLib() {
		
		System.out.println("entra a getlib");
		LibrosBean1();
	
		return lib;
	}

	public void setLib(ArrayList<Libros> lib) {
		System.out.println("entra a setlib");
		
		this.lib = lib;
	}

	public LibrosBean(){
	//LibrosBean1();
	}

	@PostConstruct	
	public void LibrosBean1(){		
		lib = new ArrayList<Libros>();		
		ConectaDB conectar=new ConectaDB();			
		rs=conectar.consultaLibros();		
		try{			
			while (rs.next()) {			
			libr= new Libros();			
			libr.setId(rs.getInt("id_libro"));
			libr.setNom(rs.getString("nombre_libro"));
			//libr.setId(rs.getInt("id_libro"));
			
			System.out.println(libr.getNom());			
			//System.out.println(nom + " " + aut + " " + ed);			
			lib.add(libr);
			}
		
		}catch(SQLException e){
			
		}
				
		for (Libros g: lib){			
			System.out.println(g.getNom());
		}
	}
	
	public ResultSet getRs() {
		
		System.out.println("entra a getrs");
		LibrosBean1();		
		return rs;
	}

	public void setRs(ResultSet rs) {
		System.out.println("entra a setrs");	
		this.rs = rs;
	}   
}