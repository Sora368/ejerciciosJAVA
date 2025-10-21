package com;
import java.util.Scanner;
public class Actividad_1 {

	public static void main(String[] args) {
		//Pedimos cuantas veces queremos que diga la palabra eco
		System.out.println("¿Cuantas veces quieres que se muestre la palabra eco?");
		Scanner sc = new Scanner(System.in);
		Actividad_1.eco(7);
	}
	/**
	 * 
	 * 
	 * @param n (Número de veces que se repite)
	 */
	public static void eco (int n) {
		final String eco = "eco";
		int n1;
		n1=0;
		while ( n1 <= n) {
			n1++;
			System.out.println(eco);
		}
		
	}
	
}
