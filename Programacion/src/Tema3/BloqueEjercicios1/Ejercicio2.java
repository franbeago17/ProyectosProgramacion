package Tema3.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		int i, acumuladorNumerosMayoresDiez=0;
		int var=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de variables que deseas poner: "));
		for (i=1;i<=var;i++) {
			int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero "+i));
			
			if (num>10) {
				acumuladorNumerosMayoresDiez += num;
			}
		}
		JOptionPane.showMessageDialog(null, "Total acumulado "+acumuladorNumerosMayoresDiez);
	}
}
