package Tema4.EjercicioElAhorcado;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos el array de palabras.	
		String palabras[] = new String[] {"mono", "trujillo", "foca", "cordobita" , "chino", "trillo", "dani"};
		// Pedimos palabra aleatoria del array.
		int numeroPalabraAleatoria = (int) Math.round(Math.random() * (palabras.length - 1));
		String palabraGenerada = palabras[numeroPalabraAleatoria];
		int fallos = 0;
		int fallosMax= 6;
		String aux[] = new String[fallosMax];
		for (int i = 0; i < fallosMax; i++) {
			aux[i]= " _";
		}
		// Inicializamos la palabra del jugador.
		String intentoJugador;
		System.out.println(palabras[numeroPalabraAleatoria]); // Imprimimos en pantalla la palabra generada.
		char guiones[] = new char[palabraGenerada.length()]; // Para crear los guiones creamos otro array.
		// Recorremos el array.
		for (int i = 0; i < palabraGenerada.length(); i++) {
			guiones[i] = '_'; // Imprimimos los guiones.
			System.out.print(guiones[i]+" ");
		}
		do {
			intentoJugador = JOptionPane.showInputDialog("Introduzca una palabra o letra."); // Pedimos al jugador una palabra o letra
			// si no analizamos la longitud de la palabra y si es una letra;
			if (intentoJugador.length() == 1) {
				System.out.println("\n");
				boolean fallo = true;
				for (int i = 0; i < palabraGenerada.length(); i++) {
					char charJugador = intentoJugador.charAt(0) ;
					if (charJugador == palabraGenerada.charAt(i)) { // Si la letra coincide con alguna de la palabra
						guiones[i] = charJugador;
						fallo = false; // Decimos que no hay fallo
					}
				}
				if (fallo == true) { // Si hay fallo
					aux[fallos] = intentoJugador;
					fallos++; // Añade un fallo
				}
				for (int i = 0; i < palabraGenerada.length(); i++) {
					System.out.print(guiones[i]+" "); // Imprime los guiones
				}
			}
			else {
				if (!intentoJugador.equals(palabraGenerada)) {
					fallos++; // Si la palabra no es igual añadimos un fallo
				}
			}
		System.out.print("\n Letras ya usadas: ");
		// 
		for (int i = 0; i < fallosMax; i++) {
			System.out.print(" "+aux[i]);
		}
		// Realizamos el bucle mientras que la palabra no sea igual, los fallos no sean los máximos o las letras no estén completas.
		}while(!((intentoJugador.equals(palabraGenerada)) || (fallos >= fallosMax) || (coincidenciasCompletas(guiones))));
		if (intentoJugador.equals(palabraGenerada) || (coincidenciasCompletas(guiones))){
			System.out.println("\n\n\t\t HAS GANADO ENHORABUENA!!");
		}
		else {
			System.out.println("\n\n\t\t HAS PERDIDO MATAO");
		}
	}
		
		private static boolean coincidenciasCompletas (char guiones[]) {
			for (int i = 0; i < guiones.length; i++) {
				if (guiones[i] == '_') {
					return false;
				}
			}
			return true;
		}
	}
	

