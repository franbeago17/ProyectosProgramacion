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
	 * @param aņoDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 * @param materialFabricacion
	 */
	public Joyas(int aņoDeFabricacion, String origen, float precioDeVenta, String materialFabricacion) {
		super(aņoDeFabricacion, origen, precioDeVenta);
		this.materialFabricacion= materialFabricacion;
		
	}
	
	public String getMaterialFabricacion() { 
		return materialFabricacion;
		}
	public void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}
	
	

}
