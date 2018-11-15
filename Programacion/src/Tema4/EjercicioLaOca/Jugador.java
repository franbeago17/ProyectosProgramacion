package Tema4.EjercicioLaOca;

public class Jugador {
	private String nombre;
	private int posicion = 0;
	
	
	/**
	 * 
	 */
	public Jugador() {
		super();
	}


	/**
	 * @param nombre
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	
	public void tirarDado() {
		int dado = 4;     //(int) Math.round(Math.random()*(6-1)+1);
		System.out.println("Dado: "+ dado);
		// Sumo el dado a la posición actual
		this.posicion += dado;
		// Calculo el posible rebote
		if (this.posicion > Tablero.getTablero().getCasillas().length) {
			this.posicion = Tablero.getTablero().getCasillas().length - (this.posicion - Tablero.getTablero().getCasillas().length);
		}
		// Comprobamos si estamos en una casilla especial
		Casilla casillaActual = Tablero.getTablero().getCasillas()[this.posicion];
		System.out.println("Estamos en la casilla de índice "+ this.posicion+
				 " - Orden= " +casillaActual.getOrden()+
				 " - Nombre= " +casillaActual.getNombre());
		
		// Busco un destino de la casilla actual
		if (casillaActual.getDestino() != null){ // Hay un destino
			Casilla casillaDestino = casillaActual.getDestino();
			System.out.println("Estamos en la casilla de índice "+
					 " - Orden= " +casillaDestino.getOrden()+
					 " - Nombre= " +casillaDestino.getNombre());
			
			// Actualizar la posición del jugador, teniendo en cuenta que ha caído en una casilla especial
			this.posicion = casillaDestino.getOrden() - 1;
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
