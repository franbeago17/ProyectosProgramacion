package Arkanoid.VersionRafaModificada;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class PildoraAmarilla extends Actor {

	public PildoraAmarilla(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		// Carga de los sprites de la explosión
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraAmarilla1.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraAmarilla2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraAmarilla3.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraAmarilla4.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraAmarilla5.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraAmarilla6.png"));
		this.setSpritesDeAnimacion(nuevosSprites);
		// Sprite actual
		this.spriteActual = this.getSpritesDeAnimacion().get(0);
		// Velocidad de cambio de sprite
		this.velocidadDeCambioDeSprite = 1;
	}
	
	/**
	 * Método que se llamará para cada actor, en cada refresco de pantalla del juego
	 */
	@Override
	public void act() {
		super.act();
		this.setY(this.getY()+2);
	}
	
	public void colisionProducidaConOtroActor(Actor actorColisionado) {
		if (actorColisionado instanceof Nave) {
			this.eliminar();
		}
	}

}
