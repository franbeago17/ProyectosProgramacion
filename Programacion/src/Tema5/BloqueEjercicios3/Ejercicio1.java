package Tema5.BloqueEjercicios3;

public class Ejercicio1 {

	public static void main(String[] args) {
		int array[]= new int[150], i=0, j=0, aux=0;
		System.out.println("Array sin oredenar: ");
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*1000);
			System.out.print(array[i]+"  ");
		}//Ordenacion por metodo de burbuja.
		for (i=0;i<array.length;i++) {
			for (j=0;j<(array.length-1);j++) {
				if (array[j]>array[j+1]) {
					//Intercambio de numeros.
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					}
				}
			}
		System.out.println("\n\nArray ordenado: ");
		for(i=0; i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
	}
}
