package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

import javax.swing.JOptionPane;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		int opcion;
		do {
			String menu= new String("Creacion de datos de antiguedades\n"
					+ "\n1.-Joyas"
					+ "\n2.-Libros"
					+ "\n3.-Mascaras"
					+ "\n4.-Sellos"
					+ "\n0.-Salir del programa");
			
			 opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (opcion>1 && opcion<5) {
				Antiguedades antiguedad=null;
				
				switch (opcion) {
					case 1: //Joyas
						antiguedad = new Joyas();
						Joyas joya = (Joyas) antiguedad;
						joya.setMaterialFabricacion(JOptionPane.showInputDialog("Introduzca material de fabricacion:"));
						break;
					case 2: //Libros
						antiguedad = new Libros();
						Libros libro = (Libros) antiguedad;
						libro.setAutor(JOptionPane.showInputDialog("Introduzca autor:"));
						libro.setTitulo(JOptionPane.showInputDialog("Introduzca titulo:"));
						break;
					case 3: //Mascaras
						antiguedad = new Mascaras();
						Mascaras mascara = (Mascaras) antiguedad;
						mascara.setAntiguedad(Integer.parseInt(JOptionPane.showInputDialog("Introduzca antiguedad:")));
						mascara.setMaterial(JOptionPane.showInputDialog("Introduzca material:"));
						mascara.setTribuPerteneciente(JOptionPane.showInputDialog("Introduzca tribu perteneciente:"));
						break;
					case 4: //Sellos
						antiguedad = new Sellos();
						Sellos sello = (Sellos) antiguedad;
						sello.setEpoca(Integer.parseInt(JOptionPane.showInputDialog("Introduzca epoca:")));
						sello.setFabricante(JOptionPane.showInputDialog("Introduzca fabricante:"));
						break;
				}
				
				antiguedad.setAñoDeFabricacion(Integer.parseInt(JOptionPane.showInputDialog("Introduzca aÃ±o de fabricacion:")));
				antiguedad.setPrecioDeVenta(Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio de venta:")));
				antiguedad.setOrigen(JOptionPane.showInputDialog("Introduzca origen:"));
				JOptionPane.showMessageDialog(null,"Caracteristicas de " + antiguedad);
			}
		}while(opcion!=0);
	}
}
