package Tema5.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		int array[]= new int[100], i=0,numero=0, sumatorioNumIndPar=0;
		for(i=0; i<array.length;i++) {
			numero=(int)Math.round(Math.random()*100);
			System.out.println("numero["+i+"]:"+numero);
			if (i%2==0) {
				sumatorioNumIndPar+=numero;
			}
		}
		JOptionPane.showMessageDialog(null,"La suma de los numeros cuyo indice es par es: "+sumatorioNumIndPar);
	}
}
