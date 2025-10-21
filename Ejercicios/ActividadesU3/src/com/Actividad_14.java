package com;
import java.util.Scanner;
public class Actividad_14 {

	public static void main(String[] args) {
		//Se declara el número de iteraciones
		Scanner sc = new Scanner(System.in);
		int num, n , s;
		System.out.println("Dime un número y crearemos un triangulo usando ese número de base");
		num= sc.nextInt();
		
		while(num >0) {
			System.out.println("*");
			s=num-1;
			while (s>0){
				System.out.println("*");
			}
			num--;
			System.out.println("");
		}
		
	}

}
