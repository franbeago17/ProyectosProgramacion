package Tema1;
import javax.swing.JOptionPane;


public class Tresnumeros {
	
	public static void main(String[] args){	
			String str = JOptionPane.showInputDialog("Introduzca el primer número: ");
			int var = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca el segundo número: ");
			int var2 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca el tercer número: ");
			int var3 = Integer.parseInt(str);
			
			int suma = (var+var2+var3);
			JOptionPane.showMessageDialog(null, "La media es: " + suma);
	
		}
	}