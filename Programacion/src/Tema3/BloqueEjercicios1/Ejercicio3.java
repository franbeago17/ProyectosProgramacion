package Tema3.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		int i, contadorNumerosNegativos=0,contadorNumerosPositivos=0;
		int var=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de variables que deseas poner: "));
		
		for (i=1;i<=var;i++) {
			int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero "+i));
			
			if (num>=0) {
				contadorNumerosPositivos++;
			}
			else {
				contadorNumerosNegativos++;
			}
		}
		JOptionPane.showMessageDialog(null, "Numeros positivos: "+contadorNumerosPositivos+"\n"
				+ "Numeros negativos: "+contadorNumerosNegativos);
	}

}
