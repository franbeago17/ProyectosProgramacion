package Tema4.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Utils {
	
	
	public int numero1, numero2, numero3;
	public float numero4, suma, media;
	public int maximo;
	public int minimo;
	
	//Ejercicio 1.
	
	public Utils(int valor1, int valor2, int valor3, float valor4) {
		numero1=valor1;
		numero2=valor2;
		numero3=valor3;
		numero4=valor4;
		suma=valor1+valor2+valor3+valor4;
		media=(suma/4);	
	}
	
	public void MiMedia() {
		JOptionPane.showMessageDialog(null, "La media de los número es: "+media);
	}
	
	
	//Ejercicio 2.
	
	public Utils(int valor1, int valor2, int valorMaximo, int valorMinimo) {
		valorMaximo=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite maximo"));
		valorMinimo=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite minimo"));
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
		
		maximo=valorMaximo;
		minimo=valorMinimo;
		numero1=valor1;
		numero2=valor2;
		
		if (numero1>maximo || numero1<minimo) {
			JOptionPane.showMessageDialog(null, "ERROR.No puede introducir numeros mayores que "+maximo+" y menores que "+minimo);
			System.exit(0);
		}
		if (numero2>maximo || numero2<minimo) {
			JOptionPane.showMessageDialog(null, "ERROR.No puede introducir numeros mayores que "+maximo+" y menores que "+minimo);
			System.exit(0);
		}
	}
	
	public void ImpresionNumeros() {
		JOptionPane.showMessageDialog(null, "Los numeros introducidos son: "+numero1+" y "+numero2);
	}

	
	//Ejercicio 3.
	
	public Utils(int valor1, int valor2) {
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
		numero1=valor1;
		numero2=valor2;
	}
	
	public void MayorValor() {
		if (numero1>numero2) {
			JOptionPane.showMessageDialog(null, "El numero mayor es: "+numero1);
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero mayor es: "+numero2);
		}
	}
	
	
	//Ejercicio 4.
	
	
	
	
	
	
	
}
