package com;

public class Actividad_15B {
	public static void main (String [] args) {
		
	}
	public static boolean esPrimo (int n) {
		boolean dev = true;
		
		for (int i=2; i<n-1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
	}
	public static void imprime (String cadena) {
		System.out.println("");
	}
}
