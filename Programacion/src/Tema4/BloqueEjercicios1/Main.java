package Tema4.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		System.out.println("El numero mayor es: "+mayor(7,3));
	}
		
		/* 1�.- Realiza un m�todo que reciba como par�metros de entrada tres valores enteros y uno flotante.
		 		El m�todo debe devolver la media aritm�tica de los cuatro valores, un valor flotante.
				"main" debe usar a esta funci�n creada por ti, e imprimir el valor de la media en la consola de salida.*/
	
	public static float media4Valores (int num1, int num2, int num3, float num4) {
		float media = (num1 + num2 + num3 + num4) / 4;
		return media;
	}	
	
	
	
		/*	3.- Realliza un m�todo que pida al usuario dos valores.
		   	A continuaci�n se deben enviar a otra funci�n, creada por ti, que devuelva el mayor valor de los dos introducidos. */
		
	
	public static int mayor(int num1, int num2) {
		if (num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
}