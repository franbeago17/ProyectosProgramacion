package Tema3.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		int i,mayor=0,menor=0;
		int var=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de variables que deseas poner: "));
		if (var<=0) {
			JOptionPane.showMessageDialog(null,"ERROR!! El numero debe ser mayor que 0");

		}
		else {
		for (i=1;i<=var;i++) {
			int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero "+i));
			if (i==1) {
				mayor=num;
				menor=num;
			}
			if (num>mayor) {
				mayor=num;
			}
			if (num<menor) {
				menor=num;
			}
		}
		JOptionPane.showMessageDialog(null,"El numero menor es: "+menor+"\n"
				+ "El numero mayor es: "+mayor);
		}
	}
}
