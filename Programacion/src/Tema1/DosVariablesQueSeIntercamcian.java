package Tema1;
import javax.swing.JOptionPane;

public class DosVariablesQueSeIntercamcian {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca la primera variable: ");
			int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca la segunda variable: ");
			int var2 = Integer.parseInt(str);
			
		System.out.println("La primera variable es "+var1+" y la seguna es "+var2);
		
			int var3 = var1;
			var1 = var2;
			var2 = var3;
			
		System.out.println("Ahora las variables son: "+var1+" y "+var2);	
			
	}

}
