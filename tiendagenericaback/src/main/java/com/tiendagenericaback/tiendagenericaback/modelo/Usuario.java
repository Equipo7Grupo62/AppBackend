package com.tiendagenericaback.tiendagenericaback.modelo;

import javax.persistence.*;

@Entity
@Table (name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cedula;
	private String nombre_completo;
	private String correo_electronico;
	private String usuario;
	private String clave;
	private String area;
	private int id_area;
	private String estado;
	
	public Usuario() {
	}

	public Usuario(int cedula, String nombre_completo, String correo_electronico, String usuario, String contraseña,
			String area, int id_area, String estado) {
		super();
		this.cedula = cedula;
		this.nombre_completo = nombre_completo;
		this.correo_electronico = correo_electronico;
		this.usuario = usuario;
		this.clave = contraseña;
		this.area = area;
		this.id_area = id_area;
		this.estado = estado;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setContraseña(String contraseña) {
		this.clave = clave;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getId_area() {
		return id_area;
	}

	public void setId_area(int id_area) {
		this.id_area = id_area;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
