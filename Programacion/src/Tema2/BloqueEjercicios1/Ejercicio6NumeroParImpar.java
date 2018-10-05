package Tema2.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio6NumeroParImpar {

	public static void main(String[] args) {
		
		String str=JOptionPane.showInputDialog("Introduzca un numero: ");
		int var1=Integer.parseInt(str);
		
		int division=(var1%2); 
		
		if (division == 1) {
			System.out.println("El numero es impar: "+var1);}
		else {
				System.out.println("El numero es par: "+var1);
		}
	}
}
