package Tema2.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String menu = "MENU\n"
				+ "1.- Suma de dos numeros.\n"
				+ "2.- Resta de dos numeros.\n"
				+ "3.- Multiplicacion de dos numeros.\n"
				+ "4.- Division de dos numeros.\n"
				+ "5.- Raiz de un numero.\n"
				+ "6.- Rai�z n-esima de un numero.\n"
				+ "7.- Potencia de un numero.\n"
				+ "8.- Modulo entre dos numeros";
		
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		if (opcion<1 || opcion>8) {
			JOptionPane.showMessageDialog(null,"Error!!\nNo se pueden introducir casos que no existan.");
			System.exit(0);
		}
		float num1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca primer numero: "));
		float num2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo numero: "));
		float suma=num1+num2;
		float resta=num1-num2;
		float multiplicacion=num1*num2;
		float division=num1/num2;
		float raiz=(float)Math.sqrt(num1);
		float potencia=(float)Math.pow(num1, num2);
		float modulo=num1%num2;
		float raiznesima=(float) Math.pow(num2, (float)(1/num1));
		String mensaje="";
		
		switch (opcion) {
		case 1: //suma de dos numeros
			mensaje="El resultado es: "+suma;
			break;
		case 2: //resta de dos numeros
			mensaje="El resultado es: "+resta;
			break;
		case 3: //multiplicacion de dos numeros
			mensaje="El resultado es: "+multiplicacion;
			break;
		case 4: //division de dos numeros
			mensaje="El resultado es: "+division;
			break;
		case 5: //raiz de dos numeros
			mensaje="El resultado es: "+raiz;
			break;
		case 6: //raiz n-esima de dos numeros
			mensaje="El resultado es: "+raiznesima;
			break;
		case 7: //potencia de dos numeros
			mensaje="El resultado es: "+potencia;
			break;
		case 8: //modulo de dos numeros
			mensaje="El resultado es: "+modulo;

			break;
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
