package ec.edu.ups.clases.modelo;

import java.util.List;


public class Persona {
	private String cedula;

	private String nombres;
	private String apellidos;
	private List<Titulos> titulos;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public List<Titulos> getTitulos() {
		return titulos;
	}
	public void setTitulos(List<Titulos> titulos) {
		this.titulos = titulos;
	}
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", titulos="
				+ titulos + "]";
	}

}
