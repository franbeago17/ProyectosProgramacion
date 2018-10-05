package Tema3.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		int i, acumuladorNumerosMayoresDiez=0;
		for (i=1;i<5;i++) {
			int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero "+i));
			
			if (num>10) {
				acumuladorNumerosMayoresDiez += num;
			}
		}
		JOptionPane.showMessageDialog(null, "Total acumulado "+acumuladorNumerosMayoresDiez);
	}
}
