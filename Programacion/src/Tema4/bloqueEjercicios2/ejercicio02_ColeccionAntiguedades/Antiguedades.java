package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Antiguedades {
	
	private int añoDeFabricacion;
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
	 * @param añoDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 */
	public Antiguedades(int añoDeFabricacion, String origen, float precioDeVenta) {
		super();
		this.añoDeFabricacion = añoDeFabricacion;
		this.origen = origen;
		this.precioDeVenta = precioDeVenta;
	}
	
	
	public int getAñoDeFabricacion() { 
		return añoDeFabricacion;
		}
	public void setAñoDeFabricacion(int añoDeFabricacion) { 
		this.añoDeFabricacion = añoDeFabricacion; 
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
