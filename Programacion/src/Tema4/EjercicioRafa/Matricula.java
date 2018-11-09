package Tema4.EjercicioRafa;

public class Matricula {
	private String fecha;
	private int codigo;
	

	public Matricula() {
		super();
	}


	/**
	 * @param fecha
	 * @param codigo
	 */
	public Matricula(String fecha, int codigo) {
		super();
		this.fecha = fecha;
		this.codigo = codigo;
	}

	
	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
