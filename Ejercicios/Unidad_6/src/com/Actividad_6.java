package com;

import java.util.Scanner;
/**
 * Programa que escribe al revés cualquier texto introducido.
 */
public class Actividad_6 {
	
	static Scanner Scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduce una frase y te la daré invertida");
		String frase = Scan.nextLine();
		invertirCadena(frase);
	}
	/**
	 * 
	 * @param Cadena
	 */
	public static void invertirCadena (String Cadena) {
		String inv="";
		for (int i2=Cadena.length()-1; i2>=0; i2--) {
			inv= inv + Cadena.charAt(i2); 
		}
		System.out.println(inv.trim());
	}

}
