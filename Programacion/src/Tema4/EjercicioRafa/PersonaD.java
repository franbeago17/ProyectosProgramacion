package Tema4.EjercicioRafa;


public class PersonaD extends Persona {
	
	private String dni;

	public PersonaD() {
		super();
	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param dni
	 */
	public PersonaD(String nombre, String apellidos, String fechaNacimiento, String dni) {
		super(nombre, apellidos, fechaNacimiento);
		this.dni=dni;
	}

	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "PersonaND [dni=" + dni + ", Nombre=" + getNombre() + ", Apellidos=" + getApellidos()
				+ ", Fecha nacimiento=" + getFechaNacimiento() + "]";
	}
	
	
	
	
	
}
