package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero = 1, mayor = 0, menor=0;
		String mensaje = "Introduzca numero (0 -> Terminar)";
	
		for (int i = 0; numero != 0; i++) {
			if (i == 0) {
				numero= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				mayor=numero;
				menor=numero;
			}
			else {
				numero= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero>mayor && numero != 0) {
					mayor=numero;
				}
				if (numero<menor && numero != 0) {
					menor=numero;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Menor: " + menor+"\n"
				+ "Mayor: " + mayor);
	}
}
