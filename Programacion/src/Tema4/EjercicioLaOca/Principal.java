package Tema4.EjercicioLaOca;

public class Principal {   

	/**
	 * 
	 */
	public static void main (String args[]) {
		String nombresJugadores[] = new String[] {"Rafa", "Joaquín", "Pedro", "Marta", "Sofía", "Laura"};
		
		Jugador jugadores[] = new Jugador[6];
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador(nombresJugadores[i]);
		}
		//jugadores[0].setCasilla(Tablero.getTablero().getCasillas()[28]);
		
		
		// Prueba de uso del primer jugador
		do {
			for (int i = 0; i < jugadores.length; i++) {
				if (!jugadores[i].isTerminado()) {
					System.out.println(jugadores[i].getNombre());
					jugadores[i].tirarDado();
					if (jugadores[i].isTerminado()) {
						jugadores[i].setPodium(getMaximoValorEnPodium(jugadores) + 1);
						System.out.println("\n\n\tHAS GANADO EL JUEGO DE LA OCA");
					}
				}
			}
		} while (!estaJuegoTerminado(jugadores));
	
		
		// Imprimo array de jugadores, ordenándolo previamente
		ordenaArrayJugadoresPorPodium(jugadores);
		System.out.println("\n\nPodium de jugadores");
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println(jugadores[i].toString());
		}
	}

	
	
	
	/**
	 * 
	 * @param jugadores
	 */
	private static void ordenaArrayJugadoresPorPodium (Jugador jugadores[]) {
		// Ordenación por el método de la burbuja, desde la derecha
		for (int i = jugadores.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (jugadores[j].getPodium() > jugadores[j+1].getPodium()) {
					Jugador aux = jugadores[j];
					jugadores[j] = jugadores[j+1];
					jugadores [j+1] = aux;
				}
			}
		}		
	}
	
	
	
	
	/**
	 * 
	 * @return
	 */
	public static int getMaximoValorEnPodium (Jugador jugadores[]) {
		int maxValor = 0;
		
		if (jugadores.length > 0) {
			maxValor = jugadores[0].getPodium();
			for (int i = 1; i < jugadores.length; i++) {
				if (jugadores[i].getPodium() > maxValor) {
					maxValor = jugadores[i].getPodium();
				}
			}
		}
		return maxValor;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private static boolean estaJuegoTerminado (Jugador jugadores[]) {
		for (int i = 0; i < jugadores.length; i++) {
			if (!jugadores[i].isTerminado()) {
				return false;
			}
		}
		return true;
	}
}
