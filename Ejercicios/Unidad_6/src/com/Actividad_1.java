package com;

import java.util.Scanner;

public class Actividad_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		System.out.println("Introduce dos palabras y te diré cual es más corta");
		palabra1 = sc.nextLine();
		palabra2 = sc.nextLine();
		if (palabra1.length()< palabra2.length()) {
			System.out.println("La palabra "+palabra1+" es más corta que "+ palabra2);
			
		}else if  (palabra1.length()== palabra2.length()) {
			System.out.println("Ambas palabras son iguales");
		}else {
			System.out.println("La palabra "+palabra2+"es más corta que "+ palabra1);
		}
		
	}
}
