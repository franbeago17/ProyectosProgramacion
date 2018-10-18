package Tema5.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class EjercicioMayorMenor {

	public static void main(String[] args) {
		int array[]= new int[150], i=0,mayor=0,menor=100;
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.println("Numero["+i+"]:"+array[i]);
			if (array[i]>mayor) {
				mayor=array[i];
			}
			else {
				if (array[i]<menor) {
					menor=array[i];
				}
			}
		}
		JOptionPane.showMessageDialog(null,"El numero menor es: "+menor+"\n"
				+ "El numero mayor es: "+mayor);
	}
}
