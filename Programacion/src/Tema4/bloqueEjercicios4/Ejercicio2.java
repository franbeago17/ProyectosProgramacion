package Tema4.bloqueEjercicios4;

public class Ejercicio2 {

	public static void main(String[] args) {
		analizaArray();
	}
	
	public static void analizaArray() {
		double array[] = new double[21];
		int aprobados = 0;
		int suspensos = 0;
		double porcentajeAprobados = 0;
		double porcentajeSuspensos = 0;
		
		for (int i = 0; i < array.length; i++) {
			double numAleat = (double) Math.round(Math.random()*10);
			array[i] = numAleat;
		}
		
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] >= 5) aprobados++;
			else suspensos++;
		}
		
		porcentajeAprobados =aprobados * 100 / ((float)array.length);
		porcentajeSuspensos =suspensos * 100 / ((float)array.length);
		System.out.println("El porcentaje de aprobados es: " + porcentajeAprobados + " y el de suspensos: " + porcentajeSuspensos);
	}
}
