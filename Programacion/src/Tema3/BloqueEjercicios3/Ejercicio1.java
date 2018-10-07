package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero=1,acumulador=0;
		String mensaje="Introduzca un numero (0->Terminar): ";
		
		for (int i=0;numero!=0;i++) {
			if (i==0) {
				int numerosIntroducidos=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumulador=acumulador+numerosIntroducidos;
			}
			else {
				int numerosIntroducidos=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumulador=acumulador+numerosIntroducidos;
			}
		}
			JOptionPane.showMessageDialog(nul,"La suma de los numeros introducidos es: "+acumulador);
	}
}
