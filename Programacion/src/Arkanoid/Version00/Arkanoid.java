package Arkanoid.Version00;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Arkanoid extends Canvas implements Stage {
	
	public static void main(String[] args) {
		Arkanoid ark = new Arkanoid();
		ark.game();
	}
	
	private BufferStrategy strategy;
	private long usedTime;
	
	private SpriteCache spriteCache = new SpriteCache();
	private List<Objeto> objetos = new ArrayList<Objeto>();
	private Nave n = new Nave(this);
	
	/**
	 * 
	 */
	public Arkanoid() {

		JFrame ventana = new JFrame("Invaders");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH,Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,Stage.WIDTH +5,Stage.HEIGHT + 28);
		ventana.setVisible(true);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		
		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				n.keyReleased(e);
			}
			
			public void keyPressed(KeyEvent e) {
				n.keyPressed(e);
			}
		});
		
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				n.mouseMoved(e);
			}
		});
	}
	
	/**
	 * 
	 */
	public void initWorld() {
	
		n.setX(Stage.WIDTH/2 - 35);
	    n.setY(Stage.HEIGHT - 2*n.getHeight());
	    objetos.add(n);
		
		for (int i = 1; i <= 12; i++) {
	    	Ladrillo l = new Ladrillo(this);
	    	int anchoL = l.getWidth();
	    	l.setX((anchoL+1)*i);
	    	l.setY(100);
	    	objetos.add(l);
	    }
		
		for (int i = 1; i <= 12; i++) {
	    	Ladrillo l = new Ladrillo(this);
	    	int anchoL = l.getWidth();
	    	l.setX((anchoL+1)*i);
	    	l.setY(122);
	    	l.setSpriteNames( new String[] {("ladrilloArkanoidVerde.png")});;
	    	objetos.add(l);
	    }
		
		for (int i = 1; i <= 12; i++) {
	    	Ladrillo l = new Ladrillo(this);
	    	int anchoL = l.getWidth();
	    	l.setX((anchoL+1)*i);
	    	l.setY(144);
	    	l.setSpriteNames( new String[] {("ladrilloArkanoidAmarillo.png")});;
	    	objetos.add(l);
	    }
		
		for (int i = 1; i <= 12; i++) {
	    	Ladrillo l = new Ladrillo(this);
	    	int anchoL = l.getWidth();
	    	l.setX((anchoL+1)*i);
	    	l.setY(166);
	    	l.setSpriteNames( new String[] {("ladrilloArkanoidAzul.png")});;
	    	objetos.add(l);
	    }
		
		Pelota p = new Pelota(this);
	  	p.setX(200);
	    p.setY(350);
	    p.setVx(1);
	    p.setVy(1);
	    objetos.add(p);
	    
	}
	
	/**
	 * 
	 */
	public void updateWorld() {
		for (Objeto objeto : objetos) {
			objeto.act();
		}
		int i = 0;
		while (i < objetos.size()) {
			Objeto m = (Objeto)objetos.get(i);
			if (m.isMarkedForRemoval()) {
				objetos.remove(i);
			} else {
				m.act();
				i++;
			}
		}
		n.act();
	}
	
	public void checkCollisions() {
		for (int i = 0; i < objetos.size(); i++) {
			Objeto o1 = (Objeto)objetos.get(i);
			Rectangle r1 = o1.getBounds();
	
		  for (int j = i+1; j < objetos.size(); j++) {
			Objeto o2 = (Objeto)objetos.get(j);
		  	Rectangle r2 = o2.getBounds();
		  	if (r1.intersects(r2)) {
		  		o1.collision(o2);
		  		o2.collision(o1);
		  	}
		  }
		}
	}
	
	/**
	 * 
	 */
	public void paintWorld() {
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0,0,getWidth(),getHeight());
		//g.drawImage( spriteCache.getSprite("galax.jpg"), 0, 0, this);
		for (Objeto objeto : objetos) {
			if (objeto.markedForRemoval == false) {
				objeto.paint(g);
			}
			n.paint(g);
		}
		g.setColor(Color.white);
		if (usedTime > 0) {
		  g.drawString(String.valueOf(1000/usedTime)+" fps",0,Stage.HEIGHT-50);
		}
		else {
		  	g.drawString("--- fps",0,Stage.HEIGHT-50);
			strategy.show();
		}
	}
	
	/**
	 * 
	 */
	public SpriteCache getSpriteCache() {
		return spriteCache;
	}
	
	/**
	 * 
	 */
	public void game() {
		usedTime=1000;
		initWorld();
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			checkCollisions();
			paintWorld();
			usedTime = System.currentTimeMillis()-startTime;
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
		}
	}
}
