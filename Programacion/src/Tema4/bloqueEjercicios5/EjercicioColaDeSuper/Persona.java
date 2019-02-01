package Tema4.bloqueEjercicios5.EjercicioColaDeSuper;

import javax.swing.JOptionPane;

public class Persona {
	private String nombres[] = new String[] {"maria","teresa","mariana","jose","pedro","juan", "Javier", "Isabel", "Fran", "Daniel", "David", "Alejandro", "Antonio", "Juanjo", "Elena", "Rafa", "Sandra", "Jorge", "Izan", "Jesús", };
	private String dnis[] = new String[] {"12345678M" , "12345678N","12345678J", "12345678T", "12345678E", "12337657R", "134554L", "153647U", "12368575K", "12345678R", "93745974H", "93745974T", "93745974D", "93745974W", "93745974G", "349574357Ñ", "93745974S", "3928323D", "9283435H", "3465632A", "51182940M", "39248732V", "23847922Q"}; 
	private int numeroDniAleatorio=(int) Math.round(Math.random() * (dnis.length - 1));
	private int numeronombreAleatorio=(int) Math.round(Math.random() * (nombres.length - 1));
	private String dni = dnis[numeroDniAleatorio];
	private String nombre = nombres[numeronombreAleatorio];
	
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}


	/**
	 * @param dni
	 * @param nombre
	 */
	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre: " + nombre + "\t\tDNI: " + dni;
	}
	
	
	
	
}
