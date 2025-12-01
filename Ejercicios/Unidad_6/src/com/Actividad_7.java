package com;

import java.util.Scanner;

public class Actividad_7 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Di una frase");
		String frase= sc.nextLine();
		System.out.println("Ahora di que palabra quieres saber cuantas\n"+"veces aparece en dicha frase");
		String palabra = sc.nextLine();
		cuentaPalabras(frase, palabra);
	}
	public static void cuentaPalabras (String cadena, String palabra) {
		String vacio="_";
		for (int i1=0; i1<palabra.length()-1;i1++) {
			vacio+=vacio;
		}
		String sust= cadena.replaceAll(palabra, vacio);
		
		int contador=0;
		for (int i=0; i<sust.length();i++) {
			if(vacio.equals(sust.substring(i, vacio.length()))) {
				contador++;
			}
		}
		System.out.println("La palabra aparece "+ contador+ " veces");
	}
}
