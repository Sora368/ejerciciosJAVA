package com;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner sc = new Scanner(System.in);
		
		
		/*********************
		 * Pedimos un número *
		 *                   *
		 *********************/
		
		System.out.println("Di cuantos números vas a escribir");
		int n= sc.nextInt();
		int[] tabla = new int[n];
		
		/**
		 * Hacemos el bucle 
		 */
		for (int i = 0; i<tabla.length ; i++) {
			System.out.println("Introduce un número");
			tabla[i]= sc.nextInt();
		}
		for (int i= tabla.length-1 ; i>=0; i-- ) {
			System.out.println(tabla[i]);
		}
		

	}

}
