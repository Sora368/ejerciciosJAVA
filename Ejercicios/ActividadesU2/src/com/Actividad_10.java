package com;
import java.util.Scanner;
public class Actividad_10 {

	public static void main(String[] args) {
		// Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int numero, unidades, decenas, centenas, millares;
		
		/**
		 * Pedimos un número
		 */
		System.out.println("Introduce un número");
		
		numero = sc.nextInt();
		/**
		 * 
		 * 
		 * Escribimos las condicionales
		 * 
		 */
		
		if (numero < 10){
			System.out.println("No es un número capicua");
		}else if (numero <100) {
			unidades = numero % 10;
			decenas = numero / 10;
			if (unidades == decenas){
				System.out.println(numero +" es capicúa");
			}else {
				System.out.println(numero +" no es capicúa");
			}
		}else if (numero < 1000) {
			unidades = numero % 10;
			centenas = numero / 100;
			if (unidades == centenas) {
				System.out.println(numero +" es capicúa");
			}else {
				System.out.println(numero +" no es capicúa");
			}
		}else if (numero < 10000) {
			unidades = numero % 10;
			decenas = (numero / 10)%10;
			centenas = (numero / 100) % 10;
			millares = numero / 1000;
			if (unidades == millares && decenas == centenas) {
				System.out.println(numero +" es capicúa");
			}else {
				System.out.println(numero + " no es capicúa");
			}
		}else {
			System.out.println("Es un número demasiado grande");
		}
	}

}
