package Tema5.BloqueEjercicios2;

public class Ejercicio4 {

	public static void main(String[] args) {
		int array[]= new int[5],i=0;
		System.out.println("Array Primero: ");
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+array[i]);
		}
		int aux=array[array.length-1];
		for(i=(array.length-1);i>0;i--) {
			array[i]=array[i-1];
		}
		System.out.println("\nArray ciclado: ");
		array[0]=aux;
		for (i=0; i<array.length;i++) {
			System.out.println("numero["+i+"]:"+array[i]);
		}	
	}
}
