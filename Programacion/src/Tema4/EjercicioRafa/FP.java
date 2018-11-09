package Tema4.EjercicioRafa;


public class FP extends Matricula {
	private boolean dual;

	public FP() {
		super();
	}

	/**
	 * @param fecha
	 * @param codigo
	 */
	public FP(String fecha, int codigo, boolean dual) {
		super(fecha, codigo);
		this.dual=dual;
	}

	
	
	public boolean isDual() {
		return dual;
	}
	public void setDual(boolean dual) {
		this.dual = dual;
	}

	@Override
	public String toString() {
		return "FP [Dual=" + dual + ", Fecha=" + getFecha() + ", Codigo=" + getCodigo() + "]";
	}
	
	
	
	
	
}
