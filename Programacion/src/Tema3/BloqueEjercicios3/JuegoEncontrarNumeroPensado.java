package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class JuegoEncontrarNumeroPensado {

	public static void main(String[] args) {
		int numeroPensado=(int)Math.round(Math.random()*100), intento;
		//System.out.println("numero "+numeroPensado);
		
		do {
			intento=Integer.parseInt(JOptionPane.showInputDialog("Busca el numero pensado (0-100): "));
			
			if (intento>numeroPensado) {
				JOptionPane.showMessageDialog(null, "Mi numero pensado es inferior a: "+intento);
			}
			else {
				if (intento<numeroPensado) {
					JOptionPane.showMessageDialog(null, "Mi numero pensado es superior a: "+intento);
				}
				else {
					JOptionPane.showMessageDialog(null, "¡¡¡ENHORABUENA!!! Lo has conseguido, el numero era "+numeroPensado);
				}
			}
		
		}while (intento != numeroPensado);
		
	}

}
