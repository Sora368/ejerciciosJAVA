package com;

import java.util.Scanner;

public class Actividad_1 {

	public static void main(String[] args) {
		//Declaramos las variables
		int numero, cuadrado;
		Scanner sc = new Scanner(System.in);
		
		numero =1;
		
		//Proponemos el bucle
		
		while (numero != 0) {
			System.out.println("Introduce un número");
			numero =sc.nextInt();
			if (numero % 2 ==0) {
				System.out.println("Es un número par");
			}else {
				System.out.println("Es un número impar");
			}
			if (numero > 0) {
				System.out.println("El número es positivo");
			}else {
				System.out.println("El número es negativo");
			}
			cuadrado = numero * numero;
			System.out.println("El cuadrado del número es " + cuadrado);
		}
		System.out.println("Programa terminado");
	}

}
