package Arkanoid.VersionRafaModificada;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Animacion extends Actor {
	/**
	 * Constructor
	 */
	public Animacion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		// Carga de los sprites de la explosión
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 1.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 3.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 4.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 5.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 6.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 7.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 8.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 9.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 10.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 11.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 12.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 13.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 14.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 15.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 16.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 17.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 18.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 19.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 20.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 21.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 22.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 23.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 24.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 25.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 26.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 27.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 28.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 29.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 30.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 31.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 32.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 33.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 34.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Capa 35.png"));
		
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
