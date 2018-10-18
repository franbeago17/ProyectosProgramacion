package Tema5.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		int array[]= new int[5], i=0,numero=0, sumaPares=0, sumaImpares=0;
		for(i=0; i<array.length;i++) {
			numero=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+numero);
			if (numero%2==0) {
				sumaPares+=numero;
			}
			else {
				sumaImpares+=numero;
			}
		}
		JOptionPane.showMessageDialog(null,"La suma de los numeros pares es "+sumaPares+"\n"
				+ "La suma de los impares es "+sumaImpares);
	}
}
