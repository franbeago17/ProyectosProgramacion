package Arkanoid.VersionRafaModificada;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Explosion extends Actor {
	/**
	 * Constructor
	 */
	public Explosion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		// Carga de los sprites de la explosión
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid1.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid3.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid4.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid5.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid6.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid7.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid8.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid9.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid10.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosionArkanoid11.png"));
		this.setSpritesDeAnimacion(nuevosSprites);
		// Sprite actual
		this.spriteActual = this.getSpritesDeAnimacion().get(0);
		// Velocidad de cambio de sprite
		this.velocidadDeCambioDeSprite = 5;
	}
	

	/**
	 * Método que se llamará para cada actor, en cada refresco de pantalla del juego
	 */
	@Override
	public void act() {
		super.act();
		if (this.spriteActual.equals(this.spritesDeAnimacion.get(this.spritesDeAnimacion.size()-1))) {
			this.eliminar();
		}
	}

}
