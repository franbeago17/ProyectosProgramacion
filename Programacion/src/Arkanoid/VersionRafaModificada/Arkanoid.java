package Arkanoid.VersionRafaModificada;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 * Clase principal del programa, act�a como la ventana que ver� el usuario. Se utiliza un patr�n Singleton
 * @author R
 *
 */
public class Arkanoid extends Canvas {
	// Variables est�ticas
	public static final int ANCHO = 400;
	public static final int ALTO = 600;
	public static final int FPS = 100; // Frames por segundo
	// Ventana
	JFrame ventana = null;
	// Lista de actores que se representan en pantalla
	List<Objeto> objetos = new ArrayList<Objeto>();
	// Nave y bola
	Nave nave = new Nave();
	Bola bola = new Bola();
	// Fase activa en el juego
	Fase faseActiva = null;
	// Estrategia de Doble Buffer
	private BufferStrategy strategy;
	// Variable para patr�n Singleton
	private static Arkanoid instancia = null;
	
	/**
	 * Getter Singleton
	 * @return
	 */
	public static Arkanoid getInstancia () {
		if (instancia == null) {
			instancia = new Arkanoid();
		}
		return instancia;
	}
	
	
	
	/**
	 * Constructor
	 */
	public Arkanoid() {
		// Creaci�n de la ventana
		ventana = new JFrame("Arkanoid");
		// Obtenemos el panel principal del JFrame
		JPanel panel = (JPanel) ventana.getContentPane();
		// Establezco las dimensiones del Canvas
		this.setBounds(0,0,ANCHO,ALTO);
		// El panel tendr� un tama�o preferido
		panel.setPreferredSize(new Dimension(ANCHO,ALTO));
		panel.setLayout(null);
		// Agregamos el Canvas al panel
		panel.add(this);
		// Dimensionamos el JFrame
		ventana.setBounds( 0, 0, ANCHO+5, ALTO+28);
		// Hacemos el JFrame visible
		ventana.setVisible(true);
		// Con el siguiente c�digo preguntamos al usuario si realmente desea cerrar la aplicaci�n, cuando
		// pulse sobre el aspa de la ventana
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		// Creaci�n de la estrategia de doble b�ffer
		this.createBufferStrategy(2);
		strategy = this.getBufferStrategy();
		// Con ignoreRepaint le decimos al JFrame que no debe repintarse cuando el Sistema Operativo se lo indique,
		// nosotros nos ocupamos totalmente del refresco de la pantalla
		ventana.setIgnoreRepaint(true);
		// La ventana no podr� redimensionarse
		ventana.setResizable(false);
		// Hacemos que el Canvas obtenga autom�ticamente el foco del programa para que, si se pulsa una tecla, la pulsaci�n
		// se transmita directamente al Canvas.
		this.requestFocus();
		// Para resolver un problema de sincronizaci�n con la memoria de v�deo de Linux, utilizamos esta l�nea
		Toolkit.getDefaultToolkit().sync();
		
		// Agrego los controladores de rat�n y de teclado
		this.addMouseMotionListener(new ControladorRaton());
		this.addKeyListener(new ControladorTeclado());
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
	
	
	
	/**
	 * Al principio del juego, lo primero que se debe hacer es inicializar todo lo necesario para que se pueda mostrar
	 * la primera fase.
	 */
	public void initWorld() {
		// Preparaci�n de la primera fase
		this.faseActiva = new Fase01();
		this.faseActiva.inicializaFase();
		// Agregamos los actores de la primera fase a nuestro juego
		this.objetos.clear();
		this.objetos.addAll(this.faseActiva.getActores());
		// Creaci�n de los actores Nave y Bola
	    this.objetos.add(this.nave);
	    this.objetos.add(this.bola);
	}
		

	/**
	 * Cada vez que actualicemos el juego se llamar� a este m�todo	
	 */
	public void updateWorld() {
		// Actualizaci�n de todos los actores
		for (Objeto objeto : this.objetos) {
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
		nave.act();
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
	 * M�todo responsable de repintar cada frame del juego
	 */
	public void paintWorld() {
		// Obtenemos el objeto Graphics (la brocha) desde la estrategia de doble b�ffer
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		// Lo primero que hace cada frame es pintar un rect�ngulo tan grande como la escena,
		// para superponer la escena anterior.
		//g.setColor(Color.black);
		//g.fillRect( 0, 0, getWidth(), getHeight());
		g.drawImage(CacheRecursos.getInstancia().getImagen("ImagenFondo.jpg"), 0, 0, this);
		// Ejecutamos el m�todo paint de cada uno de los actores
		for (Objeto objeto : this.objetos) {
			objeto.paint(g);
		}
		// Una vez construida la escena nueva, la mostramos.
		strategy.show();
	}
	
	
	/**
	 * M�todo principal del juego. Contiene el bucle principal
	 */
	public void game() {
		// Inicializaci�n del juego
		initWorld();
		// Este bucle se ejecutar� mientras el objeto Canvas sea visible.
		while (this.isVisible()) {
			// Tomamos el tiempo en milisegundos antes de repintar el frame
			long millisAntesDeConstruirEscena = System.currentTimeMillis();
			// Actualizamos y pintamos el nuevo frame
			updateWorld();
			checkCollisions();
			paintWorld();
			// Calculamos la cantidad de milisegundos que se ha tardado en realizar un nuevo frame del juego
			int millisUsados = (int) (System.currentTimeMillis() - millisAntesDeConstruirEscena);
			// Hago que el programa duerma lo suficiente para que realmente se ejecuten la cantidad de FPS
			// que tenemos programados
			try { 
				int millisADetenerElJuego = 1000 / FPS - millisUsados;
				if (millisADetenerElJuego >= 0) {
					 Thread.sleep(millisADetenerElJuego);
				}
			} catch (InterruptedException e) {}
		}
	}
	
	
	
	// Getters
	public Nave getNave() { return nave; }
	public Bola getBola() { return bola; }



	/**
	 * M�todo main()
	 * @param args
	 */
	public static void main(String[] args) {
		Arkanoid.getInstancia().game();
	}
}
