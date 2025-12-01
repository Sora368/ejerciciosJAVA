package com;

import java.util.Scanner;

public class Actividad_5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nombre;
		System.out.println("Dime tu nombre y le quitaré las vocales");
		nombre=sc.nextLine();
		quitaVocales(nombre);

	}
	public static void quitaVocales (String nombre) {
		String sust= nombre;
		char vacío=' ';
		char[] vocales= {'a','á','A','Á', 'e','é','É', 'i', 'í', 'I', 'Í', 'o', 'ó', 'O', 'Ó', 'u', 'ú', 'U', 'Ú', 'ü', 'Ü'};
		for (int i =0; i<nombre.length();i++) {
			for (int i2=0; i2<vocales.length;i2++) {
				if (nombre.charAt(i)==vocales[i2]) {
					sust=sust.replace(vocales[i2], vacío);
					sust=sust.replaceAll(" ", "");
				}
			
			}
		}	
		System.out.println(sust.trim());
	}
}
