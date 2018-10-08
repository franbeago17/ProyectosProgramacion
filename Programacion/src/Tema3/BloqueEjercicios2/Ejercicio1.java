package Tema3.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		float i, media=0,acumulador=0;
		int var=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de variables que deseas poner: "));
		for (i=1;i<=var;i++) {
			float num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca numero "+i));
			acumulador+=num;
			media=acumulador/var;
		}
		JOptionPane.showMessageDialog(null,"La media de los numeros introducidos es: "+media);
	}
}
