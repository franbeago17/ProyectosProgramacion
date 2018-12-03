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
	 * @param aÃ±oDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 * @param materialFabricacion
	 */
	public Joyas(int añoDeFabricacion, String origen, float precioDeVenta, String materialFabricacion) {
		super(añoDeFabricacion, origen, precioDeVenta);
		this.materialFabricacion= materialFabricacion;
		
	}
	
	public String getMaterialFabricacion() { 
		return materialFabricacion;
		}
	public void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}


	@Override
	public String toString() {
		return "Joyas\nMaterial de fabricacion=" + materialFabricacion + "\nAÃ±o de fabricacion=" + getAñoDeFabricacion()
				+ "\nOrigen=" + getOrigen() + "\nPrecio de venta=" + getPrecioDeVenta();
	}



	
	

}
