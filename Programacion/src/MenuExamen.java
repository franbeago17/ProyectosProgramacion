
import javax.swing.JOptionPane;

public class MenuExamen {

	public static void main(String[] args) {
		String menu = "MENU\n"
				+ "0.- Terminar el programa.\n"
				+ "1.- \n"
				+ "2.- \n"
				+ "3.- \n"
				+ "4.- \n"
				+ "5.- \n"
				+ "6.- \n"
				+ "7.- \n"
				+ "8.- ";
		
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		if (opcion<1) {
			JOptionPane.showMessageDialog(null,"Ha salido con exito del programa.");
			System.exit(0);
		}
		if (opcion>8) {
			JOptionPane.showMessageDialog(null,"ERROR!! Reinicie el preograma.");
			System.exit(0);
		}
		float num1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca primer numero: "));
		float num2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo numero: "));
		String mensaje="";
		
		switch (opcion) {
		case 1: 
			mensaje="";
		case 2: 
			mensaje="";
			break;
		case 3: 
			mensaje="";
			break;
		case 4:
			mensaje="";
			break;
		case 5: 
			mensaje="";
			break;
		case 6:
			mensaje="";
			break;
		case 7:
			mensaje="";
			break;
		case 8:
			mensaje="";
			break;
				
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
