package com;

import java.util.Random;
import java.util.Scanner;

public class Actividad_15 {
	
	static Scanner sc = new Scanner(System.in);
	
	static Random rand = new Random();
	
	public static void main(String[] args) {
		//Declaramos las variables		
		String palabra;
		int intentos=1;
		String respuesta;
		//Pedimos la palabra
		System.out.println("Introduce una palabra para un anagrama");
		palabra= sc.nextLine();
		while (palabra.equals("")) {
			System.out.println("No es válido, introduce otra palabra");
			palabra = sc.nextLine();
			intentos++;
		}
		System.out.println("\n\n\n\n\n\n"+anagrama(palabra));
		System.out.println("Escribe que palabra crees que es");
		respuesta= sc.nextLine();
		
		while (palabra.length()!=respuesta.length()) {
			System.out.println("Estas palabras no miden lo mismo, vuelve a intentarlo");
			respuesta= sc.nextLine();
			intentos++;
		}	
		while (!respuesta.equals(palabra)) {
			System.out.println("Fallaste, Has acertado "+ contadorLetras(palabra, respuesta)+ " letras, inténtalo de nuevo");
			respuesta=sc.nextLine();
			intentos++;
		}
		System.out.println("¡Enhorabuena! ¡Has acertado! en el intento " +intentos+"!");
		

	}
	private static String anagrama (String palabra) {
		StringBuilder anagrama = new StringBuilder();
		char[] tabla = palabra.toCharArray();
		int index1, index2;
		char aux;
		for (int i=0; i< palabra.length(); i++) {
			do {
				index1=rand.nextInt(palabra.length());
				index2=rand.nextInt(palabra.length());
			}while (index1==index2);
			aux = tabla[index1];
			tabla[index1]= tabla[index2];
			tabla[index2]= aux;
		}
		anagrama.append(tabla);
		return anagrama.toString();
	}
	private static int contadorLetras (String palabra, String respuesta) {
		int contador=0;
		for (int i=0; i<palabra.length(); i++) {
			char tabla= respuesta.charAt(i);
			char tabla2=palabra.charAt(i);
			if(tabla==tabla2) {
				contador++;
			}
				
			
		}
		return contador;
	}

}
