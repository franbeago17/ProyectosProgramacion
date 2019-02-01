package Tema4.EjercicioF1;

public class Rampa extends Obstaculo {
	
	@Override
	public void inicializa() {
		int numAleat = (int) Math.round(Math.random() * (100-50) + 50);
		this.valor = numAleat;
	}

	/**
	 *
	 */
	public Rampa() {
		super();
	}
	
	

}
