package com;

import java.util.Scanner;

public class Actividad_3 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("Di una palabra y se añadirá a una frase, hasta que escribas la palabra fin");
			sumaPalabra();
	}
	public static void sumaPalabra () {
		String palabra= scan.nextLine();
		String frase = palabra;
		String fin = "fin";
		while (!(palabra.equals(palabra.compareToIgnoreCase(fin)==0))) {
			System.out.println(frase+" ");
			palabra=scan.nextLine().trim();
				frase+=" "+palabra;
			}
			
			
		}
	}

}
