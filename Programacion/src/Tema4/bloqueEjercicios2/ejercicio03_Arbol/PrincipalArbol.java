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
		
		crearArbol((Rama)tronco);
		
	}
	
	public static Rama crearArbol(Rama tronco) {
		if (tronco.getExtension1() instanceof Rama) {
			return (Rama) tronco.getExtension1();
		}
		if (tronco.getExtension2() instanceof Rama) {
			return (Rama) tronco.getExtension2();
		}
		if (tronco.getExtension3() instanceof Rama) {
			return (Rama) tronco.getExtension3();
		}
		System.out.println("Parte principal "+tronco);
		return tronco;
	}
}
