package Tema4.bloqueEjercicios2.ejercicio03_Arbol;

public class PrincipalArbol {

	public static void main(String[] args) {
	
		Rama tronco = new Rama("Tronco");
		Rama rama01 = new Rama("Rama 1");
		
		
		tronco.setExtension1(rama01);
		tronco.setExtension2(new Fruto("Fruto 01"));
		tronco.setExtension3(new Hoja("Hoja 01"));
		
		rama01.setExtension1(new Fruto("Fruto 02"));
		rama01.setExtension2(new Rama("Rama 02"));
		rama01.setExtension3(null);
	}
	
	private static Rama recorreComponente (ComponenteDeArbol componente) {
		if (componente instanceof Fruto) {
			System.out.println("Fruto: " + componente.getNombre());
		}
		if (componente instanceof Hoja) {
			System.out.println("Hoja: " + componente.getNombre());;
		}
		if (componente instanceof Rama) {
			recorreComponente (componente);
		}
		return recorreComponente(componente);
		
	}
}
