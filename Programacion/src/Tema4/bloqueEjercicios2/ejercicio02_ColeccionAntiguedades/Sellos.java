package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Sellos extends Antiguedades {
	
	private int aņoFabricacion;
	private String fabricante;
	
	
	/**
	 * 
	 */
	public Sellos() {
		super();
	}
	
	
	/**
	 * 
	 * @param aņoDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 * @param aņoFabricacion
	 * @param fabricante
	 */
	public Sellos(int aņoDeFabricacion, String origen, float precioDeVenta, int aņoFabricacion, String fabricante) {
		super(aņoDeFabricacion, origen, precioDeVenta);
		this.aņoFabricacion= aņoDeFabricacion;
		this.fabricante= fabricante;
	}
	
	public String getFabricante() { 
		return fabricante;
		}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	public int getAņoFabricacion() { 
		return aņoFabricacion;
		}
	public void setAņoFabricacion(int aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}
	
	
	

}
