package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero = 1, mayor = 0;
		String mensaje = "Introduzca numero (0 -> Terminar)";
	
		for (int i = 0; numero != 0; i++) {
			if (i == 0) {
				mayor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			}
			else {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero > mayor && numero != 0) {
					mayor = numero;
				}
			}	
		}
	
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor);
	}
}

