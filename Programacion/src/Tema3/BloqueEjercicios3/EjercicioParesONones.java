package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class EjercicioParesONones {

	public static void main(String[] args) {
		int manoIzPC, manoDrchaPc, manoIzU, manoDrchaU;
		manoIzPC=(int)Math.round(Math.random()*5);
		manoDrchaPc=(int)Math.round(Math.random()*5);
		int decision=Integer.parseInt(JOptionPane.showInputDialog("Elige pares(pares->0) o nones(nones->1)"));
		if (decision>1 || decision<0) {
			JOptionPane.showMessageDialog(null,"ERROR, por favor reinicie el juego.");
			System.exit(0);
		}
		manoDrchaU=Integer.parseInt(JOptionPane.showInputDialog("Introduce dedos a sacar(mano izquierda)"));
		manoIzU=Integer.parseInt(JOptionPane.showInputDialog("Introduce dedos a sacar(mano izquierda)"));
		if (manoDrchaU>5) {
			JOptionPane.showMessageDialog(null,"Tu tonto, que tienes 5 dedos en cada mano colgao");
			System.exit(0);
		}
		int sumaTotal=(manoDrchaU+manoIzU+manoDrchaPc+manoIzPC)%2;
		JOptionPane.showMessageDialog(null,"El PC ha mostrado "+manoIzPC+"en la mano izquierda y "+manoDrchaPc+"en la derecha.");
		if (decision==0 && sumaTotal==0) {
			JOptionPane.showMessageDialog(null,"Ganan los pares!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Ganan los nones!");
		}
	}
}
