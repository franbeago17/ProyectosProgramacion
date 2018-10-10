package Tema3.BloqueEjercicios3.EjerciciosConFor;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		int contadorPos=0, contadorNeg=0, numero=1;
		String mensaje = "Introduzca numero (0 -> Terminar)";
		for (;numero !=0;) {
			numero= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero<0 && numero !=0) {
					contadorNeg++;
				}
				if (numero>0) {
					contadorPos++;
			}
		}
		JOptionPane.showMessageDialog(null,"Se han introducido "+contadorNeg+" numeros negativos. \n"
				+ "Se han introducido "+contadorPos+" numeros positivos.");
	}
}
