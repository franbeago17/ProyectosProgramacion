package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numero=1,acumulador=0,contador=0;
		String mensaje="Introduzca un numero (0->Terminar): ";
		
		for (int i=0;numero!=0;i++) {
			if (i==0) {
				int numerosIntroducidos=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumulador=acumulador+numerosIntroducidos;
				contador++;
			}
			else {
				int numerosIntroducidos=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumulador=acumulador+numerosIntroducidos;
				contador++;
			}
		}
			JOptionPane.showMessageDialog(nul,"La suma de los numeros introducidos es: "+acumulador);
	}
}
