package com;
import java.util.Scanner;
public class Actividad_5 {

	public static void main(String[] args) {
		//Definimos variables
		Scanner sc = new Scanner(System.in);
		double num1;
		
		//Pedimos un número
		
		System.out.println("Introduce un número y te dire si es un casi 0\n o no\n");
		num1 = sc.nextDouble();
		if (((num1 < 0) && (num1 > -1)) || ((num1 < 1) && (num1 > 0))) {
			System.out.println("Es un casi 0");
		}else {
			System.out.println("No es un casi 0");
		}

	}

}
