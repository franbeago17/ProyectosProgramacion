package Tema5.BloqueEjercicios3_Ordenacion;

public class Ejercicio4_Seleccion {

	public static void main(String[] args) {
		int array[]= new int[5], i=0, j=0;
		System.out.println("Array sin oredenar: ");
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*1000);
			System.out.print(array[i]+"  ");
		}
		int minimo, swap;
		for (i=0;i<array.length-1;i++) {
			minimo=i;
			for (j=i+1;j<array.length;j++) {
				if (array[minimo]>array[j]) {
					minimo=j;
				}
			}
			swap=array[minimo];
			array[minimo]=array[i];
			array[i]=swap;
		}
		
		System.out.println("\n\nArray ordenado: ");
		for(i=0; i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
	}
}
