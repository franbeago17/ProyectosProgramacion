package Tema5.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		int array[]= new int[150],i=0;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+array[i]+"\n"
					+ "Multiplicado por "+numero+" es "+array[i]*numero);
		}
	}
}
