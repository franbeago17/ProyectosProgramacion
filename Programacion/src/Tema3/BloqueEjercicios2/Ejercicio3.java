package Tema3.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		String mensaje="Introduzca un factor: ";
		int limite = 100;
		int factor =Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		
		
		for (int i = 0; (i * factor) < limite; i++) {
			System.out.println("Valor de i * factor: " + (i * factor));
		}
	}
}