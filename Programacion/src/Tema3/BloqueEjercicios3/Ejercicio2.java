package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		float i,numero=1,acumulador=0;
		String mensaje="Introduzca un numero (0->Terminar): ";
		
		for (i=-1;numero!=0;i++) {
			if (i==-1) {
				numero=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumulador+=numero;
			}
			else {
					numero=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
					acumulador+=numero;
			}
		}
			JOptionPane.showMessageDialog(null,"La media de los numeros introducidos es: "+acumulador/(i));
	}
}
