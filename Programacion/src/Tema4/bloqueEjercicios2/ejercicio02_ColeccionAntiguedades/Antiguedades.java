package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Antiguedades {
	
	private int aņoDeFabricacion;
	private String origen;
	private float precioDeVenta;
	
	
	
	/**
	 * 
	 */
	public Antiguedades() {
		super();
	}

	
	
	/**
	 * 
	 * @param aņoDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 */
	public Antiguedades(int aņoDeFabricacion, String origen, float precioDeVenta) {
		super();
		this.aņoDeFabricacion = aņoDeFabricacion;
		this.origen = origen;
		this.precioDeVenta = precioDeVenta;
	}
	
	
	public int getAņoDeFabricacion() { 
		return aņoDeFabricacion;
		}
	public void setAņoDeFabricacion(int aņoDeFabricacion) { 
		this.aņoDeFabricacion = aņoDeFabricacion; 
		}
	
	
	
	public String getOrigen() { 
		return origen;
		}
	public void setOrigen(String origen) { 
		this.origen = origen; 
		}
	
	
	
	public float getPrecioDeVenta() { 
		return precioDeVenta;
		}
	public void setPrecioDeVenta(float precioDeVenta) { 
		this.precioDeVenta = precioDeVenta; 
		}

	
	
	
	
	
}
