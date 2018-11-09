package Tema4.EjercicioRafa;

import java.util.Date;

public class ESO extends Matricula {
	private boolean pmar;

	/**
	 * 
	 */
	public ESO() {
		super();
	}

	
	
	/**
	 * 
	 * @param fecha
	 * @param codigo
	 * @param pmar
	 */
	public ESO(String fecha, int codigo, boolean pmar) {
		super(fecha, codigo);
		this.pmar=pmar;
	}



	
	public boolean isPmar() {
		return pmar;
	}
	public void setPmar(boolean pmar) {
		this.pmar = pmar;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ESO [Pmar=" + pmar + ", Fecha=" + getFecha() + ", Codigo=" + getCodigo() + "]";
	}




	
	
	
	
	
	
}
