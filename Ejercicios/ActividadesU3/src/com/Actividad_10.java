package com;
import java.util.Scanner;
public class Actividad_10 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int num1, num2, resultado;
		
		//Pedimos un número 
		System.out.println("Introduce un número para saber su tabla de multipicar");
		num2 = sc.nextInt();
		num1=1;
		if (num2 <1 || num2 >10) {
			System.out.println("El número no es válido");
		}else {
			while (num1 <= 10) {
				resultado = num1 * num2;
				System.out.println(num2 + " x " + num1+ " = " +resultado);
				num1++;
			}
		}
		

	}

}
