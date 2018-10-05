package Tema1;
import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca el primer número: ");
			int var1 = Integer.parseInt(str);
				System.out.print("El primer número ha sido:"+var1);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo número: ");
			float var2 = Float.parseFloat(str);
				System.out.print("El segundo número ha sido:"+var2);
		
		str = JOptionPane.showInputDialog("Introduzca el tercer número: ");
			double var3 = Double.parseDouble(str);
				System.out.print("El tercer número ha sido: "+var3);
	}

}