package Tema4.ejercicio3EnRaya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.naming.InitialContext;

public class Principal {
	
	private static Jugador jugadores[] = new Jugador[2];
	private static int indiceJugadorActivo = 0;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ventana ventana = new Ventana();
		
		initJugadores();
		
	}

	
	/**
	 * 
	 */
	private static void initJugadores () {
		
		Color colorX = new Color (51,114,102);
		Color colorY = new Color (44,62,80);
		jugadores[0] = new Jugador ("Sandra", 1) {
			@Override
			public void paint(Graphics g, int offsetX, int offsetY) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.setStroke(GuiUtil.WIDE_STROKE);
				g2d.setColor(colorX);
				g2d.drawLine(offsetX + Celda.PADDING *5, offsetY + Celda.PADDING *5, offsetX + Celda.LADO - Celda.PADDING *5, offsetY + Celda.LADO - Celda.PADDING *5);
				g2d.drawLine(offsetX + Celda.LADO - Celda.PADDING *5, offsetY + Celda.PADDING *5, offsetX + Celda.PADDING *5, offsetY + Celda.LADO - Celda.PADDING  *5);
			}
		};
		
		jugadores[1] = new Jugador ("Rafa", 2) {
			@Override
			public void paint(Graphics g, int offsetX, int offsetY) {
				g.setColor(colorY);
				g.drawOval(offsetX + Celda.PADDING *5, offsetY + Celda.PADDING *5, Celda.LADO - 2 * Celda.PADDING *5, Celda.LADO - 2 * Celda.PADDING *5);
			}
		};
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static Jugador getJugadorTurnoActivo () {
		return jugadores[indiceJugadorActivo];
	}
	
	/**
	 * 
	 */
	public static void avanzaTurno () {
		if (indiceJugadorActivo == 0) {
			indiceJugadorActivo = 1;
		}
		else {
			indiceJugadorActivo = 0;
		}
	}
}
