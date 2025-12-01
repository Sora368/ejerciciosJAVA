package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Diseñar una aplicación que lea las puntuaciones 
 * (enteros) de 5 programadores y las muestre ordenadas.
 *  Después pueden añadirse hasta 3 programadores de 
 *  exhibición; su puntuación se introduce igual, 
 *  usando -1 para indicar que no hay más. 
 *  Mostrar finalmente todos los puntos ordenados.
*/
/**
PISTAS
Crea int[] puntos = new int[5], rellena y Arrays.sort
(puntos).
Lee exhibición hasta 3 veces o hasta introducir -1:
Amplía con puntos = Arrays.copyOf(puntos, puntos.length+1)
 y coloca al final. Ordena de nuevo y muestra.
 */
public class Actividad_6 {

	public static void main(String[] args) {
		int [] puntuaciones = new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las puntuaciones de cada programador");
		for (int i = 0; i < puntuaciones.length; i++) {
			puntuaciones[i]= sc.nextInt();
			
		}
		System.out.println("Los números son "+ Arrays.toString(puntuaciones));
		Arrays.sort(puntuaciones);
		System.out.println("Y ordenados son "+ Arrays.toString(puntuaciones));
		
		
	}

}
