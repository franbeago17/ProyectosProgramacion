package Arkanoid.Version01;

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

import javax.naming.ldap.StartTlsRequest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class Arkanoid extends Canvas implements Stage {
	
	public static void main(String[] args) {
		Arkanoid ark = new Arkanoid();
		ark.game();
	}
	
	private BufferStrategy strategy;
	private long usedTime;
	private SoundCache soundCache;
	private SpriteCache spriteCache = new SpriteCache();
	private List<Objeto> objetos = new ArrayList<Objeto>();
	private Nave n = new Nave(this);
	private Pelota p = new Pelota(this);
	private List<Explosion> explosion = new ArrayList<Explosion>();
	JFrame ventana = null;
	boolean initPausa = true;
	
	/**
	 * 
	 */
	public Arkanoid() {
		soundCache = new SoundCache();

		JFrame ventana = new JFrame("Arkanoid");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH,Stage.HEIGHT));
		panel.setLayout(null);
		ventana.setIgnoreRepaint(true);
		panel.add(this);
		ventana.setBounds(0,0,Stage.WIDTH +5,Stage.HEIGHT + 28);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		this.requestFocus();
		
		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				n.keyReleased(e);
			}
			
			public void keyPressed(KeyEvent e) {
				n.keyPressed(e);
				p.keyPressed(e);
			}
		});
		
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				n.mouseMoved(e);
				p.mouseMoved(e);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				p.mouseClicked(e);
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
	    
	   soundCache.playSound("Oh_mama_csgo.wav");
	   soundCache.loopSound("imperial_march(1).wav");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 13; j++) {
				Ladrillo l = new Ladrillo(this, i);
				l.setX(20+j*46);
				l.setY(50+i*19);
				objetos.add(l);
			}
		}
	    objetos.add(p);
	    
	}
	
	/**
	 * 
	 */
	public void updateWorld() {
		
		if (p.getVx() == 0 && p.getVy() == 0) {
			p.setX(n.getX() + 22);
			p.setY(n.getY() - n.getHeight() + 8);
		}
		
		for (Objeto objeto : objetos) {
			objeto.act();
		}
		int i = 0;
		while (i < objetos.size()) {
			Objeto m = (Objeto)objetos.get(i);
			if (m.isMarkedForRemoval()) {
				Explosion e = new Explosion(this);
                e.setX(m.getX() + 12);
                e.setY(m.getY());
                explosion.add(e);
				objetos.remove(i);
				soundCache.playSound("Explosion.wav");
			} else {
				i++;
			}
		}
		for (i = 0; i < explosion.size();) {
            Objeto m = (Objeto) explosion.get(i);
            if (m.isMarkedForRemoval()) {
                explosion.remove(i);
            } else {
                i++;
            }
        }
        for (i = 0; i < explosion.size(); i++) {
            Objeto m = (Objeto) explosion.get(i);
            m.act();
        }
        n.act();
	}
	
	/**
	 * 
	 */
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
		  		soundCache.playSound("Rebote.wav");
		  	}
		  }
		}
	}
	
	/**
	 * 
	 */
	public void paintWorld() {
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		g.drawImage( spriteCache.getSprite("ImagenFondo.jpg"), 0, 0, this);
		for (Objeto objeto : objetos) {
			if (objeto.markedForRemoval == false) {
				objeto.paint(g);
			}
			n.paint(g);
		}
		
		for (Explosion explosion : explosion) {
			if (explosion.markedForRemoval == false) {
				explosion.paint(g);
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
	
	/**
	 * Al cerrar la aplicaci�n preguntaremos al usuario si est� seguro de que desea salir.
	 */
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"�Desea cerrar la aplicaci�n?","Salir de la aplicaci�n",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
