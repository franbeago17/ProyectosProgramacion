package Tema5.BloqueEjercicios1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int array[]= new int[5], i=0;
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+array[i]);
		}
		System.out.println("Array Inverso");
		for(i=array.length-1; i>=0;i--) {
			System.out.println("numero["+i+"]:"+array[i]);
		}
	}
}
