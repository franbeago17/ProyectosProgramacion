package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Mascaras extends Antiguedades {
	
	private String tribuPerteneciente;
	private String material;
	private int antiguedad;
	
	
	/**
	 * 
	 */
	public Mascaras() {
		super();
	}
	
	
	/**
	 * 
	 * @param añoDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 * @param tribuPerteneciente
	 * @param material
	 * @param antiguedad
	 */
	public Mascaras(int añoDeFabricacion, String origen, float precioDeVenta, String tribuPerteneciente, String material, int antiguedad) {
		super(añoDeFabricacion, origen, precioDeVenta);
		this.tribuPerteneciente= tribuPerteneciente;
		this.material= material;
		this.antiguedad= antiguedad;
	}
	
	public String getTribuPerteneciente() { 
		return tribuPerteneciente;
		}
	public void setTribuPerteneciente(String tribuPerteneciente) {
		this.tribuPerteneciente = tribuPerteneciente;
	}
	
	
	
	public String getMaterial() { 
		return material;
		}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	public int getAntiguedad() { 
		return antiguedad;
		}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
}
