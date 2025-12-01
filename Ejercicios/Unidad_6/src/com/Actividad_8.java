package com;

import java.util.Scanner;

public class Actividad_8 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Declaramos las variables y pedimos los datos por Scanner.
		System.out.println("Escribe una frase y te diré si es una frase palíndroma");
		String frase= sc.nextLine();
		esPalindromo(frase);
		if(esPalindromo(frase)==true) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
	}
	public static boolean esPalindromo ( String cadena) {
		cadena = cadena.replaceAll(" ", "").toLowerCase();
		cadena= cadena.replaceAll("á", "a").replaceAll("é", "e").replaceAll("í", "i").replaceAll("ó", "o").replaceAll("ú", "u");
		String sust ="";
		boolean palindromo=false;
		for (int i = cadena.length()-1; i >=0 ; i--) {
			sust= sust + cadena.charAt(i);
		}
		if (sust.equalsIgnoreCase(cadena)) {
			palindromo=true;
		}
		return palindromo;
	}
}
