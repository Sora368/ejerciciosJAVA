package com;
import java.util.Scanner;
public class Actividad_15 {

	public static void main(String[] args) {
		//Declaramos variables
		int n,n2, n3, primo;
		Scanner sc =new Scanner(System.in);
		//Pedimos un número por consola
		System.out.println("Introduce un número y te diré cuantos números primos hay entre 1 y ese número");
		n= sc.nextInt();
		
		for (int i =2; i<=n; i++) {
			if (esPrimo(i)) {
				imprime (i + "es primo");
				
			}else {
				imprime (i+ " No primo");
			}
		}
		
	}

}
