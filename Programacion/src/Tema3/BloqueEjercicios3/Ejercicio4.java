package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero = 1, menor = 0;
		String mensaje = "Introduzca número (0 -> Terminar)";
	
		for (int i = 0; numero != 0; i++) {
			if (i == 0) { // Primera iteración
				menor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				numero = menor;
			}
			else { // Resto de iteraciones
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero < menor && numero != 0) {
					menor = numero;
				}
			}	
		}
	
		JOptionPane.showMessageDialog(null, "Menor: " + menor);
	}
}
