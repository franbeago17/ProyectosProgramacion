package Arkanoid.VersionRafaModificada;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

/**
 * Clase que representa la bola del juego, que rebotará y destruirá ladrillos
 * @author R
 *
 */
public class Bola extends Objeto {
	// Pienso que, aunque más adelante en el juego pueda haber varias bolas, en principio su diámetro no cambia
	public static final int DIAMETRO = 15;
	
	// La bola necesita poder moverse en los dos ejes: x e y. Por tanto necesitamos dar valores de velocidad en los dos
	private int velocidadX = 2;
	private int velocidadY = 2;
	
	/**
	 * 
	 */
	public Bola() {
		super();
		this.spriteActual = CacheRecursos.getInstancia().getImagen("pelotaArkanoid.png"); // La bola se pinta de forma vectorial
		this.x = Arkanoid.ANCHO / 2;
		this.y = Arkanoid.ALTO / 2;
	}


	
	/**
	 * La bola actúa en cada iteración del programa
	 */
	public void act() {
		// Si la bola se toca el borde por la izquierda o por la derecha, su velocidad cambia de signo
		if (this.x < 0 || this.x > Arkanoid.ANCHO - DIAMETRO) {
			this.velocidadX = 0 - this.velocidadX;
		}
		// Si la bola se toca el borde por arriba o por abajo, su velocidad cambia de signo
		if (this.y < 0 || this.y > Arkanoid.ALTO - DIAMETRO) {
			this.velocidadY = 0 - this.velocidadY;
		}
		// Agregamos las velocidades respectivas a cada eje para la bola
		this.x += this.velocidadX;
		this.y += this.velocidadY;
	}
	
	public void collision(Objeto o) {
		if (o instanceof Ladrillo) {
			velocidadY = -velocidadY;
			velocidadX = -velocidadX;
		}
		
		if (o instanceof Nave) {
			velocidadY = -velocidadY;
		}
	}
	
	public float getVx() { return velocidadX; }
	public void setVx(int i) {velocidadX = i;	}
	public float getVy() { return velocidadY; }
	public void setVy(int i) {velocidadY = i;	}


}
