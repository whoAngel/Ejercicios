package boletin2;

/*
 * leer numeros hasta que sea 0 y decir si es par o impar 
 */

public class Ejercicio3 {
	public static void main(String arga[]) {
		int num;
		System.out.print("Ingrese un numero: ");
		num = Entrada.entero();
		
		while (num>0) {
			if (num%2 == 0) {
				System.out.println(num + " es par.");
			}
			else {
				System.out.println(num + " es impar.");
			}
			
			System.out.println("Introduzca otro numero.(Introduzca 0 para salir)");
			num = Entrada.entero();
		}
	}
}
