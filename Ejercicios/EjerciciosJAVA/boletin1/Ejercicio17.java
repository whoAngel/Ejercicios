package boletin1;

/*
 * Pedir el dia mes y a�o de una fecha correcta y mostrar la fecha del dia 
 * siguiente, suponer que todos los meses tienen 30 dias.
 */

public class Ejercicio17 {
	public static void main(String args[]) {
		int dia, mes, a�o;	
		System.out.print("Introduzca dia: ");
		dia = Entrada.entero();
		System.out.print("Introduzca mes: ");
		mes = Entrada.entero();
		System.out.print("Introduzca a�o: ");
		a�o = Entrada.entero();
		
		dia++;
		if (dia>=30) {
			dia = 1;
			mes++;
			
			if (mes>=12) {
				mes=1;
				a�o++;
			}
		}
		if (a�o == 0) {
			a�o = 1;
			
		}
		System.out.println(dia + "/"+ mes + "/"+ a�o);
	}
}
