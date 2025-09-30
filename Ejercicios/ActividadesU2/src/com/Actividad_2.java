package com;
import java.util.Scanner;
public class Actividad_2 {

	public static void main(String[] args) {
		
		//declarmos las variables
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		
		//pedimos ambos números
		
		System.out.println("Escribe un número");
		numero1 = sc.nextInt();
		
		System.out.println("Escribe otro número");
		numero2 = sc.nextInt();
		
		
		//escribimos las condicionales
		
		if (numero1 == numero2){
			System.out.println("Es el mismo número");
			
		}else {
			System.out.println("Son números diferentes");
		}

	}

}
