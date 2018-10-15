package Tema5.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class EjercicioMayorMenor {

	public static void main(String[] args) {
		int array[]= new int[100], i=0,numero=0, mayor=0, menor=0;
		for(i=0; i<array.length;i++) {
			numero=(int)Math.round(Math.random()*100);
			System.out.println("Numero["+i+"]:"+numero);
			if (numero>mayor) {
				mayor=numero;
			}
			if (numero<menor) {
				menor=numero;
			}
		}
		JOptionPane.showMessageDialog(null,"El numero menor es: "+menor+"\n"
				+ "El numero mayor es: "+mayor);
	}
}
