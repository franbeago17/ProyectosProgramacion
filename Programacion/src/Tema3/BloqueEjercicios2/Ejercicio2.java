package Tema3.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		int i,mayor=0,num=0,menor=10000;
		int var=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de variables que deseas poner: "));
		for (i=1;i<=var;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero "+i));
			if (num>mayor) {
				mayor=num;
			}
			if (num<menor) {
				menor=num;
			}
		}
		JOptionPane.showMessageDialog(nul,"El numero menor es: "+menor	);
		JOptionPane.showMessageDialog(null,"El numero mayor es: "+mayor);
	}
}
