package Tema3.BloqueEjercicios3.EjerciciosConFor;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero=1,acumulador=0;
		String mensaje="Introduzca un numero (0->Terminar): ";
		
		for (;numero!=0;) {
				numero=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumulador+=numero;
		}
			JOptionPane.showMessageDialog(null,"La suma de los numeros introducidos es: "+acumulador);
	}
}
