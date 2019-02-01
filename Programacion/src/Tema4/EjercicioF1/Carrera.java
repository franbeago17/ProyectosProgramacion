package Tema4.EjercicioF1;

import javax.swing.JOptionPane;

public class Carrera {

	/*
	 * //Singleton
	 *  public static Carrera instance = null;
	 *  public static Carrera getinstance() { 
			if (instance == null) { 
			instance = new Carrera();
			} return instance; 
	 *  }
	 */

	// Necesito un array de elementos de tipo "Vehiculo", deben ser 5
	private Vehiculo vehiculos[] = new Vehiculo[5];

	/**
	 * Constructor
	 */
	public Carrera() {
		super();
		// Inicializaci�n de los veh�culos
		vehiculos[0] = new Coche("Bertha Benz", "ff7c7c");
		vehiculos[1] = new Moto("Dani Pedrosa", "ffe97c");
		vehiculos[2] = new Coche("Fernando Alonso", "82ff7c");
		vehiculos[3] = new Coche("Mar�a de Villota", "8effd9");
		vehiculos[4] = new Moto("Ana Carrasco", "d18eff");
	}

	public void turnos() {
		int i;
		do {
			for (i = 0; i < vehiculos.length - 1; i++) {
				vehiculos[i].avanza(); // Recorremos todos los vehiculos pidiendole que avancen
				System.out.println("El veh�culo " + vehiculos[i].getNombre() +" ha recorrido " + vehiculos[i].getX() + " metros."); // Les pedimos su posici�n
				//JOptionPane.showMessageDialog(null, "STOP");
			}
		} while (!(vehiculos[i].getX() < 500));
	}
}
