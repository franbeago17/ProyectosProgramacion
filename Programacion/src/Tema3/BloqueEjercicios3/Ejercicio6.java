package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		String mensaje = "Introduzca numero (0 -> Terminar)";
		int numero= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		for (int i = 0;numero !=0;i++) {
			if (i==0){
				System.out.println(i + " x " + numero + " = " + (i * numero));
				for (i=1;i<11;i++) {
					System.out.println(i + " x " + numero + " = " + (i * numero));
				}	
			}
		}
	}
}
