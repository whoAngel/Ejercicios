package boletin1;

/*
 * Pedir el dia mes y año de una fecha correcta y mostrar la fecha del dia 
 * siguiente, suponer que todos los meses tienen 30 dias.
 */

public class Ejercicio17 {
	public static void main(String args[]) {
		int dia, mes, año;	
		System.out.print("Introduzca dia: ");
		dia = Entrada.entero();
		System.out.print("Introduzca mes: ");
		mes = Entrada.entero();
		System.out.print("Introduzca año: ");
		año = Entrada.entero();
		
		dia++;
		if (dia>=30) {
			dia = 1;
			mes++;
			
			if (mes>=12) {
				mes=1;
				año++;
			}
		}
		if (año == 0) {
			año = 1;
			
		}
		System.out.println(dia + "/"+ mes + "/"+ año);
	}
}
