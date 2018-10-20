package Tema5.BloqueEjercicios3_Ordenacion;

public class Ejercicio2_InsercionDirecta {

	public static void main(String[] args) {
		int array[]= new int[5],i=0;
		System.out.println("Array sin oredenar: ");
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*1000);
			System.out.print(array[i]+"  ");
		}
		for (i=1;i<array.length;i++) {
			int j=i;
			int aux=array[j];
			while(j>0 && aux<array[j-1]) {
				array[j]=array[j-1];
				j--;
			}
			array[j]=aux;
		}
		System.out.print("\n\nArray rdenado:\n");
		for (i=0; i<array.length;i++) {
			System.out.print(+array[i]+"  ");
		}
	}
}
