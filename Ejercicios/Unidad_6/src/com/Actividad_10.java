package com;

import java.util.Scanner;

public class Actividad_10 {
	
	static Scanner sc= new Scanner(System.in);
	
	private static final String conjunto1="e i k m p q r s t u v";
	
	private static final String conjunto2="p v i u m t e r k q s";
	
	public static void main(String[] args) {
		char[] cadena1= conjunto1.toCharArray(), cadena2 = conjunto2.toCharArray();
		System.out.println("Escribe una palabra o frase y te la codificaré");
		String frase= sc.nextLine();
		char c= frase.charAt(0);

	}
	/**
	 * 
	 * @param cadena
	 * @param cadena2
	 * @param c
	 * @return
	 */
	public static char codificador (char [] cadena, char [] cadena2 , char c) {
		for (int i=0; i<cadena.length; i++) {
			return cadena2[i];
		}
		return c;
	}

}
