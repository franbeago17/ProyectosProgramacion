package Arkanoid.Version01;

public class Ladrillo extends Objeto {
	String[] ladrillos = new String[] {"ladrilloArkanoidRojo.png", "ladrilloArkanoidVerde.png",
			"ladrilloArkanoidAzul.png", "ladrilloArkanoidRosa.png", "ladrilloArkanoidAmarillo.png", "ladrilloArkanoidAzulClarito.png"};
	
	public Ladrillo(Stage stage, int i) {
		super(stage);
		setSpriteNames(new String[] {ladrillos[i]});
	}
	
	public void collision(Objeto o) {
		if (o instanceof Pelota) {
		  remove();
		}
	}
}
