package Tema4.Ejercicio3EnRayaDeRafa.src;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RatonEscuchadorAutentico extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Soy el ratón escuchador auténtico y me han hecho clic");
	}

}
