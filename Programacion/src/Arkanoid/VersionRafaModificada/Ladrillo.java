package Arkanoid.VersionRafaModificada;


import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a cada ladrillo de los que pondremos sobre la pantalla
 * @author R
 *
 */
public class Ladrillo extends Actor {
	// Damos un ancho y un alto específico al ladrillo. Suponemos que todos los ladrillos serán iguales
	public static final int ANCHO = 46;
	public static final int ALTO = 20;
	public static final int ESPACIO_ENTRE_LADRILLOS = 2;
	private int codigoImagen;
	
	
	/**
	 * Constructor
	 */
	public Ladrillo() {
		super();
		
		this.x = 10;
		this.y = 10;
		this.ancho = ANCHO;
		this.alto = ALTO;
		
	}

	/**
	 * Constructor parametrizado
	 * @param x
	 * @param y
	 * @param color
	 */
	public Ladrillo(int x, int y,int imagen) {
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidOro.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidPlata.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidAmarillo.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidRojo.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidVerde.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidAzul.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidRosa.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloArkanoidAzulClarito.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("darth-vader.jpg"));
		this.x = x;
		this.y = y;
		this.ancho = ANCHO;
		this.alto = ALTO;
		this.spriteActual = nuevosSprites.get(imagen);
		this.codigoImagen=imagen;
		
	}
	

	
	/**
	 * Colisión detectada
	 */
	@Override
	public void colisionProducidaConOtroActor(Actor actorColisionado) {
		if(this.codigoImagen!=0){
				super.colisionProducidaConOtroActor(actorColisionado);
				// Si un ladrillo detecta una colisión con un objeto de tipo "Bola", debe desaparecer
				if (actorColisionado instanceof Bola) {
					eliminar();
					// Creo un nuevo actor de tipo Explosion y lo centró respecto a la posición del ladrillo
					Explosion explosion = new Explosion(this.getX(), this.getY());
					explosion.setX(this.x + Ladrillo.ANCHO / 2 - explosion.getAncho() / 2);
					Arkanoid.getInstancia().agregarActor(explosion);
					// Reproduzco el sonido de la explisión
					CacheRecursos.getInstancia().playSonido("Explosion.wav");
				}
			}
		else {
			CacheRecursos.getInstancia().playSonido("Arkanoid-SFX-05.wav");
		}
	}
}
