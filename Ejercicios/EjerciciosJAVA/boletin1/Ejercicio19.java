package boletin1;

/*
 * Pedir 2 fechas y mostrar el dia que hay de diferencia entre ellas,
 * suponiendo que todo los dias son de 30 dias
 */

public class Ejercicio19 {
	public static void main(String args[]) {
		int dia1, mes1, a�o1;
		int dia2, mes2, a�o2;
		int totalDias;
		
		System.out.println("    Fecha 1");
		System.out.print("Introduzca dia: ");
		dia1 = Entrada.entero();
		System.out.print("Introduzca mes: ");
		mes1 = Entrada.entero();
		System.out.print("Introduzca a�o: ");
		a�o1 = Entrada.entero();
		
		System.out.println("-----------------");
		
		System.out.println("    Fecha 2");
		System.out.print("Introduzca dia: ");
		dia2 = Entrada.entero();		
		System.out.print("Introduzca mes: ");
		mes2 = Entrada.entero();
		System.out.print("Introduzca a�o: ");
		a�o2 = Entrada.entero();
		
		totalDias = dia2-dia1 + 30*(mes2-mes1) + 365*(a�o2- a�o1);
		
		System.out.println("\nLos dias de diferencia son " + totalDias);
	}
}
