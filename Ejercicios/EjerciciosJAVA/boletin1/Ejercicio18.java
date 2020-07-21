package boletin1;

/*
 * ídem que el ej 17, suponiendo que cada mes tiene un numero distinto
 * (suponer que febrero tiene 28 dias).
 */

public class Ejercicio18 {
	public static void main(String args[]) {
		int dia, mes, año;
		int diaDelMes=0;
		System.out.print("Ingrese dia: ");
		dia = Entrada.entero();
		System.out.print("Ingrese mes: ");
		mes = Entrada.entero();
		System.out.print("Ingrese año: ");
		año = Entrada.entero();
		
		try {
		if (mes == 2) {
			diaDelMes=28;
		}
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			diaDelMes=31;
		}
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			diaDelMes=30;
		}
		
		dia++;
		
		if (dia>=diaDelMes) {
			dia=1;
			mes++;
			if (mes>=12) {
				mes=1;
				año++;
			}
		}
		System.out.println(dia + "/"+ mes + "/"+ año);
		}
		catch(Exception e){
			System.out.println("Fecha Erronea.");
		}
	}
}
