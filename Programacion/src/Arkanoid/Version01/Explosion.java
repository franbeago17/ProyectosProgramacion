package Arkanoid.Version01;

public class Explosion extends Objeto {

	public Explosion(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"explosionArkanoid1.png","explosionArkanoid2.png","explosionArkanoid3.png",
		"explosionArkanoid4.png","explosionArkanoid5.png","explosionArkanoid6.png","explosionArkanoid7.png",
		"explosionArkanoid8.png","explosionArkanoid9.png","explosionArkanoid10.png","explosionArkanoid11.png"});
		setFrameSpeed(3);
	}
	
	
	public void act() {
        super.act();
        if(currentFrame==(getSpriteNames().length-1)) {
            remove();
        }
    }
}
