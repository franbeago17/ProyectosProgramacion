package Tema4.EjercicioLaOca;

public class Principal {
	
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		
		//Impresion del tablero
		//Tablero.getTablero().imprimeTablero();
		
		// Prueba de uso del primer jugador
		Jugador jugador = new Jugador("Rojo");
		do {
			jugador.tirarDado();
			jugador.imprimir();
		}while(jugador.getPosicion() <=61);
	}
}
