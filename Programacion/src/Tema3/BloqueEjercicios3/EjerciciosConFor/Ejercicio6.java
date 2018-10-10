package Tema3.BloqueEjercicios3.EjerciciosConFor;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numero=1;
		String mensaje = "Introduzca numero (0 -> Terminar)";
		for (;numero !=0;) {
		 numero= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				for (int i=1;i<11;i++) {
					System.out.println(i + " x " + numero + " = " + (i * numero)+"\n");
			}
		}
	}
}
