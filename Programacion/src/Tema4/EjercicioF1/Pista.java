package Tema4.EjercicioF1;

public class Pista {
	
	Obstaculo obstaculo[] = new Obstaculo[2];
	Obstaculo pista[] = new Obstaculo[25];
	
	
	/**
	 * 
	 */
	public Pista() {
		super();
		crearPista();
	}
	
	
	


	/**
	 * @param obstaculo
	 * @param pista
	 */
	public Pista(Obstaculo[] obstaculo, Obstaculo[] pista) {
		super();
		this.obstaculo = obstaculo;
		this.pista = pista;
	}





	public void crearPista() {
		
		obstaculo[0] = new Rampa();
		obstaculo[1] = new ManchaAceite();
		
		int numAleat = 0;
		int numAleatColocación = 0;
		for (int i = 0; i < 4; i++) {
			numAleat  = (int)Math.round(Math.random()*1);
			numAleatColocación  = (int)Math.round(Math.random()*24);
			
			if (pista[numAleatColocación] == null) {
				pista[numAleatColocación] = obstaculo[numAleat];
			}
			else {
				do {
					numAleatColocación  = (int)Math.round(Math.random()*24);
					if (pista[numAleatColocación] == null) {
						pista[numAleatColocación] = obstaculo[numAleat];
					}
				}while (pista[numAleatColocación]!=null);
				
			}
			
			System.out.println();
		}
		
		for (int j = 0; j<24; j++) {
			System.out.print(pista[j] + " ");
		}
	}
}
