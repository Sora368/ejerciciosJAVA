package com;

import java.util.Scanner;

public class Actividad_4 {

	public static void main(String[] args) {
		
		//definimos las variables
				Scanner sc = new Scanner(System.in);
				int numero1 , numero2;
				
				//solicitamos un número
				
				System.out.println("Introduce un número");
				numero1 = sc.nextInt();
				
				//Solicitamos otro numero diferente
				
				System.out.println("Introduce otro número diferente");
				
				numero2 = sc.nextInt();
				
				if (numero1 == numero2) {
					System.out.println(numero1 + " y " + numero2 + " son el mismo número");
				}else if (numero1 > numero2){
					System.out.println(numero1 + " es mayor que " + numero2);
				}else {
					
					System.out.println(numero2 + " es mayor que " + numero1);
				}

	}

}
