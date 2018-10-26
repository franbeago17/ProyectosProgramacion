package Tema5.BloqueEjercicios3_Ordenacion;

public class Ejercicio3_Shell {

	public static void main(String[] args) {
		int array[]= new int[150], i, aux, salto;
		System.out.println("Array sin oredenar: ");
		for(i=0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*1000);
			System.out.print(array[i]+"  ");
		}
		boolean cambios;
		for (salto=array.length/2;salto!=0;salto/=2) {
			cambios=true;
			while (cambios) {//Mientras se intercambie algún elemento
				cambios=false;
				for (i=salto;i<array.length;i++) {
					if (array[i-salto]>array[i]) {//Si estan desordenados
						aux=array[i];
						array[i]=array[i-salto];
						array[i-salto]=aux;
						cambios=true;//Se marca como cambio.
					}
				}
			}
		}
		
		System.out.println("\n\nArray ordenado: ");
		for(i=0; i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
	}
}
