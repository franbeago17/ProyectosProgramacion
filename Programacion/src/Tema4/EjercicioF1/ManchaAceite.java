package Tema4.EjercicioF1;

public class ManchaAceite extends Obstaculo {
	
	@Override
	public void inicializa() {
		int numAleat = (int) Math.round(Math.random()*((-10)-(-50)) + (-50));
		this.valor = numAleat;
	}

	/**
	 *
	 */
	public ManchaAceite() {
		super();
	}
	
	

}
