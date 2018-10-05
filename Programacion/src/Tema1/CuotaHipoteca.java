package Tema1;
public class CuotaHipoteca {
	
	public static void main(String[] args) {
		
		float euribor = (float) -0.167;      //Pedir usuario
		float diferencial = (float) 0.89;	//pedir usuario
		int capital = 500000;				//pedir usuario
		int meses = 120;					//pedir usuario
		float interesAnual = euribor + diferencial;
		float interesMensual = interesAnual/12/100;
		float potencia = (float) Math.pow(1+interesMensual, meses);
		
		float cuotaMensual = capital*interesMensual*(float)potencia
				/((float)potencia-1);
		
		
		
		System.out.println("La cuota mensual es de "+cuotaMensual+ "€");
		
		
		
		}
	}


