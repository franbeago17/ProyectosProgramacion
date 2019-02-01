/**
 * Curso Básico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducción
 * 
 * http://www.planetalia.com
 * 
 */
package Arkanoid.Version00;

import java.awt.image.ImageObserver;

public interface Stage extends ImageObserver {
	public static final int WIDTH=640;
	public static final int HEIGHT=480;
	public static final int SPEED=10;
	public SpriteCache getSpriteCache();

}
