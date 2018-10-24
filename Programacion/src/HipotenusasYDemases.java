
import javax.swing.JOptionPane;

public class HipotenusasYDemases {

	public static void main(String[] args) {
		String menu = "MENU\n"
				+ "1.- Calculo hipotenusa de triangulo.\n"
				+ "2.- Calculo superficie de circunferencia.\n"
				+ "3.- Calculo perimetro circunferencia.\n"
				+ "4.- Calculo area rectangulo.\n"
				+ "5.- Calculo area triangulo.\n"
				+ "0.- Salir de la aplicacion.\n";
			
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		String mensaje="";
		
		switch (opcion) {
		case 1: //Hipotenusa.
			float cateto1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del primer cateto: "));
			float cateto2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del segundo cateto: "));
			float cateto1al2=(float)Math.pow(cateto1, 2);
			float cateto2al2=(float)Math.pow(cateto2, 2);
			float sumaCatetos=cateto1al2+cateto2al2;
			float hipotenusa=(float)Math.sqrt(sumaCatetos);
			mensaje= "La hipotenusa es: "+hipotenusa;
			break;
		case 2: //Superficie de una circunferencia.
			float radio=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del radio: "));
			float superficieCircunferencia=(float) ((float)Math.PI*(Math.pow(radio, 2)));
			mensaje="La superficie de la circunferencia es: "+superficieCircunferencia;
			break;
		case 3: //Perimetro de una circunferencia.
			 radio=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del radio: "));
			float perimetroCircunferencia=(float) ((float)2*Math.PI*radio);
			mensaje="El perimetro de una circunferencia es: "+perimetroCircunferencia;
			break;
		case 4: //Area rectangulo.
			float base=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud de la base: "));
			float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud de la altura: "));
			float areaRectangulo=base*altura;
			mensaje="El area del rectangulo es: "+areaRectangulo;
			break;
		case 5: //Area de un triangulo.
			float baseTriangulo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud de la base: "));
			float alturaTriangulo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud de la altura: "));
			float areaTriangulo=(baseTriangulo*alturaTriangulo)/2;
			mensaje="El area del triangulo es: "+areaTriangulo;
			break;
		case 0: //Salir del programa.
			JOptionPane.showMessageDialog(null,"Ha salido con exito del programa.");
			System.exit(0);
			default: mensaje="Error!!\nNo se pueden introducir casos que no existan.";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
