package Arkanoid.Version00;

public class Ladrillo extends Objeto {
	public static final int ANCHO = 32;
	public static final int ALTO = 6;
	
	public Ladrillo(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {("ladrilloArkanoidRojo.png")});
	}
	
	public void collision(Objeto o) {
		if (o instanceof Pelota) {
		  remove();
		}
	}
}
