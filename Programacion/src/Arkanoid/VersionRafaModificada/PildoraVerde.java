package Arkanoid.VersionRafaModificada;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class PildoraVerde extends Actor {
	
	public PildoraVerde(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		// Carga de los sprites de la explosión
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraVerde1.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraVerde2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraVerde3.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraVerde4.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraVerde5.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pildoraVerde6.png"));
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
