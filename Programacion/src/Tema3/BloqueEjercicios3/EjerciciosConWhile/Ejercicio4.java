package Tema3.BloqueEjercicios3.EjerciciosConWhile;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero = 1, menor = 0;
		String mensaje = "Introduzca numero (0 -> Terminar)";
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		menor=numero;
		while (numero != 0) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero < menor && numero != 0) {
					menor = numero;
			}	
		}
	
		JOptionPane.showMessageDialog(null, "Menor: " + menor);
	}
}
