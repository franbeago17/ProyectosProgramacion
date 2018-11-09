package Tema4.EjercicioRafa;

import java.util.Date;

public class PersonaND extends Persona{
	private String descripcion;

	public PersonaND() {
		super();
	}

	
	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param descripcion
	 */
	public PersonaND(String nombre, String apellidos, String fechaNacimiento, String descripcion) {
		super(nombre, apellidos, fechaNacimiento);
		this.descripcion=descripcion;
	}


	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "PersonaD [Descripcion=" + descripcion + ", Nombre=" + getNombre() + ", Apellidos="
				+ getApellidos() + ", Fecha de nacimiento=" + getFechaNacimiento() + "]";
	}
	
	
	
	
	
}
