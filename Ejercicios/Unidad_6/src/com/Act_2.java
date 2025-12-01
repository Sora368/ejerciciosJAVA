package com;

import java.util.Scanner;

public class Act_2 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int eleccion;
		String password;
		System.out.println("Elige que versión vás a jugar");
		System.out.println("##############################");
		System.out.println("#         Dificultad         #");
		System.out.println("##############################");
		System.out.println("\n#Dificultad 1: Modo dificil  #");
		System.out.println("\n#Dificultad 2: Modo normal   #");
		eleccion= scanner.nextInt();
		System.out.println("Introduce la contraseña");
		password= scanner.nextLine();
		password= scanner.nextLine().trim();
		if (eleccion==1) {
			primeraVersión(password);
		}else if(eleccion ==2) {
			segundaVersion(password);
		}else {
			System.out.println("Dificultad no válida");
		}
		

		
	}
	/**
	 * 
	 * @param contraseña
	 */
	public static void primeraVersión(String contraseña) {
		int intentos=1;
		System.out.println("\n");
		System.out.println("##################");
		System.out.println("#     PISTAS     #");
		System.out.println("##################");
		System.out.println("Pista 1: la cantidad de caracteres de la contraseña es: "+contraseña.length());
		System.out.println("Pista 2: los caracteres de inicio y fin de la contraseña son "
		+contraseña.charAt(0)+ " y "+ contraseña.charAt(contraseña.length()-1));
		String respuesta = scanner.nextLine().trim();
		while (!contraseña.equals(respuesta)) {
			intentos++;
			System.out.println("Es incorrecto");
			respuesta = scanner.nextLine();
		}
		System.out.println("Es correcto, has acertado en el intento "+intentos);
	}
	/**
	 * 
	 * @param contraseña
	 */
	public static void segundaVersion(String contraseña) {
		int intentos=1;
		System.out.println("\n");
		System.out.println("##################");
		System.out.println("#     PISTAS     #");
		System.out.println("##################");
		System.out.println("Pista 1: la cantidad de caracteres de la contraseña es: "+contraseña.length());
		System.out.println("Pista 2: los caracteres de inicio y fin de la contraseña son "
		+contraseña.charAt(0)+ " y "+ contraseña.charAt(contraseña.length()-1));
		String respuesta = scanner.nextLine().trim();
		while (!contraseña.equals(respuesta)) {
			
			intentos++;
			System.out.println("Es incorrecto");
			respuesta = scanner.nextLine();
			for (int i=0; i<contraseña.length();i++) {
				
			}
		}
		System.out.println("Es correcto, has acertado en el intento "+intentos);
	}

}
