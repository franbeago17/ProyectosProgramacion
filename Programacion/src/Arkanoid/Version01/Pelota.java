package Arkanoid.Version01;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Pelota extends Objeto {
	protected float vx, vy;
	protected boolean isPulsado = false;
	private boolean left,right;
	private TrayectoriaRecta trayectoria = null;
	private PuntoAltaPrecision coordenadas = null;
	private float pixelsXFrame = 3;
	private long miliSec = System.currentTimeMillis();
	private long lugarInter;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {("pelotaArkanoid.png")});
	}
	
	
	public void act() {
		long miliSecAct = System.currentTimeMillis();
		lugarInter = miliSecAct - miliSec;
		
		if (this.isPulsado || lugarInter > 5000) {
			if (this.trayectoria == null) {
				this.coordenadas = new PuntoAltaPrecision(x, y);
				this.trayectoria = new TrayectoriaRecta(-2.5f, coordenadas, true);
			}
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelsXFrame);
			if (pixelsXFrame < 5) {
				pixelsXFrame *= 1.00035;
 			}
			this.x = Math.round(this.coordenadas.x);
			this.y = Math.round(this.coordenadas.y);
			if (x < 0 || x > (Stage.WIDTH - 18)) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
			}
			if (y < 0 || y > (Stage.HEIGHT - 18)) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			}
		}
	}
	
	public void collision(Objeto actorColisionado) {
		super.collision(actorColisionado);
		if (actorColisionado instanceof Ladrillo) { // Colisión con ladrillo
			colisionConLadrillo(actorColisionado);
		}
		else 
			if (actorColisionado instanceof Nave) { // Colisión con nave
			colisionConNave((Nave) actorColisionado);
		}
	}
	
	/**
	 * Utilizaremos, para calcular las colisiones, un rectángulo menor que el diámetro de la propia bola, de esta manera haremos las colisiones
	 * más precisas
	 * @return
	 */
	public Rectangle getRectanguloParaColisiones () {
		return new Rectangle(this.x, this.y, 14, 14);
	}
	
	/**
	 * Colisión de la bola con un ladrillo, para determinar el lugar del ladrillo a través del que la bola ha colisionado utilizaremos cuatro
	 * rectángulos imaginarios alrededor del mismo.
	 * @param actorColisionado
	 */
	private void colisionConLadrillo (Objeto actorColisionado) {
		int margenLateral = 4; // Este mare
		// Creo pequeños rectángulos que coincidirán con los bordes del ladrillo
		Rectangle rectArribaActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY(), actorColisionado.getWidth(), 1);
		Rectangle rectAbajoActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY() + actorColisionado.getHeight()-1, actorColisionado.getWidth(), 1);
		Rectangle rectIzquierdaActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY() + margenLateral, 1, actorColisionado.getHeight() - 2 * margenLateral);
		Rectangle rectDerechaActor = new Rectangle(actorColisionado.getX() + actorColisionado.getWidth()-1, actorColisionado.getY() + margenLateral, 1, actorColisionado.getHeight() - 2 * margenLateral);

		// variables booleanas que me indicarán una colsión por cada lado del ladrillo
		boolean arriba = false, abajo = false, derecha = false, izquierda = false;
		
		if (this.getRectanguloParaColisiones().intersects(rectArribaActor))  arriba = true;
		if (this.getRectanguloParaColisiones().intersects(rectAbajoActor))  abajo = true;
		if (this.getRectanguloParaColisiones().intersects(rectIzquierdaActor))  izquierda = true;
		if (this.getRectanguloParaColisiones().intersects(rectDerechaActor))  derecha = true;
		
		if (arriba && izquierda) { // Colisión con esquina superior izquierda
			// Coloco la bola en la esquina
			this.x = actorColisionado.x;
			this.y = actorColisionado.y;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			// Recalculo la pendiente
			this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
			return;
		}
		if (arriba && derecha) {
			this.x = actorColisionado.x + actorColisionado.width;
			this.y = actorColisionado.y;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
			return;
		}
		if (abajo && izquierda) {
			this.x = actorColisionado.x;
			this.y = actorColisionado.y + actorColisionado.height;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
			return;
		}
		if (abajo && derecha) {
			this.x = actorColisionado.x + actorColisionado.width;
			this.y = actorColisionado.y + actorColisionado.height;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
			return;
		}
		if (abajo) {
			this.y = actorColisionado.y + actorColisionado.height;
			this.coordenadas.y = this.y;
			this.trayectoria.reflejarHaciaAbajo(this.coordenadas);
			return;
		}
		if (arriba) {
			this.y = actorColisionado.y;
			this.coordenadas.y = this.y;
			this.trayectoria.reflejarHaciaArriba(this.coordenadas);
			return;
		}
		if (izquierda) {
			this.x = actorColisionado.x;
			this.coordenadas.x = this.x;
			this.trayectoria.reflejarHaciaIzquierda(this.coordenadas);
			return;
		}
		if (derecha) {
			this.x = actorColisionado.x + actorColisionado.width;
			this.coordenadas.x = this.x;
			this.trayectoria.reflejarHaciaDerecha(this.coordenadas);
			return;
		}
	}
	
	
	/**
	 * Método que determina lo que hacer cuando la bola choca con la nave
	 * @param nave
	 */
	private void colisionConNave (Nave nave) {
		// Creo rectángulos para determinar la zona de la nave con la que choca la bola
		int anchoZonaEspecial = 7; // píxeles que delimitan la zona de rebote especial de la nave
		Rectangle rectIzqNave = new Rectangle(nave.getX(), nave.getY(), anchoZonaEspecial, nave.height);
		Rectangle rectDerNave = new Rectangle(nave.getX() + nave.width - anchoZonaEspecial, nave.getY(), anchoZonaEspecial, nave.height);
		Rectangle rectBola = this.getRectanguloParaColisiones();
		
		// Colisión con el lado derecho de la nave
		if (rectBola.intersects(rectDerNave)) {
			this.y = nave.getY() - nave.getHeight();
			this.coordenadas.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene on una pendiente mayor a 1
				this.trayectoria.setPendiente(-(float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenadas, true);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente(-(float) (Math.random() * (10 - 2) + 2), this.coordenadas, true);
			}
			return;
		}
		// Colisión con el lado izquierdo de la nave
		if (rectBola.intersects(rectIzqNave)) {
			this.y = nave.getY() - nave.getHeight();
			this.coordenadas.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene con una pendiente mayor a 1
				this.trayectoria.setPendiente((float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenadas, false);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente((float) (Math.random() * (10 - 2) + 2), this.coordenadas, false);
			}
			return;
		}
		else { // La bola intersecta la parte central de la nave
			this.trayectoria.reflejarHaciaArriba(this.coordenadas);
			return;
		}			
	}
	
	public void keyPressed (KeyEvent e) {
		if (isPulsado == false && lugarInter < 5000) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_SPACE : isPulsado = true;
				vy = 3;
				vx = 3;
				break;
			}
		}
  }
	
	  public void mouseMoved(MouseEvent e) {
		  if (isPulsado == false && lugarInter < 5000)
			  this.x = (e.getX() - this.width/2);
	  	}
	  
	  public void mouseClicked(MouseEvent e) {
		  switch (e.getButton()) {
		  	case MouseEvent.BUTTON1 : isPulsado = true;
		  	vy = 3;
			vx = 3;
			break;
		  }
	  }
	  
	  protected void updateSpeed() {
		  	if (left) vx = -Nave.NAVE_SPEED;
		  	if (right) vx = Nave.NAVE_SPEED;
		  }
	
	public float getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	public float getVy() { return vy; }
	public void setVy(int i) {vy = i;	}

}
