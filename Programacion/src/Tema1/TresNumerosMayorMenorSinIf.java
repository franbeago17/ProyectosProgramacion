package Tema1;
import javax.swing.JOptionPane;


public class TresNumerosMayorMenorSinIf {
	
public static void main(String[] args) {
		
		String str= JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var1= Integer.parseInt(str);
		
		str= JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var2= Integer.parseInt(str);
		
		str= JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var3= Integer.parseInt(str);
		
		float opcion1=var1-var2-var3;
		float opcion2=var2-var3;
		
		System.out.println("El número mayor es: "+var1);
		System.out.println("El número menor es: "+var3);
	}
}



