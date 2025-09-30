package com;
import java.util.Scanner;
public class Actividad_6 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int num1 , num2;
		//pedimos ambos números
		
		System.out.println("Introduce un número");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro número diferente");
		num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("No puedes introducir 2 veces el mismo número");
		
		}else if (num1 > num2) {
			System.out.print(num1 + ", ");
			System.out.println(num2);
			
			
		}else {
			System.out.print(num2 + ", ");
			System.out.println(num1);
		}
		
	}

}
