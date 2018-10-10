package Tema3.BloqueEjercicios3.EjerciciosConWhile;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero = 1, mayor;
		String mensaje = "Introduzca numero (0 -> Terminar)";
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		mayor=numero;
		while (numero != 0) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero > mayor && numero != 0) {
					mayor = numero;
			}	
		}
	
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor);
	}
}

