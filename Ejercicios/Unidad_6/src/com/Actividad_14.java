package com;

import java.util.Random;
import java.util.Scanner;

public class Actividad_14 {

	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		/*********************
		 * Juego del anagrama*
		 *********************/
		//Declaramos variables
		
		String palabra;
		
		//Pedimos al usuario que escriba una palabra por terminal
		
		System.out.println("Introduce una palabra para jugar al juego del anagrama");
		
		palabra= sc.nextLine();
		while (palabra.equals("")) {
			System.out.println("No es válido, vuelvea escribir una palabra");
			palabra= sc.nextLine();
		}
		System.out.println("\n\n\n\n\n\n"+hacedorAnagrama(palabra));
		System.out.println("Escribe que palabra crees que es");
		String respuesta= sc.nextLine();
		while (!respuesta.equals(palabra)) {
			System.out.println("Fallaste, inténtalo de nuevo");
			respuesta=sc.nextLine();
		}
		System.out.println("¡Enhorabuena! ¡Has acertado!");

	}
	
	public static String hacedorAnagrama (String palabra) {
		StringBuilder anagrama = new StringBuilder();
		char [] tabla = palabra.toCharArray();
		int index1;
		int index2;
		for (int i=0 ; i< palabra.length();i++) {
			do {
				index1= rand.nextInt(palabra.length());
				index2= rand.nextInt(palabra.length());
			}while (index1== index2);
			char aux = tabla[index1];
			tabla[index1] = tabla[index2];
			tabla[index2]= aux;
		}
		anagrama.append(tabla);
		
		
		return anagrama.toString();
	}

}
