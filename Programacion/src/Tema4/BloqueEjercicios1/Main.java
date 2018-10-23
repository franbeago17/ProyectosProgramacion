package Tema4.BloqueEjercicios1;

public class Main {

	public static void main(String[] args) {
		/* 1º.- Realiza un método que reciba como parámetros de entrada tres valores enteros y uno flotante. 
		El método debe devolver la media aritmética de los cuatro valores, un valor flotante.
		"main" debe usar a esta función creada por ti, e imprimir el valor de la media en la consola de salida.
		*/
		
		Utils solucionMedia= new Utils(4, 6, 9, 2);
		solucionMedia.MiMedia();
		
		
		
		
		/* 2.- Realiza un método que pida al usuario dos números. Los dos números deben estar comprendidos entre un máximo y un mínimo.
		  "main" debe pedir al usuario dos valores: uno mínimo y otro máximo.
		   "main" debe enviar esos dos valores del usuario a otra función que, a su vez, pida dos valores al usuario teniendo en cuenta el mínimo y máximo introducidos previamente. 
		   El método no debe devolver ningún valor. 
		 */
	
		Utils peticionNumerosMaximoMinimo= new Utils(1,1, 1, 1);
		peticionNumerosMaximoMinimo.ImpresionNumeros();
		
		
		
		/* 3.- Realliza un método que pida al usuario dos valores.
		   A continuación se deben enviar a otra función, creada por ti, que devuelva el mayor valor de los dos introducidos.
		 */
		
		
		Utils mayorDosNumeros= new Utils(1,1);
		mayorDosNumeros.MayorValor();
		
		
		/* 4.- La serie de Fibonacci es una serie numérica que comienza en los números 1, 1 y continua de forma infinita, calculando cada mienbro de la serie como la suma de los dos anteriores.
		  De esta manera, la serie de Fibonacci comienza 1, 1, 2, 3, 5, 8, 13, 21, 34, 55..........
		  Debes crear un método llamado "fibonacci". 
		  El método recibirá dos argumentos de entrada, de tipo entero. 
		  Los dos argumentos deben ser miembros de la serie de Fibonacci. 
		  El método debe imprimir en pantalla los siguientes 5 términos de la serie de Fibonacci.
		 */
		
		
	}

}
