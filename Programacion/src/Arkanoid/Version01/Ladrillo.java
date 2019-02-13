package Arkanoid.Version01;

public class Ladrillo extends Objeto {
	String[] ladrillos = new String[] {"ladrilloArkanoidRojo.png", "ladrilloArkanoidVerde.png",
			"ladrilloArkanoidAzul.png", "ladrilloArkanoidRosa.png", "ladrilloArkanoidAmarillo.png", "ladrilloArkanoidAzulClarito.png"};
	
	public Ladrillo(Stage stage, int i) {
		super(stage);
		setSpriteNames(new String[] {ladrillos[i]});
	}
	
	public void collision(Objeto o) {
		super.collision(o);
		// Si un ladrillo detecta una colisión con un objeto de tipo "Pelota", debe desaparecer
		if (o instanceof Pelota) {
			remove();
		}
	}
}
