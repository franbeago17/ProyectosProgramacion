package Tema5.BloqueEjercicios1;

import javax.swing.JOptionPane;

public class EjercicioRafaMediaArrays {

	public static void main(String[] args) {
		int array[]= new int[150],sumatorio=0,i=0,numeros=0;
		float media=0;
		int limiteInferior=Integer.parseInt(JOptionPane.showInputDialog("Introduzca limite inferior: "));
		int limiteSuperior=Integer.parseInt(JOptionPane.showInputDialog("Introduzca limite superior: "));
		for(i=0; i<array.length;i++) {
			numeros=(int)Math.round(Math.random()*(limiteSuperior-limiteInferior)+limiteInferior);
			System.out.println("numero["+i+"]:"+numeros);
			sumatorio+=numeros;
		}
		media=(float)sumatorio/i;
		JOptionPane.showMessageDialog(null,"La suma de los numeros es: "+sumatorio+"\n"
				+ "La media de los numeros es: "+media);
	}
}
