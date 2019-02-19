package Arkanoid.VersionRafaModificada;

public class Fase02 extends Fase {
	// Propiedades estáticas de la fase
		public static final int ESPACIO_SUPERIOR_SOBRE_LADRILLOS = 60;


		@Override
		public void inicializaFase() {

			int mapa[][] = new int[][] { 
				{ 1, 1, 1, 2, 2, 2, 2, 1, 1, 1 },
				{ 1, 1, 2, 4, 4, 4, 4, 2, 1, 1 },
				{ 1, 2, 4, 3, 3, 3, 3, 4, 2, 1 },
				{ 2, 4, 3, 3, 7, 7, 3, 3, 4, 2 },
				{ 2, 4, 3, 7, 0, 0, 7, 3, 4, 2 },
				{ 2, 4, 3, 3, 7, 7, 3, 3, 4, 2 },
				{ 1, 2, 4, 3, 3, 3, 3, 4, 2, 1 },
				{ 1, 1, 2, 4, 4, 4, 4, 2, 1, 1 },
				{ 1, 1, 1, 2, 0, 0, 2, 1, 1, 1 }};
				
				// Inicializamos los ladrillos
				int numLadrillosPosibles = Arkanoid.ANCHO / (Ladrillo.ANCHO + Ladrillo.ESPACIO_ENTRE_LADRILLOS);
				
				for (int j = 0; j < 9; j++) {
					for (int i = 0; i < numLadrillosPosibles + 1; i++) {
						Ladrillo m = new Ladrillo(i * 46, j * 20, mapa[j][i]);
						if(mapa[j][i]==1) {
							Ladrillo c = new Ladrillo(i * 46, j * 20, mapa[j][i]);
							actores.add(c);
							numLadrillos++;
						}
						if (j > 0) {
							numLadrillos++;
						}
						actores.add(m);
					}
				}
		}
}
