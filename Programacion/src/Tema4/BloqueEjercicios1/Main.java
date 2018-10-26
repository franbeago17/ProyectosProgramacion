package Tema4.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		System.out.println("El numero mayor es: "+mayor(7,3));
	}
		
		/* 1º.- Realiza un método que reciba como parámetros de entrada tres valores enteros y uno flotante.
		 		El método debe devolver la media aritmética de los cuatro valores, un valor flotante.
				"main" debe usar a esta función creada por ti, e imprimir el valor de la media en la consola de salida.*/
	
	public static float media4Valores (int num1, int num2, int num3, float num4) {
		float media = (num1 + num2 + num3 + num4) / 4;
		return media;
	}	
	
	
	
		/*	3.- Realliza un método que pida al usuario dos valores.
		   	A continuación se deben enviar a otra función, creada por ti, que devuelva el mayor valor de los dos introducidos. */
		
	
	public static int mayor(int num1, int num2) {
		if (num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
}