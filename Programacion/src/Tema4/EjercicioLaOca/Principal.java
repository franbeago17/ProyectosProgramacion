package Tema4.EjercicioLaOca;

import javax.swing.JOptionPane;

public class Principal {   

	/**
	 * 
	 */
	public static void main (String args[]) {
		
		int numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de jugadores: "));
		Jugador jugador[] = new Jugador[numeroJugadores];
		int i, numeroJugadoresTerminados=0;// Creamos una variable para contabilizar los jugadores que han terminado.
		// Creamos jugadores
		for (i=0;i<numeroJugadores;i++) {
			jugador[i] = new Jugador("Jugador " + i);
		}
		do {// Mientras que no hayan terminado todos los jugadores.
			for (i=0;i<numeroJugadores;i++) {
				if (!jugador[i].isTerminado()) {// Si no han terminado haz que el jugador tire el dado.
					System.out.println("Jugador " + (i+1));
					jugador[i].tirarDado();
					if (jugador[i].isTerminado()) {// Si ha terminado añadelo a los jugadores que ya han acabado.
						numeroJugadoresTerminados++;
						System.out.println("\n\n\tHAS GANADO EL JUEGO DE LA OCA!");
					}
				}
			}
		}while(numeroJugadoresTerminados < numeroJugadores);
	}
}
