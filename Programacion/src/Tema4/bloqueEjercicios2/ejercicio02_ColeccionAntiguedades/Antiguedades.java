package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Antiguedades {
	
	private int a�oDeFabricacion;
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
	 * @param a�oDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 */
	public Antiguedades(int a�oDeFabricacion, String origen, float precioDeVenta) {
		super();
		this.a�oDeFabricacion = a�oDeFabricacion;
		this.origen = origen;
		this.precioDeVenta = precioDeVenta;
	}
	
	
	public int getA�oDeFabricacion() { 
		return a�oDeFabricacion;
		}
	public void setA�oDeFabricacion(int a�oDeFabricacion) { 
		this.a�oDeFabricacion = a�oDeFabricacion; 
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
