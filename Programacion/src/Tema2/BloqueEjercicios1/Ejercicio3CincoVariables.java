package Tema2.BloqueEjercicios1;


import javax.swing.JOptionPane;

public class Ejercicio3CincoVariables {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		int var2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el tercero numero: ");
		int var3 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el cuarto numero: ");
		int var4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el quinto numero: ");
		int var5 = Integer.parseInt(str);
		
		if (var1 >= var2 && var1 >= var3 && var1 >= var4 && var1 >= var5) {
			System.out.println("El mayor número es el primero: "+var1);}
			else {
				if (var2 >= var1 && var2 >= var3 && var2 >= var4 && var2 >= var5) {
					System.out.println("El mayor número es el segundo: "+var2);}
					else {
						if (var3 >= var1 && var3 >= var2 && var3 >= var4 && var3 >= var5) {
							System.out.println("El mayor número es el tercero: "+var3);}
							else {
								if (var4 >= var1 && var4 >= var2 && var4 >= var3 && var4 >= var5) {
									System.out.println("El mayor número es el cuarto: "+var4);}
									else {
										if (var5 >= var1 && var5 >= var2 && var5 >= var3 && var5 >= var4) {
											System.out.println("El mayor número es el quinto: "+var5);
						}
					}
				}				
			}
		}	
	}
}

