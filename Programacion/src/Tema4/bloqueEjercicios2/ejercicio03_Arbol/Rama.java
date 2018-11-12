package Tema4.bloqueEjercicios2.ejercicio03_Arbol;

public class Rama extends ComponenteDeArbol {

	private ComponenteDeArbol extension1 = null;
	private ComponenteDeArbol extension2 = null;
	private ComponenteDeArbol extension3 = null;

	
	/**
	 * @param nombre
	 */
	public Rama(String nombre) {
		super(nombre);
	}
	
	
	
	/**
	 * @return the extension1
	 */
	public ComponenteDeArbol getExtension1() {
		return extension1;
	}
	/**
	 * @param extension1 the extension1 to set
	 */
	public void setExtension1(ComponenteDeArbol extension1) {
		this.extension1 = extension1;
	}
	/**
	 * @return the extension2
	 */
	public ComponenteDeArbol getExtension2() {
		return extension2;
	}
	/**
	 * @param extension2 the extension2 to set
	 */
	public void setExtension2(ComponenteDeArbol extension2) {
		this.extension2 = extension2;
	}
	/**
	 * @return the extension3
	 */
	public ComponenteDeArbol getExtension3() {
		return extension3;
	}
	/**
	 * @param extension3 the extension3 to set
	 */
	public void setExtension3(ComponenteDeArbol extension3) {
		this.extension3 = extension3;
	}
	
}
