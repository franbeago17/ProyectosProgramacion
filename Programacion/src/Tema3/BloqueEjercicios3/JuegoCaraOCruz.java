package Tema3.BloqueEjercicios3;

import javax.swing.JOptionPane;

public class JuegoCaraOCruz {

	public static void main(String[] args) {
		int resultado, contadorUsuario=0, contadorPC=0, caraOCruz, marcador=0;
		do {
			caraOCruz=Integer.parseInt(JOptionPane.showInputDialog("Elija cara(Para cara ->0) o cruz(Para cruz ->1)"));
			resultado=(int)Math.round(Math.random());
			
			if (resultado==caraOCruz) {
				contadorUsuario++;
				JOptionPane.showMessageDialog(null, "Has ganado esta ronda\n"
						+ "Marcador: "+contadorUsuario+"--"+contadorPC);
			}
			else {
				contadorPC++;
				JOptionPane.showMessageDialog(null, "Has perdido esta ronda\n"
						+ "Marcador: "+contadorUsuario+"--"+contadorPC);
			}
		}while(contadorUsuario!=3 && contadorPC!=3);
		
		if (contadorUsuario==3) {
			JOptionPane.showMessageDialog(null, "¡¡ENHORABUENA!! Has ganado!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Vuelve a intentarlo parguelitas ;P ");

		}
	}

}
