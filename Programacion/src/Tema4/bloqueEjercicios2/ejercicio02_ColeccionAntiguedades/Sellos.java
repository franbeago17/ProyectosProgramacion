package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Sellos extends Antiguedades {
	
	private int añoFabricacion;
	private String fabricante;
	
	
	/**
	 * 
	 */
	public Sellos() {
		super();
	}
	
	
	/**
	 * 
	 * @param a�oDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 * @param a�oFabricacion
	 * @param fabricante
	 */
	public Sellos(int añoDeFabricacion, String origen, float precioDeVenta, int añoFabricacion, String fabricante) {
		super(añoDeFabricacion, origen, precioDeVenta);
		this.añoFabricacion= añoDeFabricacion;
		this.fabricante= fabricante;
	}
	
	public String getFabricante() { 
		return fabricante;
		}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	public int getAñoFabricacion() { 
		return añoFabricacion;
		}
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	
	
	

}
