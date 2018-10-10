package Tema3.BloqueEjercicios3.EjerciciosConWhile;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		float i=0,numero=1,acumulador=0;
		String mensaje="Introduzca un numero (0->Terminar): ";
		
		while (numero!=0) {
				numero=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumulador+=numero;
				i++;
		}
			JOptionPane.showMessageDialog(null,"La media de los numeros introducidos es: "+acumulador/(i-1));
	}
}
