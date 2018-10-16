package Tema5.BloqueEjercicios2;

public class Ejercicio1 {

	public static void main(String[] args) {
		int array[]= new int[150], i=0;
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*(-200)+100);
			System.out.println("numero["+i+"]:"+array[i]);
		}
		for(i=0; i<array.length;i++) {
			if (array[i]%2==0 && array[i]>0) {
				array[i]=array[i]*-1;
				System.out.println("\nEl numero ["+i+"] cambiado de signo es: "+array[i]);
			}
		}
		for (i=0; i<array.length;i++) {
			if (array[i]%2==0 && array[i]>0){
					array[i]=array[i]*-1;
					System.out.println("\nEl numero ["+i+"] cambiado de signo es: "+array[i]);
			}
		}
	}
}
