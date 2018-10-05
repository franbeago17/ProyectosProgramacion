package Tema2.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio7NumeroParImparConAnd {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero: ");
		int var1 = Integer.parseInt(str);
		
		int and=var1&1;
		
		if (and==0) {
			System.out.println("El numero "+var1+" es par");
		}
		else {
			System.out.println("El numero "+var1+" es impar");
		}
		
	}

}
