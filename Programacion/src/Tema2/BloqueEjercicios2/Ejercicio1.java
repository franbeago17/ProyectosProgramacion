package Tema2.BloqueEjercicios2;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog("Introduce el primer número: ");
		int var1=Integer.parseInt(str);
		System.out.println("Número1: "+var1);
		str=JOptionPane.showInputDialog("Introduce el segundo número: ");
		int var2=Integer.parseInt(str);
		System.out.println("Número2: "+var2);
		str=JOptionPane.showInputDialog("Introduce el tercer número: ");
		int var3=Integer.parseInt(str);
		System.out.println("Número3: "+var3);
		str=JOptionPane.showInputDialog("Introduce el cuarto número: ");
		int var4=Integer.parseInt(str);
		System.out.println("Número4: "+var4);
		str=JOptionPane.showInputDialog("Introduce el quinto número: ");
		int var5=Integer.parseInt(str);
		System.out.println("Número5: "+var5);
		
		int suma1=0;
		int suma2=0;
		int suma3=0;
		int suma4=0;
		
		if (var1<0) {
			suma1=suma1+var1; //Se puede hacer asi mas corto: suma1+=var1;
		}
		else {
			if (var1<=25) {
				suma2=suma2+var1;
			}
			else {
				if (var1<=250) {
					suma3=suma3+var1;
				}
				else {
					suma4=suma4+var1;
				}
			}
		}
		if (var2<0) {
			suma1=suma1+var2;
		}
		else {
			if (var2<=25) {
				suma2=suma2+var2;
			}
			else {
				if (var2<=250) {
					suma3=suma3+var2;
				}
				else {
					suma4=suma4+var2;
				}
			}
		}
		if (var3<0) {
			suma1=suma1+var3;
		}
		else {
			if (var3<=25) {
				suma2=suma2+var3;
			}
			else {
				if (var3<=250) {
					suma3=suma3+var3;
				}
				else {
					suma4=suma4+var3;
				}
			}
		}
		if (var4<0) {
			suma1=suma1+var4;
		}
		else {
			if (var4<=25) {
				suma2=suma2+var4;
			}
			else {
				if (var4<=250) {
					suma3=suma3+var4;
				}
				else {
					suma4=suma4+var4;
				}
			}
		}
		if (var5<0) {
			suma1=suma1+var5;
		}
		else {
			if (var5<=25) {
				suma2=suma2+var5;
			}
			else {
				if (var5<=250) {
					suma3=suma3+var5;
				}
				else {
					suma4=suma4+var5;
				}
			}
		}
		System.out.println("\nLa suma de los numeros negativos es: "+suma1);
		System.out.println("La suma de los numeros entre 0 y 25 es: "+suma2);
		System.out.println("La suma entre los numeros entre 26 y 250 es: "+suma3);
		System.out.println("La suma de los numeros mayores que 250 es: "+suma4);
	} 
}
				