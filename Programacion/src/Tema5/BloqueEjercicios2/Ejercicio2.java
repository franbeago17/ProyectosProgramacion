package Tema5.BloqueEjercicios2;

public class Ejercicio2 {

	public static void main(String[] args) {

		int array1[]= new int[5],i=0, array2[]= new int[5], array3[]= new int[5];
		System.out.println("ARRAY 1");
		for(i=0; i<array1.length;i++) {
			array1[i]=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+array1[i]);
			if (i%2!=0) {
				array3[i]=array1[i];
			}
		}
		System.out.println("ARRAY 2");
		for(i=0; i<array2.length;i++) {
			array2[i]=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+array2[i]);
			if (i%2==0) {
				array3[i]=array2[i];
			} 
		}
		System.out.println("ARRAY 3");
		for(i=0; i<array3.length;i++) {
			System.out.println("numero["+i+"]:"+array3[i]);
		}
	}
}
