package Tema4.bloqueEjercicios2.ejercicio03_Arbol;

public class ComponenteDeArbol {
String nombre;

	
	
	/**
	 * @param nombre
	 */
	public ComponenteDeArbol(String nombre) {
		super();
		this.nombre = nombre;
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

	
	@Override
	public String toString() {
		return "ComponenteDeArbol [nombre=" + nombre + "]";
	}
	
	
}
