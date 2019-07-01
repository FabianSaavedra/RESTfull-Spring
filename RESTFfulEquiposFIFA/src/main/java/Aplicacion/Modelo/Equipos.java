package Aplicacion.Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipos implements Serializable{

	@Id
	private String nombre;
	@Column(name="puntos")
	private int puntos;
	@Column(name="ciudad")
	private String ciudad;
	@Column(name="nombre_dt")
	private String nombre_dt;
	
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombre_dt() {
		return nombre_dt;
	}
	public void setNombre_dt(String nombre_dt) {
		this.nombre_dt = nombre_dt;
	}
	
		
}
