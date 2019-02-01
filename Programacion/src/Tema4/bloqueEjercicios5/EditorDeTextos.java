package Tema4.bloqueEjercicios5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class EditorDeTextos {
	
	public static List<String> editorDeTextos = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		int opcion;
		
		String menu = "EDITOR DE TEXTOS\n"
				+ "1.- A�adir una l�nea de texto.\n"
				+ "2.- Insertar una l�nea en cualquier posici�n del texto.\n"
				+ "3.- Editar una l�nea.\n"
				+ "4.- Borrar una l�nea.\n"
				+ "5.- Cortar un conjunto de l�neas\n"
				+ "6.- Pegar un conjunto de l�neas cortadas en una determinada posici�n.\n"
				+ "7.- Imprimir el texto.\n"
				+ "0.- Terminar el programa.\n";
		
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (opcion<1) {
				JOptionPane.showMessageDialog(null,"Ha salido con exito del programa.");
				System.exit(0);
			}
			if (opcion>7) {
				JOptionPane.showMessageDialog(null,"ERROR!! Reinicie el preograma.");
				System.exit(0);
			}
			String mensaje="";
		
			switch (opcion) {
			case 1: 
				insercionLineaTexto();
				mensaje="La l�nea de texto ha sido a�adida correctamente.";
				break;
			case 2: 
				insercionLineaTextoCualquierPosicion();
				mensaje="La l�nea de texto ha sido a�adida correctamente.";
				break;
			case 3:
				editarLinea();
				mensaje="La l�nea ha sido editada correctamente";
				break;
			case 4:
				borrarLinea();
				mensaje="La l�nea ha sido borrada correctamente.";
				break;
			case 5: 
				mensaje="Las l�neas han sido cortadas correctamente.";
				break;
			case 6:
				mensaje="Las l�neas han sido pegadas correctamente.";
				break;
			case 7:
				imprimeList(editorDeTextos);
				mensaje="Texto impreso correctamente.";
				break;
			}
			JOptionPane.showMessageDialog(null, mensaje);
		}while (opcion != 0);
		System.exit(0);
	}
	
	/**
	 * 
	 */
	public static void insercionLineaTexto() {
		String insercionUsuario = JOptionPane.showInputDialog("Introduzca la l�nea de texto: ");
		String string = new String (insercionUsuario);
		editorDeTextos.add(string);
	}
	
	/**
	 * 
	 */
	public static void insercionLineaTextoCualquierPosicion() {
		int indiceLinea = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posici�n para insertar la l�nea: "));
		String insercionUsuario = JOptionPane.showInputDialog("Introduzca la l�nea de texto: ");
		String string = new String (insercionUsuario);
		editorDeTextos.add(indiceLinea,string);
	}
	
	/**
	 * 
	 */
	public static void editarLinea() {
		int indiceLineaEdit = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la l�nea a editar: "));
		String lineEditada = JOptionPane.showInputDialog("Introduce el texto: ");
		editorDeTextos.set(indiceLineaEdit, lineEditada);
	}
	
	/**
	 * 
	 */
	public static void borrarLinea() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce la linea a borrar: "));
		String lineaBorrada = editorDeTextos.remove(num);
	}
	
	/**
	 * 
	 */
	public static void cortarLineas() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce las lineas a cortar: "));
		editorDeTextos.get(num);
		
	}
	
	/**
	 * 
	 */
	public static void pegarLineas() {
	}
	
	/**
	 * 
	 * @param editorDeTextos
	 */
	public static void imprimeList (List<String> editorDeTextos) {
		for (int i = 0; i < editorDeTextos.size(); i++) {
			System.out.println(editorDeTextos.get(i).toString());
		}
	}
}
