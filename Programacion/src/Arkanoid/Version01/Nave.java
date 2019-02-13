package Arkanoid.Version01;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Nave extends Objeto {
	
	protected static final int NAVE_SPEED = 4;
	protected int vx;
	private boolean left,right;
	
	public Nave(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {("naveArkanoid.png")});
	}

	public void act() {
		super.act();
		x+=vx;
		if (x < 0 ) 
			x = 0;
		if (x > Stage.WIDTH - getWidth())
		  x = Stage.WIDTH - getWidth();
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;}
	

	protected void updateSpeed() {
	  	vx=0;
	  	if (left) vx = -NAVE_SPEED;
	  	if (right) vx = NAVE_SPEED;
	  }
	
	public void collision(Objeto o){
		
	}
	
	public void keyReleased(KeyEvent e) {
	   	switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT : left = false; break; 
			case KeyEvent.VK_RIGHT : right = false;break;
	   	}
	   	updateSpeed();
	  }
	  
	  public void keyPressed(KeyEvent e) {
	  	switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT : left = true; break;
			case KeyEvent.VK_RIGHT : right = true; break;
	  	}
	  	updateSpeed();
	  }
	  
	  public void mouseMoved(MouseEvent e) {
		  this.x = (e.getX() - this.width/2);
	  	}
}
