package Tema4.bloqueEjercicios4;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	private static int FILAS = 5;
	private static int COLUMNAS = 5;
	private static int matriz[][] = new int[FILAS][COLUMNAS];
	private static int matrizConFilaMenos[][] = new int[FILAS-1][COLUMNAS];
	private static int array[] = new int[25];
	
	private static int matriz2[][] = new int[][] {
		{1, 0, 0, 0, 0},
		{0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1}
	};
	
	private static int matriz3[][] = new int[][] {
		{1, 0, 0, 0, 0},
		{1, 1, 0, 0, 0},
		{1, 1, 1, 0, 0},
		{1, 1, 1, 1, 0},
		{1, 1, 1, 1, 1}
	};
	
	private static int matriz4[][] = new int[][] {
		{0, 1, 2, 3, 4},
		{1, 0, 2, 3, 4},
		{2, 5, 0, 8, 9},
		{3, 6, 8, 0, 10},
		{4, 7, 9, 10, 0}
	};
	
	private static int matriz5[][] = new int[][] {
		{0, 1, 2, 3, 4},
		{1, 0, 5, 6, 7},
		{2, 5, 0, 8, 9},
		{3, 6, 8, 0, 10},
		{4, 7, 9, 10, 0}
	};

	public static void main(String[] args) {
		
		rellenaMatriz();
		imprimeMatriz();
		comprobarMatrizPositiva();
		comprobarMatrizDiagonal();
		comprobarMatrizTriangularSuperior();
		comprobarMatrizSimetrica();
		//comprobarDispersa();
		meterEnArrayUnidimensional();
		matrizTraspuesta();
		matrizOpuesta();
		eliminarFila();
		
		
	}
	
	/**
	 * 
	 */
	private static void rellenaMatriz() {
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				int numAleat = (int) Math.round(Math.random()*100);
				matriz[i][j] = numAleat;
			}
		}
	}
	
	
	/**
	 * 
	 */
	private static void imprimeMatriz() {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 
	 */
	private static void comprobarMatrizPositiva() {
		System.out.println();
		boolean todosPositivos = false;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] >= 0) {
					todosPositivos = true;
				}
				else {
					todosPositivos = false;
				}
			}
		}
		if (todosPositivos == true) {
			System.out.println("La matriz es positiva");
		}
	}
	
	
	/**
	 * 
	 */
	private static void comprobarMatrizDiagonal() {
		System.out.println();
		boolean matrizDiagonal = true;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz2[i][j] != 0 && i != j) {
					matrizDiagonal = false;
				}
			}
		}
		if (matrizDiagonal == true) {
			System.out.println("La matriz es diagonal");
		}
		else {
			System.out.println("La matriz no es diagonal");
		}
	}
	
	
	/**
	 * 
	 */
	private static void comprobarMatrizTriangularSuperior() {
		System.out.println();
		boolean matrizTriangularSuperior = true;
		
		 for (int i = 1; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (i != j && matriz3[i][j] != 0 && j > i || i > j) {
					matrizTriangularSuperior = false;
				}
			}
		 }
		 if (matrizTriangularSuperior == true) {
			 System.out.println("La matriz es triangular");
		 }
		 else {
			 System.out.println("La matriz no es triangular");
		}
	}
	
	/**
	 * 
	 */
	private static void comprobarMatrizSimetrica() {
		System.out.println();
		boolean matrizSimetrica = true;
		
		for (int i = 1; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz5[i][j] != matriz5[j][i]) {
					matrizSimetrica = false;
				}
			}
		}
		if (matrizSimetrica == true) {
			System.out.println("La matriz es simetrica");
		}
		else {
			System.out.println("La matriz no es simetrica");
		}
	}
	
	
	/**
	 * 
	 */
	/*private static void comprobarDispersa() {
		boolean contieneCero;
		
		//Busqueda de un valor 0 en cada fila
		for (int i = 0; i < matriz.length; i++) {
			contieneCero=false;
			for (int j = 0; j < matriz[i].length; j++) {
				contieneCero = true;
			}
		}
		
		//Busqueda de un valor 0 en cada columna
		for (int i = 0; i < matriz[0].length; i++) {
			contieneCero=false;
			for (int j = 0; j < matriz.length; j++) {
				contieneCero = true;
			}
		}
	}
	*/
	
	/**
	 * 
	 */
	private static void meterEnArrayUnidimensional() {
		System.out.println();
		System.out.println("<------------------------------------------------------------------------------------------------------->");
		System.out.println("Matriz en array unidimensional");
		for (int k = 0; k < 1; k++) {
			for (int i = 0; i < FILAS; i++) {
				for (int j = 0; j < COLUMNAS; j++) {
					array[k] = matriz[i][j];
					System.out.print(array[k] + "\t");
				}
			}
		}
		System.out.println();
	}
	
	
	/**
	 * 
	 */
	private static void matrizTraspuesta() {
		System.out.println("<------------------------------------------------------------------------------------------------------->");
		System.out.println("Matriz Traspuesta");
		System.out.println();
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 
	 */
	private static void matrizOpuesta() {
		System.out.println();
		System.out.println("<------------------------------------------------------------------------------------------------------->");
		System.out.println("Matriz Opuesta");
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(((matriz[i][j]) * -1) + "\t");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 
	 */
	private static void eliminarFila() {
		System.out.println("<--------------------------------------------------------------------------->");
		System.out.println("Matriz con una fila eliminada por el usuario");
		System.out.println();
		int usuario = Integer.parseInt(JOptionPane.showInputDialog("Elije la fila a eliminar (entre 0 y 4)"));
		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (i != usuario) {
					matrizConFilaMenos[contador][j] = matriz[i][j];
					System.out.print(matrizConFilaMenos[contador][j] + "\t");
				}
			}
			if (i != usuario) {
				contador++;
				System.out.println();
			}
		}
	}
}

