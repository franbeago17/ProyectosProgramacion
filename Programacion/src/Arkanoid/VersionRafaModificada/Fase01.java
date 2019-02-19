package Arkanoid.VersionRafaModificada;

public class Fase01 extends Fase {
	// Propiedades estáticas de la fase
	public static final int ESPACIO_SUPERIOR_SOBRE_LADRILLOS = 60;


	@Override
	public void inicializaFase() {

		int mapa[][] = new int[][] { 
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
			{ 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 },
			{ 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 },
			{ 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 },
			{ 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 }};
			
			
			
			// Inicializamos los ladrillos
			int numLadrillosPosibles = Arkanoid.ANCHO / (Ladrillo.ANCHO + Ladrillo.ESPACIO_ENTRE_LADRILLOS);
			
			for (int j = 0; j < 6; j++) {
				for (int i = 0; i < numLadrillosPosibles + 1; i++) {
					Ladrillo m = new Ladrillo(i * 46, j * 20, mapa[j][i]);
					numLadrillos++;
					actores.add(m);
				}
			}
	}

}
