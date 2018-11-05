package Tema4.bloqueEjercicios2.ejercicio02_ColeccionAntiguedades;

public class Libros extends Antiguedades {
	
	private String autor;
	private String titulo;
	
	
	/**
	 * 
	 */
	public Libros() {
		super();
	}
	
	
	/**
	 * 
	 * @param aņoDeFabricacion
	 * @param origen
	 * @param precioDeVenta
	 * @param autor
	 * @param titulo
	 */
	public Libros(int aņoDeFabricacion, String origen, float precioDeVenta, String autor, String titulo) {
		super(aņoDeFabricacion, origen, precioDeVenta);
		this.autor= autor;
		this.titulo= titulo;
		
	}
	
	public String getAutor() { 
		return autor;
		}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	public String getTitulo() { 
		return titulo;
		}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
