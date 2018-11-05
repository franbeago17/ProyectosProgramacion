package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Sellos extends Antiguedades {
	
	private int a�oFabricacion;
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
	public Sellos(int a�oDeFabricacion, String origen, float precioDeVenta, int a�oFabricacion, String fabricante) {
		super(a�oDeFabricacion, origen, precioDeVenta);
		this.a�oFabricacion= a�oDeFabricacion;
		this.fabricante= fabricante;
	}
	
	public String getFabricante() { 
		return fabricante;
		}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	public int getA�oFabricacion() { 
		return a�oFabricacion;
		}
	public void setA�oFabricacion(int a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}
	
	
	

}
