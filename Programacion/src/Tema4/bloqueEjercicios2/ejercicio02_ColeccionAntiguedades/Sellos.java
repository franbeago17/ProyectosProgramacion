package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Sellos extends Antiguedades {
	
	private int epoca;
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
	 * @param epoca
	 * @param fabricante
	 */
	public Sellos(int añoDeFabricacion, String origen, float precioDeVenta, int epoca, String fabricante) {
		super(añoDeFabricacion, origen, precioDeVenta);
		this.epoca= epoca;
		this.fabricante= fabricante;
	}
	
	public String getFabricante() { 
		return fabricante;
		}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	public int getEpoca() { 
		return epoca;
		}
	public void setEpoca(int epoca) {
		this.epoca = epoca;
	}


	@Override
	public String toString() {
		return "Sellos\nEpoca=" + epoca + "\nFabricante=" + fabricante + "\nAño de fabricacion="
				+ getAñoDeFabricacion() + "\nOrigen=" + getOrigen() + "\nPrecio de venta=" + getPrecioDeVenta();
	}
	
	
	
	

}
