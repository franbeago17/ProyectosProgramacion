package Tema3.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		int i, acumuladorNumerosNegativos=0,acumuladorNumerosPositivos=0;
		int var=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de variables que deseas poner: "));
		
		for (i=1;i<=var;i++) {
			int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero "+i));
			
			if (num>=0) {
				acumuladorNumerosPositivos++;
			}
			else {
				acumuladorNumerosNegativos++;
			}
		}
		JOptionPane.showMessageDialog(null, "Numeros positivos: "+acumuladorNumerosPositivos+"\n"
				+ "Numeros negativos: "+acumuladorNumerosNegativos);
	}

}
