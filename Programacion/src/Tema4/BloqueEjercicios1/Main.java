package Tema4.BloqueEjercicios1;

public class Main {

	public static void main(String[] args) {
		/* 1�.- Realiza un m�todo que reciba como par�metros de entrada tres valores enteros y uno flotante. 
		El m�todo debe devolver la media aritm�tica de los cuatro valores, un valor flotante.
		"main" debe usar a esta funci�n creada por ti, e imprimir el valor de la media en la consola de salida.
		*/
		
		Utils solucionMedia= new Utils(4, 6, 9, 2);
		solucionMedia.MiMedia();
		
		
		
		
		/* 2.- Realiza un m�todo que pida al usuario dos n�meros. Los dos n�meros deben estar comprendidos entre un m�ximo y un m�nimo.
		  "main" debe pedir al usuario dos valores: uno m�nimo y otro m�ximo.
		   "main" debe enviar esos dos valores del usuario a otra funci�n que, a su vez, pida dos valores al usuario teniendo en cuenta el m�nimo y m�ximo introducidos previamente. 
		   El m�todo no debe devolver ning�n valor. 
		 */
	
		Utils peticionNumerosMaximoMinimo= new Utils(1,1, 1, 1);
		peticionNumerosMaximoMinimo.ImpresionNumeros();
		
		
		
		/* 3.- Realliza un m�todo que pida al usuario dos valores.
		   A continuaci�n se deben enviar a otra funci�n, creada por ti, que devuelva el mayor valor de los dos introducidos.
		 */
		
		
		Utils mayorDosNumeros= new Utils(1,1);
		mayorDosNumeros.MayorValor();
		
		
		/* 4.- La serie de Fibonacci es una serie num�rica que comienza en los n�meros 1, 1 y continua de forma infinita, calculando cada mienbro de la serie como la suma de los dos anteriores.
		  De esta manera, la serie de Fibonacci comienza 1, 1, 2, 3, 5, 8, 13, 21, 34, 55..........
		  Debes crear un m�todo llamado "fibonacci". 
		  El m�todo recibir� dos argumentos de entrada, de tipo entero. 
		  Los dos argumentos deben ser miembros de la serie de Fibonacci. 
		  El m�todo debe imprimir en pantalla los siguientes 5 t�rminos de la serie de Fibonacci.
		 */
		
		
	}

}
