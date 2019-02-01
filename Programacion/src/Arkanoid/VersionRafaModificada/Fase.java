package Arkanoid.VersionRafaModificada;

import java.util.ArrayList;
import java.util.List;

/**
 * Todas las fases deberán extender esta clase abstracta y personalizar la apariencia y el comportamiento
 * @author R
 *
 */
public abstract class Fase {
	
	// Lista de actores a colocar en cualquier fase
	protected List<Objeto> objetos = new ArrayList<Objeto>();
	
	// Método que debe implementar cada Fase
	public abstract void inicializaFase ();

	// Getter de la lista de actores
	public List<Objeto> getActores() { return objetos; }
}
