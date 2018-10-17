package Tema5.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		int array[]= new int[5],i=0, j=0;
		System.out.println("Array Primero: ");
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.print(array[i]+"  ");
		}
		int n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de repeticiones:"));
		int direccion=Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 para ir a la derecha y 0 para ir a la izquierda:"));
		if (direccion==1) {
			for(j=0;j<n;j++) {
				System.out.println("\nDesplazamiento hacia la derecha "+(j+1));
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
		else {
			if (direccion==0) {
				for(j=0;j<n;j++) {
					System.out.println("\nDesplazamiento hacia la izquierda "+(j+1));
					int aux2=array[0];										
					for(i=0;i<(array.length-1);i++) {
						array[i]=array[i+1];
					}
					array[array.length-1]=aux2;
					for(i=0;i<array.length;i++) {
						System.out.print(array[i]+"  ");
					}
				}		
			}
		}
	}
}
