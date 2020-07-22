package boletin2;

/*
 * Leer un numero y mostrar su cuadrado, hasta que introduzca un numero negativo.
 */

public class Ejercicio1 {
	public static void main(String args[]) {
		int num, cuadrado;
		System.out.print("Introduzca un numero: ");
		num = Entrada.entero();
		
		while (num>=0) {
			cuadrado = (int)Math.pow(num, 2);
			System.out.println(num+" al cuadrado = "+ cuadrado);
			System.out.print("Introduzca otro numero: ");
			num = Entrada.entero();
		}
	}
}
