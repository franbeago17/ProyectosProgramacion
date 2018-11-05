package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

import javax.swing.JOptionPane;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		
		Joyas joya= new Joyas();
		joya.setAñoDeFabricacion(1934);
		joya.setMaterialFabricacion(JOptionPane.showInputDialog("Introduzca material de fabricacion:"));
		joya.setOrigen(JOptionPane.showInputDialog("Introduzca origen:"));
		joya.setPrecioDeVenta(34);
		System.out.println("Esta joya tiene estas caracteristicas: "+ joya);
	}
}
