package com;

import java.util.Scanner;
public class Actividad_1 {
	
	public static void main(String[] args) {
		
		//Hacer programa que pida un númeroy diga si es par o impar
		//Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int numero;
		
		//pedimos un número
		System.out.println("Di un número");
		numero = sc.nextInt();
		
		//Escribimos la condicional
		
		if (numero % 2 == 0) {
			System.out.println("Es par");
		
		}else {
			System.out.println("Es impar");
		}
		
		
	}

}
