package Tema5.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		int array[]= new int[5],i=0;
			System.out.println("Array Primero: ");
			for(i=0; i<array.length;i++) {
				array[i]=(int)Math.round(Math.random()*100);
				System.out.print(array[i]+"  ");
			}
			int n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de repeticiones:")),j=0;
			for(j=0;j<n;j++) {
				System.out.println("\n\nDesplazamiento "+(j+1));
				int aux=array[array.length-1];
				for(i=(array.length-1);i>0;i--) {
					array[i]=array[i-1];
				}
				array[0]=aux;
				for (i=0; i<array.length;i++) {
					System.out.print(array[i]+"  ");
			}	
		}
	}
}
