package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

import javax.swing.JOptionPane;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		
		String menu="Creacion de datos de antiguedades\n"
				+ "\n1.-Joyas"
				+ "\n2.-Libros"
				+ "\n3.-Mascaras"
				+ "\n4.-Sellos"
				+ "\n0.-Salir del programa";
		
		int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		do {
			if (opcion>0 && opcion<5) {
				Antiguedades antiguedad;
				int añoFabricacionPorDefecto=(Integer.parseInt(JOptionPane.showInputDialog("Introduzca año de fabricacion:")));
				float precioDeVentaPorDefecto=(Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio de venta:")));
				String origenPorDefecto=(JOptionPane.showInputDialog("Introduzca origen:"));
				switch (opcion) {
					case 1: //Joyas
						antiguedad = new Joyas();
						((Joyas)antiguedad).setMaterialFabricacion(JOptionPane.showInputDialog("Introduzca material de fabricacion:"));
						System.out.println("Esta joya tiene estas caracteristicas: "+ antiguedad);
						break;
					case 2: //Libros
						antiguedad = new Libros();
				}
			}
		
		}while(opcion!=0);
	}
}
