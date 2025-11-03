package com;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		System.out.println("Introduce otro número");
		int num2 = sc.nextInt();
		System.out.println("¿Cuál operación artimética quieres realizar?");
		
		String operacion= sc.next();
		
		if (operacion == "suma") {
			System.out.println(numero + num2);
		}else if (operacion == "resta ") {
			System.out.println(numero - num2);
		}else if (operacion == "división") {
			System.out.println(numero / num2);
		}else if (operacion == "multiplicación") {
			System.out.println(numero * num2);
		}
		
		
	}
}
