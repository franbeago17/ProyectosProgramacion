package Tema4.bloqueEjercicios4;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int longi = (int) Math.round(Math.random()*30);
		
		int array[] = new int[longi];
		
		for (int i = 0; i < array.length; i++) {
			int numAleat = (int) Math.round(Math.random()*100);
			array[i] = numAleat;
		}
		
		System.out.println(comprobacion(array));
	}
	
	public static int comprobacion(int[] array) {
		if (array.length%2==0) {
			return -1;
		}
		else {
			int mitad = array.length / 2;
			int mid = array[mitad];
			return mid;
		}
	} 
}
