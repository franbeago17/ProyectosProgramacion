package Tema4.EjercicioLaOca;

public class Jugador {
	private String nombre;
	private int posicion = 0;
	private Tablero tablero;
	
	
	/**
	 * 
	 */
	public Jugador() {
		super();
	}


	/**
	 * @param nombre
	 */
	public Jugador(String nombre, Tablero tablero) {
		super();
		this.nombre = nombre;
		this.tablero = tablero;
	}
	
	
	
	public void tirarDado() {
		int dado = (int) Math.round(Math.random()*(6-1)+1);
		System.out.println("Dado: "+ dado);
		this.posicion += dado;
		if (this.posicion > tablero.getTablero().length) {
			this.posicion = 62 - (this.posicion - 62);  
		}
	}
	
	
	
	public void imprimir() {
		System.out.println(this.nombre + " - posicion: " + this.posicion);
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
	
}
