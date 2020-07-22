package boletin2;

/*
 * Leer un numero y mostrar si es positivo o negativo. 
 * Detener hasta que el numero sea 0.
 */

public class Ejercicio2 {
	public static void main(String args[]) {
		int num;
		System.out.print("Ingrese un numero: ");
		num = Entrada.entero();
		
		while (num != 0) {
			if (num>0) {
				System.out.println("Es postivo.");
			}else {
				System.out.println("Es negativo.");
			}
			System.out.println("Ingrese otro numero.");
			num = Entrada.entero();
		}
		
	}
}
