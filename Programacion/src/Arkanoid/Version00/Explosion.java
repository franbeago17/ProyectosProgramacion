package Arkanoid.Version00;

public class Explosion extends Objeto {

	public Explosion(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"spriteExplosion1.png","spriteExplosion2.png","spriteExplosion3.png",
		"spriteExplosion4.png","spriteExplosion5.png","spriteExplosion6.png","spriteExplosion7.png",
		"spriteExplosion8.png","spriteExplosion9.png","spriteExplosion10.png","spriteExplosion11.png"});
		setFrameSpeed(7);
	}
}
