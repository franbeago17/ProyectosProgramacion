package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class EjercicioCartaMayor {

	public static void main(String[] args) {
		int cartaPC, cartaU, paloU, paloPC;
		cartaPC=(int)Math.round(Math.random()*13);
		cartaU=(int)Math.round(Math.random()*13);
		paloU=(int)Math.round(Math.random()*3); //Siendo Picas el 4, rombos el 1, treboles el 2 y corazones el 0.
		paloPC=(int)Math.round(Math.random()*3);
			JOptionPane.showMessageDialog(null,"Tu carta es (siendo 0 el numero mas bajo de la baraja y 13 el mas alto): "+cartaU+"\n"
					+ "Y tu palo es (siendo el 4 picas, 1 diamantes, 2 treboles y 0 corazones : "+paloU);
			
			JOptionPane.showMessageDialog(null,"La de tu contrincante es: "+cartaPC+"\n"
					+ "Del palo: "+paloPC);
			if (paloU==paloPC) {
				JOptionPane.showMessageDialog(null,"ERROR, los palos han sido los mismos, por favor reinicia el juego.");
				System.exit(0);
			}
			else {
				if (cartaU>cartaPC && paloU!=paloPC) {
					JOptionPane.showMessageDialog(null,"ENHORABUENA!!! Has ganado!");
				}
				else {
					JOptionPane.showMessageDialog(null,"MALA SUERTE, intentalo de nuevo");
			}
		}
	}
}
