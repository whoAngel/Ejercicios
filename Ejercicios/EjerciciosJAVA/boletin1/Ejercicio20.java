package boletin1;

/*
 * Pedir una hora de la forma hora, minutos, segundos, y mostrar la hora en 
 * el segundo siguiente.	 
 */

public class Ejercicio20 {
	public static void main(String args[]) {
		int h, m, s;
		
		System.out.print("Introduzca hora: ");
		h = Entrada.entero();
		System.out.print("Introduzca minutos: ");
		m = Entrada.entero();
		System.out.print("Introsuzca segundos: ");
		s = Entrada.entero();
		
		s++;
		
		if (s>=60) {
			s=0;
			m++;
			if (m>=60) {
				m=0;
				h++;
				if (h>=20) {
					h=0;
				}
			}
		}// end if
		
		System.out.println("Hora: "+ h + ":" + m + ":"+ s);
	}
}
