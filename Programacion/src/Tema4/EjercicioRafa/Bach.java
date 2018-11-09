package Tema4.EjercicioRafa;

import java.util.Date;

public class Bach extends Matricula{
	private String modalidad;

	public Bach() {
		super();
	}

	/**
	 * @param fecha
	 * @param codigo
	 */
	public Bach(String fecha, int codigo, String modalidad) {
		super(fecha, codigo);
		this.modalidad=modalidad;
	}


	
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	

	@Override
	public String toString() {
		return "Bach [Modalidad=" + modalidad + ", Fecha=" + getFecha() + ", Codigo=" + getCodigo() + "]";
	}
	
	
	
	
	
	
}
