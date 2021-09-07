package com.tiendagenericaback.tiendagenericaback.modelo;

import javax.persistence.*;

@Entity
@Table (name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private long Cedula_usuario;
	private String Nombre_usuario;
	private String Email_usuario;
	private String Usuario;
	private String Clave;
	
	public Usuario() {
	}

	public Usuario(int id, long cedula_usuario, String nombre_usuario, String email_usuario, String usuario,
			String clave) {
		super();
		this.Id = id;
		this.Cedula_usuario = cedula_usuario;
		this.Nombre_usuario = nombre_usuario;
		this.Email_usuario = email_usuario;
		this.Usuario = usuario;
		this.Clave = clave;
	}




	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public long getCedula_usuario() {
		return Cedula_usuario;
	}


	public void setCedula_usuario(long cedula_usuario) {
		Cedula_usuario = cedula_usuario;
	}


	public String getNombre_usuario() {
		return Nombre_usuario;
	}


	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}


	public String getEmail_usuario() {
		return Email_usuario;
	}


	public void setEmail_usuario(String email_usuario) {
		Email_usuario = email_usuario;
	}


	public String getUsuario() {
		return Usuario;
	}


	public void setUsuario(String usuario) {
		Usuario = usuario;
	}


	public String getClave() {
		return Clave;
	}


	public void setClave(String clave) {
		Clave = clave;
	}
	
}
