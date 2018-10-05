package Tema1;
import javax.swing.JOptionPane;

public class Mediadetresnumeros {
	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca un número flotante: ");
		float var2 = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Introduzca un número doble: ");
		double var3 = Double.parseDouble(str);
		
		int suma = (int) (var1+var2+var3);
		
		float media = (float)suma/(3);
		
		
			System.out.println("La media de " +var1+", " +var2+", "+var3+ ": " +media);
			
			
			
			
	}

}
