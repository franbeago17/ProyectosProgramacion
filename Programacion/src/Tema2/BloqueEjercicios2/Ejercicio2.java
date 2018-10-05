package Tema2.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
		int var1 = Integer.parseInt(str);
		if (var1<0) {
			JOptionPane.showMessageDialog(null,"ERROR.No se pueden introducir numeros negativos.");
			System.exit(0); //Te hace salir del programa.
		}
		else {
			str = JOptionPane.showInputDialog("Introduzca el segundo numero: ");
			int var2 = Integer.parseInt(str);
			if (var2<0) {
				JOptionPane.showMessageDialog(null,"ERROR.No se pueden introducir numeros negativos.");
				System.exit(0);
		}
			else {
				str = JOptionPane.showInputDialog("Introduzca el tercer numero: ");
				int var3 = Integer.parseInt(str);
				if (var3<0) {
					JOptionPane.showMessageDialog(null,"ERROR.No se pueden introducir numeros negativos.");
					System.exit(0);
		}
				else {
					str = JOptionPane.showInputDialog("Introduzca el cuarto numero: ");
					int var4 = Integer.parseInt(str);
					if (var4<0) {
						JOptionPane.showMessageDialog(null,"ERROR.No se pueden introducir numeros negativos.");
						System.exit(0);
		}
					else {
						str = JOptionPane.showInputDialog("Introduzca el quinto numero: ");
						int var5 = Integer.parseInt(str);
						if (var5<0) {
							JOptionPane.showMessageDialog(null,"ERROR.No se pueden introducir numeros negativos.");
							System.exit(0);
		}
						else {
		
		
		int contadorBajos=0;
		int contadorMedios=0;
		int contadorGrandes=0;
		

			if (var1<=25) {
				contadorBajos=contadorBajos+1; //Se escribe mas corto asi: contadorBajos++;
			}
			else {
				if (var1<=250) {
					contadorMedios=contadorMedios+1;
				}
				else {
					contadorGrandes=contadorGrandes+1;
			}
		}
		
			if (var2<=25) {
				contadorBajos=contadorBajos+1;
			}
			else {
				if (var2<=250) {
					contadorMedios=contadorMedios+1;
				}
				else {
					contadorGrandes=contadorGrandes+1;
			}
		}
		
			if (var3<=25) {
				contadorBajos=contadorBajos+1;
			}
			else {
				if (var3<=250) {
					contadorMedios=contadorMedios+1;
				}
				else {
					contadorGrandes=contadorGrandes+1;
			}
		}
		
			if (var4<=25) {
				contadorBajos=contadorBajos+1;
			}
			else {
				if (var4<=250) {
					contadorMedios=contadorMedios+1;
				}
				else {
					contadorGrandes=contadorGrandes+1;
			}
		}
		
			if (var5<=25) {
				contadorBajos=contadorBajos+1;
			}
			else {
				if (var5<=250) {
					contadorMedios=contadorMedios+1;
				}
				else {
					contadorGrandes=contadorGrandes+1;
			}
		}
		
		System.out.println("\nSe han introducido "+contadorBajos+" numeros bajos.");
		System.out.println("Se han introducido "+contadorMedios+" numeros medios.");
		System.out.println("Se han introducido "+contadorGrandes+" numeros grandes.");
		
						}
					}
				}
			}
		}		
	}
}
