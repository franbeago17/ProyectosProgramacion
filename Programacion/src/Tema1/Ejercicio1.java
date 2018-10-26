package Tema1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca un número flotante: ");
		float var2 = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Introduzca un número doble: ");
		double var3 = Double.parseDouble(str);
		
		System.out.print("Los números introducidos son: "+var1+", "+var2+", " +var3);
	} 

}
