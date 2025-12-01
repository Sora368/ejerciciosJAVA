package com;

import java.util.Scanner;

public class Actividad_4 {
	
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduce una frase y te diré cuantos espacios en blanco tiene");
		String frase = scan.nextLine();
		buscaEspacios(frase);
	}
	public static void buscaEspacios(String caracteres) {
		int espacios=0;
		String sust= caracteres.replaceAll(" ", "_");
		for (int i=0; i<caracteres.length();i++) {
			if(sust.charAt(i)=='_') {
				espacios++;
			}
		
		}
		System.out.println("La frase tiene "+espacios+" espacios");
	}
	
}
