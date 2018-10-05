package Tema2.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class EjercicioMonedasInventado {

	public static void main(String[] args) {
	
		int costo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio del producto: "));
		System.out.println("Precio: "+costo);
		int dinero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dinero: "));
		System.out.println("Entregado: "+dinero);
		int vuelta=dinero-costo;
		System.out.println("Cambio: "+vuelta);
		int moneda100=vuelta/100;
		int resto100=vuelta%100;
		int moneda50=resto100/50;
		int resto50=resto100%50;
		int moneda25=resto50/25;
		int resto25=resto50%25;
		int moneda5=resto25/5;
		int resto5=resto25%5;
		int moneda1=resto5;
		int resto=0;
		if (vuelta>100) {
			System.out.println("\nMonedas de 100: "+moneda100+"\n"
					+ "Monedas de 50: "+moneda50+"\n"
							+ "Monedas de 25: "+moneda25+"\n"
									+ "Monedas de 5: "+moneda5+"\n"
											+ "Monedas de 1: "+moneda1);
		}
		else {
			if (vuelta>50) {
				System.out.println("\nMonedas de 50: "+moneda50+"\n"
						+ "Monedas de 25: "+moneda25+"\n"
						+ "Monedas de 5: "+moneda5+"\n"
								+ "Monedas de 1: "+moneda1);
			}
			else {
				if (vuelta>25) {
					System.out.println("\nMonedas de 25: "+moneda25+"\n"
							+ "Monedas de 5: "+moneda5+"\n"
									+ "Monedas de 1: "+moneda1);
				}
				else {
					if (vuelta>5) {
						System.out.println("\nMonedas de 5: "+moneda5+"\n"
								+ "Monedas de 1: "+moneda1);
					}
				}
			}
		}
	}	
}
