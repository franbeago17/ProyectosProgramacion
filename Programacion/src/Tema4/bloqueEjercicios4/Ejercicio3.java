package Tema4.bloqueEjercicios4;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		
		double nums[] = new double[20];
		int numsDec[] = new int[20];
		
		double ent;
		double dec;
		double decASumar;
		double suma;
		int numerosEntreIntervalo = 0; 
		
		
		for (int i = 0; i < nums.length; i++) {
			
			ent = (int) Math.round(Math.random()*100);
			dec = (int) Math.round(Math.random()*100);
			decASumar = dec/100;
			suma = ent + decASumar;
			numsDec[i] = (int) dec;
			nums[i] = suma;
			System.out.print(nums[i] + "\t");
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (numsDec[i] >= 0 && numsDec[i] <= 49) {
				numerosEntreIntervalo++;
			} 
		}
		System.out.println("\n\nHay " + numerosEntreIntervalo + " entre .00 y .49");
	}
}
