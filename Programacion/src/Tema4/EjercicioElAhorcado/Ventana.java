package Tema4.EjercicioElAhorcado;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
// libremente.
public class Ventana extends Canvas {

	// Declaración de variables que nos permitirán introducir el ancho y el alto
	// de la ventana
	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;
	public static Ventana ventana = null;
	private int fallos = 0;
	String strIntentoJugador = "";
	String strPalabraGenerada = "";
	

	public Ventana () {
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("El juego del Ahorcado");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le añadimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tamaño del canvas (this) para que ocupe todo el tamaño de la ventana
		this.setBounds(0,0,WIDTH,HEIGHT);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);
		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);
	}
		
		
		
	/**
	 * Sobrescribimos el método "paint" que tienen todos los componentes gráficos en AWT-SWING
	 */
	@Override
	public void paint(Graphics g) {
			
		// Pintamos la imagen sobre la pantalla
		g.drawImage(getImagen("durango-y-las-peliculas-del-viejo-oeste.jpg"), 0, 0, this);
				
		// Pintando el cuerpo
		g.setColor(new Color(247, 219, 175));
		g.fillRect(295, 170, 51, 110);
		
		// Pintando los brazos
		g.setColor(new Color(247, 219, 175));
		g.fillRect(268, 170, 25, 120);
		
		g.setColor(new Color(247, 219, 175));
		g.fillRect(348, 170, 25, 120);
		
		// Pintando las piernas
		g.setColor(new Color(247, 219, 175));
		g.fillRect(295, 282, 24, 120);
		
		g.setColor(new Color(247, 219, 175));
		g.fillRect(322, 282, 24, 120);
		
		// Pintando la cabeza
		g.setColor(new Color(247, 219, 175));
		g.fillOval(285, 100, 70, 70);
		
		// Pintando la cuerda
		g.setColor(new Color(155, 119, 57));
		g.fillRect(318, 40, 8, 60);
		
		g.setColor(new Color(155, 119, 57));
		g.fillRect(306, 168, 30, 8);
		
		// Pintando el mástil
		g.setColor(new Color(81, 64, 35));
		g.fillRect(3, 395, 150, 50);
		
		g.setColor(new Color(81, 64, 35));
		g.fillRect(60, 30, 40, 370);
		
		g.setColor(new Color(81, 64, 35));
		g.fillRect(40, 9, 340, 30);
		
		
		String palabra = "";
		String letrasUsadas = "";
		for (int i=0; i<Juego.getJuego().getGuiones().length; i++) {
			palabra += Juego.getJuego().getGuiones()[i] + " ";
		}
		g.setColor(Color.black);
		g.setFont(new Font("Console", Font.BOLD, 20));
		// Pintando guiones de la palabra generada
		g.drawString("Palabra: " + palabra, 370, 100);
		
		for (int i=0; i<Juego.getJuego().getAux().length; i++) {
			letrasUsadas += Juego.getJuego().getAux()[i] + " ";
		}
		g.setFont(new Font("Console", Font.BOLD, 20));
		// Pîntamos los fallos
		g.drawString("Usado: " + letrasUsadas, 270, 440);
		
		fallos = Juego.getJuego().getFallos();
		
		// Cuando haya fallos coloreamos de rojo
		if (fallos>0) {
			// Pintando la cabeza de rojo al fallar
			g.setColor(Color.red);
			g.fillOval(285, 100, 70, 70);
			
			// Pintando la cuerda del cuello
			g.setColor(new Color(155, 119, 57));
			g.fillRect(306, 168, 30, 8);
		}
		if (fallos>1) {
			// Pintando el cuerpo de rojo al fallar
			g.setColor(Color.red);
			g.fillRect(295, 170, 51, 110);
			
			// Pintando la cuerda del cuello
			g.setColor(new Color(155, 119, 57));
			g.fillRect(306, 168, 30, 8);
		}
		if (fallos>2) {
			// Pintando un brazo de rojo
			g.setColor(Color.red);
			g.fillRect(268, 170, 25, 120);
		}
		if (fallos>3) {
			// Pintando el otro brazo de rojo
			g.setColor(Color.red);
			g.fillRect(348, 170, 25, 120);
		}
		if (fallos>4) {
			// Pintando una pierna de rojo
			g.setColor(Color.red);
			g.fillRect(295, 282, 24, 120);
		}
		if (fallos>5) {
			// Pintando una pierna de rojo
			g.setColor(Color.red);
			g.fillRect(322, 282, 24, 120);
			// Pintamos que has perdido
			g.setFont(new Font("Console", Font.BOLD, 20));
			g.setColor(Color.black);
			g.drawString("Has perdido", 390, 200);
			g.drawString("La palabra era: " + Juego.getJuego().getPalabraGenerada(), 390, 230);
		}
		g.setColor(Color.black);
		
		strIntentoJugador = Juego.getJuego().getIntentoJugador();
		strPalabraGenerada = Juego.getJuego().getPalabraGenerada();
		if (strPalabraGenerada.equals(strIntentoJugador) || Juego.guionesCompletos(Juego.getJuego().getGuiones())) {
			g.drawString("ENHORABUENA!!", 390, 200);
			g.drawString("Has ganado!", 390, 230);
		}
		
		if (Juego.isBoolNavidad() == true) {
			// Pintamos la nueva imagen sobre la pantalla
			g.drawImage(getImagen("398549-blackangel.jpg"), 0, 0, this);
			
			// Pintando el cuerpo
			g.setColor(Color.red);
			g.fillRect(295, 170, 51, 110);
			
			// Pintando los brazos
			g.setColor(Color.red);
			g.fillRect(268, 170, 25, 120);
			
			g.setColor(Color.red);
			g.fillRect(348, 170, 25, 120);
			
			// Pintando las piernas
			g.setColor(Color.red);
			g.fillRect(295, 282, 24, 120);
			
			g.setColor(Color.red);
			g.fillRect(322, 282, 24, 120);
			
			// Pintando la cabeza
			g.setColor(new Color(247, 219, 175));
			g.fillOval(285, 100, 70, 70);
			
			// Pintando la cuerda
			g.setColor(new Color(155, 119, 57));
			g.fillRect(318, 40, 8, 60);
			
			g.setColor(new Color(155, 119, 57));
			g.fillRect(306, 168, 30, 8);
			
			// Pintando el mástil
			g.setColor(new Color(81, 64, 35));
			g.fillRect(3, 395, 150, 50);
			
			g.setColor(new Color(81, 64, 35));
			g.fillRect(60, 30, 40, 370);
			
			g.setColor(new Color(81, 64, 35));
			g.fillRect(40, 9, 340, 30);
			
			palabra = "";
			letrasUsadas = "";
			for (int i=0; i<Juego.getJuego().getGuionesNavidad().length; i++) {
				palabra += Juego.getJuego().getGuionesNavidad()[i] + " ";
			}
			g.setColor(Color.black);
			g.setFont(new Font("Console", Font.BOLD, 20));
			// Pintando guiones de la palabra generada
			g.drawString("Palabra: " + palabra, 370, 100);
			
			for (int i=0; i<Juego.getJuego().getAuxNavidad().length; i++) {
				letrasUsadas += Juego.getJuego().getAuxNavidad()[i] + " ";
			}
			g.setFont(new Font("Console", Font.BOLD, 20));
			// Pîntamos los fallos
			g.drawString("Usado: " + letrasUsadas, 270, 440);
			
			fallos = Juego.getJuego().getFallos();
		}
	}
	
	
	/**
	 * Método que permite obtener una imagen del sistema de ficheros. No es necesario que 
	 * en este momento de tu aprendizaje entiendas el 100% del siguiente método. Es 
	 * demasiado complejo. Sólo tienes que entender que esté método te devuelve un objeto
	 * de tipo BufferedImage, que podrás utilizar para poder pintar un archivo de imagen
	 * sobre tu ventana.
	 * @param nombre
	 * @return
	 */
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/Tema4/EjercicioElAhorcado/Recursos/" + nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	
	/**
	 * Patrón Singleton
	 * @return
	 */
	public static Ventana getVentana() {
		if (ventana == null) {
			ventana = new Ventana();
		}
		return ventana;
	}
}

