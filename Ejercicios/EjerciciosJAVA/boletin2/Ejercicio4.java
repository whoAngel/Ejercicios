package boletin2;

/*
 * Pedir un numero hasta que sea negativo y mostrar cuantos 
 * numeros se han introducido
 */

public class Ejercicio4 {
	public static void main(String args[]) {
		int num, cont=0;
		System.out.print("Ingrese un numero: ");
		num = Entrada.entero();
		
		while (num>0) {
			cont++;
			System.out.print("Introduzca otro numero: ");
			num = Entrada.entero();
		}
		System.out.println("se han introducido "+ cont+ " numeros.");
	}
}
