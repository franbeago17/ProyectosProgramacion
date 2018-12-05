package Tema4.EjercicioElAhorcado;

import java.awt.Graphics;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.JOptionPane;

public class Juego {
	
	private static Juego juego = null;
	private String palabras[] = new String[] {"aburrido", "ácido", "alegre", "alto", "amargo", "ancho", "atrevido", "azul", "bajo", "blanco", "blando", "bonito", "buen", "caliente", "capaz", "central", "chungo", "común", "conocido", "contento", "corto", "débil", "delgado", "derecho", "diferente", "difícil", "dulce", "duro", "enfermo", "estrecho", "exterior", "fácil", "falso", "famoso", "feo", "final", "fresco", "frío", "fuerte", "gordo", "grande", "guay", "guapo", "húmedo", "igual", "imposible", "interesante", "interior", "inútil", "izquierdo", "joven", "largo", "lento", "listo", "malo", "masivo", "mayor", "mejor", "menor", "mucho", "muerto", "musical", "nacional", "natural", "negro", "nuevo", "peor", "pequeño", "perfecto", "pobre", "poco", "popular", "posible", "primero", "principal", "próximo", "rápido", "raro", "real", "recto", "rico", "rojo", "salado", "sano", "seco", "segundo", "simple", "sinvergüenza", "social", "solo", "soso", "tímido", "tonto", "triste", "útil", "verdadero", "verde", "viejo", "vivo", "crema", "explosión", "navaja", "universidad", "llaves", "papá", "catre", "escuela", "codo", "mapa", "lima", "edificio", "hojas", "granizo", "mano", "música", "habitación", "abuelo", "templo", "plato", "botella", "casa", "planeta", "metal", "mono", "petróleo", "debate", "ruído", "herramienta", "anteojos", "zapato", "ojo", "ciente", "diente", "buzo", "puerta", "ensalada", "candidato", "diario", "hierro", "barco", "tecla", "departamento", "hipopótamo", "árbol", "discurso", "rúcula", "lentejas", "reloj", "desodorante", "montañas", "moño", "partido", "fiesta", "café", "guitarra", "martillo", "lapicera", "letra", "librería", "rueda", "camisa", "sillón", "teclado", "pantalla", "tenedor", "pantalla", "tenedor", "agua", "cohete", "césped", "parlante", "pestaña", "monitor", "hombre", "velero", "palo", "lentes", "nube", "castillo", "libro", "televisor", "teléfono", "percha", "anillo", "pared", "cartas", "impresora", "luces", "bomba", "bolígrafo", "gobierno", "enano", "persona", "guantes", "proyector", "muela", "remate", "cuaderno", "taladro", "chocolate", "caramelos", "angustia", "lluvia", "corbata", "periódico", "planta", "chupete", "oficina", "persiana", "silla", "pradera", "zoológico", "deporte", "recipiente", "fotografía", "ave", "refugio", "pantalón", "carne", "nieve", "humedad", "pistola", "tristeza", "sofá", "cama", "campera", "coche", "cinturón", "famoso", "madera", "piso", "maletín", "diputado", "cuchillo", "candado", "luz", "ordenador", "radio", "cuadro", "calor", "teatro", "bala", "auriculares", "plástico", "libro", "aluminio", "agujeta", "sonido", "perro", "pelo", "felicidad", "servilleta", "sol", "estadística", "mensaje", "rey", "presidencia", "colegio", "lámpara", "flor", "tornillo", "abuela", "satélite"}; // Creamos el array de palabras.
	private int numeroPalabraAleatoria;
	private static String palabraGenerada;
	private int fallos = 0;
	private int fallosMax= 6;
	private String aux[];
	private static String intentoJugador;
	private static char guiones[];
	private static String hint = "hint";
	private static String godMode = "GodMode";
	private static String navidad = "Navidad";
	private boolean boolGodMode = false;
	private boolean boolHint = false;
	private String palabrasNavidad[] = new String[] {"melchor", "gaspar", "baltasar", "regalo", "nieve", "santa", "trineo", "renos", "nochebuena", "nochevieja", "uvas", "campanadas", "fiesta", "cotillon" };
	
	/**
	 * 
	 * @param palabraGenerada
	 */
	public void empezarJuego () {
	
		numeroPalabraAleatoria=(int) Math.round(Math.random() * (palabras.length - 1)); // Pedimos palabra aleatoria del array.
		palabraGenerada = palabras[numeroPalabraAleatoria];
		aux = new String[fallosMax];
		guiones = new char[palabraGenerada.length()];
		
		System.out.println("palabra: " + palabraGenerada);
		
		for (int i = 0; i < fallosMax; i++) {
			aux[i]= "_";
		}
		for (int i = 0; i < palabraGenerada.length(); i++) {
			guiones[i] = '_'; // Imprimimos los guiones.
			System.out.print(guiones[i]+" ");
		}
		
		do {
			intentoJugador = JOptionPane.showInputDialog("Introduzca una palabra o letra."); // Pedimos al jugador una palabra o letra
			
			//if (!intentoJugador.equals(navidad)) {
				
			// si no analizamos la longitud de la palabra y si es una letra;
			if (intentoJugador.length() == 1) {
				System.out.println("\n");
				boolean fallo = true;
				for (int i = 0; i < palabraGenerada.length(); i++) {
					char charJugador = intentoJugador.charAt(0) ;
					if (charJugador == palabraGenerada.charAt(i)) { // Si la letra coincide con alguna de la palabra
						guiones[i] = charJugador;
						fallo = false; // Decimos que no hay fallo
					}
				}
				if (fallo == true && boolGodMode!=true) { // Si hay fallo
					aux[fallos] = intentoJugador;
					fallos++; // Añade un fallo
					Ventana.getVentana().repaint();
				}
				for (int i = 0; i < palabraGenerada.length(); i++) {
					System.out.print(guiones[i]+" "); // Imprime los guiones
				}
			}
			else {
				if (!intentoJugador.equals(palabraGenerada) || intentoJugador.equals(hint) && boolGodMode!=true) {
					aux[fallos] = intentoJugador;
					fallos++; // Si la palabra no es igual añadimos un fallo
					Ventana.getVentana().repaint();
				}
			}
			System.out.print("\n Letras ya usadas: ");
			if (boolGodMode!=true) {
				for (int i = 0; i < fallosMax; i++) {
					System.out.print(" "+aux[i]);
					Ventana.getVentana().repaint();
				}
			}
			// Creamos el CHEAT 1 (hint) 
			if (intentoJugador.equals(hint) && boolHint == false) {
				System.out.print("\n");
				JOptionPane.showMessageDialog(null, "Has activado el cheat pista.");
				int numAleatorio = (int) Math.round(Math.random()*palabraGenerada.length());
				char charJugador = palabraGenerada.charAt(numAleatorio);
				guiones[numAleatorio]=charJugador;
				for (int i = 0; i < palabraGenerada.length(); i++) {
					if (guiones[numAleatorio]== palabraGenerada.charAt(i)) {
						guiones[i] = guiones[numAleatorio];
						Ventana.getVentana().repaint();
					}
					System.out.print(guiones[i] + " ");
				}
				boolHint = true;
			}
			// Creamos el CHEAT 2 (godMode)
			if (intentoJugador.equals(godMode)) {
				boolGodMode=true;
				JOptionPane.showMessageDialog(null, "Has activado el cheat GodMode.\nA partir de ahora tus fallos no seran contabilizados");
				Ventana.getVentana().repaint();
			}
			
		// Realizamos el bucle mientras que la palabra no sea igual, los fallos no sean los máximos o las letras no estén completas.
		}while(!((intentoJugador.equals(palabraGenerada)) || (fallos >= fallosMax) || (guionesCompletos(guiones))));
		
		if (intentoJugador.equals(palabraGenerada) || (guionesCompletos(guiones))){
			for (int i = 0; i < palabraGenerada.length(); i++) {
				guiones[i] = intentoJugador.charAt(i);
			}
			System.out.println("\n\n\t\t HAS GANADO ENHORABUENA!!");
			Ventana.getVentana().repaint();
		}
		else {
			System.out.println("\n\n\t\t HAS PERDIDO MATAO" + "\n\n La palabra era "+ palabraGenerada);
		}
	}
	
	/*public static void pista() {
		if (intentoJugador.equals(hint) && boolHint == false) {
			JOptionPane.showMessageDialog(null, "Has activado el cheat pista.");
			int numAleatorio = (int) Math.round(Math.random()*palabraGenerada.length());
			char charJugador = palabraGenerada.charAt(numAleatorio);
			guiones[numAleatorio]=charJugador;
			for (int i = 0; i < palabraGenerada.length(); i++) {
				if (guiones[numAleatorio]== palabraGenerada.charAt(i)) {
					guiones[i] = guiones[numAleatorio];
					Ventana.getVentana().repaint();
				}
				System.out.println("" + guiones[i] + " ");
			}
			boolHint = true;
		}
	}*/
	


	/**
	 * 
	 */
	public static boolean guionesCompletos (char guiones[]) {
		for (int i = 0; i < guiones.length; i++) {
			if (guiones[i] == '_') {
				return false;
			}
		}
		return true;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public static Juego getJuego () {
		if (juego == null) {
			juego = new Juego();
		}
		return juego;
	}
	
	
	/**
	 * 
	 */
	public Juego () {
		super ();
	}


	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}
	
	
	/**
	 * @return the guiones
	 */
	public char[] getGuiones() {
		return guiones;
	}



	/**
	 * @return the aux
	 */
	public String[] getAux() {
		return aux;
	}



	/**
	 * @return the palabraGenerada
	 */
	public String getPalabraGenerada() {
		return palabraGenerada;
	}



	/**
	 * @return the intentoJugador
	 */
	public String getIntentoJugador() {
		return intentoJugador;
	}

	
	
	/**
	 * @return the navidad
	 */
	public static String getNavidad() {
		return navidad;
	}

	
	
	
	
	
}
