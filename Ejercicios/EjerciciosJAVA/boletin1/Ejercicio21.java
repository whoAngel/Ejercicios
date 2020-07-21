package boletin1;

/*
 * Pedir una nota numerica entre 0 y 10, y mostrar dicha nota de 
 * la forma: cero, uno, dos, tres...
 */

public class Ejercicio21 {
	public static void main(String args[]) {
		
		String calif [] = 	{"cero", "uno", "dos", "tres", "cuatro", "cinco", 
							"seis", "siete", "ocho", "nueve", "diez"};
		
		System.out.print("Ingrese calificacion entre 0 y 10: ");
		int cal = Entrada.entero();
		
		System.out.println("La calificación es:  "+ calif[cal]);
	}
}
