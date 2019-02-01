package Tema4.EjercicioF1;

public abstract class Vehiculo {

	protected int x; // Posici�n horizontal que ocupa el veh�culo
	protected String nombre; // Nombre del conductor o conductora del veh�culo
	protected String color; // Color del veh�culo, codificado como 6 cifras hexadecimales
	
	
	/**
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Vehiculo(String nombre, String color) {
		super();
		this.x = 0;
		this.nombre = nombre;
		this.color = color;
	}


	/**
	 * M�todo que permite el avance al azar del veh�culo
	 */
	public void avanza () {
		int avance = (int) Math.round(Math.random() * (50-3) + 3);
		this.x += avance;
	}

	
	/**
	 * M�todo abstracto para que el veh�culo se pinte a s� mismo en la consola
	 */
	public abstract String paint();

	
	
	

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
