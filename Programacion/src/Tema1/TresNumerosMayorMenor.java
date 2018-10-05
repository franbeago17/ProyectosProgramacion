package Tema1;
import javax.swing.JOptionPane;

public class TresNumerosMayorMenor {

	public static void main(String[] args) {
		
		String str= JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var1= Integer.parseInt(str);
		
		str= JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var2= Integer.parseInt(str);
		
		str= JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var3= Integer.parseInt(str);
		
		if (var1 > var2 && var1 > var3) {
			System.out.println("El número mayor es: "+var1);
		}
		
		if (var2 > var1 && var2 > var3) {
			System.out.println("El número mayor es: "+var2);
		}
		
		if (var3 > var1 && var3 > var2) {
			System.out.println("El número mayor es: "+var3);
		}
		
		if ( var1 < var2 && var1 < var3) {
			System.out.println("El número menor es: "+var1);
		}
		
		if (var2 < var1 && var2 < var3) {
			System.out.println("El número menor es: "+var2);
		}
		
		if (var3 < var1 && var3 < var2) {
			System.out.println("El número menor es: "+var3);
		}
		if (var1==var2 && var2==var3) {
			System.out.println("Los números introducidos son iguales");
		}
	}
}
