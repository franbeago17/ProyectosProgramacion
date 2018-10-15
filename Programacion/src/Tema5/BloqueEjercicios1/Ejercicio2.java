package Tema5.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		int array[]= new int[100], i=0,numero=0;
		for(i=0; i<array.length;i++) {
			numero=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+numero);
		}
		int numeroABuscar=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 0 y 100: "));
		for (i=0; i<array.length;i++) {
			if (numeroABuscar==numero) {
				JOptionPane.showMessageDialog(null,"El numero "+numeroABuscar+" se encuentra en la posicion "+i);
			}
		}
		if (numeroABuscar!=numero) {
			JOptionPane.showMessageDialog(null,"El numero "+numeroABuscar+" no se encuentra en la lista");
		}
	}
}
