package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Joyas extends Antiguedades {
	
	private String materialFabricacion;
	
	
	/**
	 * 
	 */
	public Joyas() {
		super();
	}
	
	
	/**
	 * 
	 * @param a�oDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 * @param materialFabricacion
	 */
	public Joyas(int a�oDeFabricacion, String origen, float precioDeVenta, String materialFabricacion) {
		super(a�oDeFabricacion, origen, precioDeVenta);
		this.materialFabricacion= materialFabricacion;
		
	}
	
	public String getMaterialFabricacion() { 
		return materialFabricacion;
		}
	public void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}
	
	

}
