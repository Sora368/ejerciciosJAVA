package com;

import java.util.Random;

import java.util.Scanner;

public class Actividad_5 {

	public static void main(String[] args) {
		//Declaramos el Scanner
		Scanner sc = new Scanner(System.in);
		int fallos=0;
		
		//Pedimos el índice.
		
		System.out.println("Indica la longitud del índice de las dificultades 1 a 5");
		int indice = sc.nextInt();
		if (indice > 5 || indice<0) {
			System.out.println("Dificultad no válida");
		}else {
			System.out.println("Comienza el juego");
			int [] tabla = new int [indice];
			int i=0;
			while (i<indice) {
				int juego = sc.nextInt();
				Random random = new Random();
				int numaleatorio = random.nextInt(10);
				tabla[i]=numaleatorio;
				if (juego< numaleatorio) {
					System.out.println("El número buscado es mayor");
					fallos++;
				}else if (juego>numaleatorio) {
					System.out.println("El número buscado es menor");
					fallos++;
				}else {
					System.out.println("Número correcto");
					i++;
				}
			
				
				
			}
			System.out.println("Has tenido "+fallos+" fallos");
		}
		

	}

}
