package Arkanoid.Version00;

public class Pelota extends Objeto {
	protected float vx, vy;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {("pelotaArkanoid.png")});
	}
	
	public void act() {
		x+=vx;
		y+=vy;
		if (x < 0 || x > (Stage.WIDTH - 18)) {
		  vx = -vx;
		}
		if (y < 0 || y > (Stage.HEIGHT - 18)) {
			  vy = -vy;
		}
	}
	
	public void collision(Objeto o) {
		if (o instanceof Ladrillo) {
			vy = -vy;
		}
		
		if (o instanceof Nave) {
			vy = -vy;
		}
		
		if (o instanceof Ladrillo) {
			vx = -vx;
		}
	}
	
	public float getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	public float getVy() { return vy; }
	public void setVy(int i) {vy = i;	}

}
