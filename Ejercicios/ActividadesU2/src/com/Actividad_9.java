package com;
import java.util.Scanner;
public class Actividad_9 {

	public static void main(String[] args) {
	
		//Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int numero;
		//Solicitamos un número
		System.out.println("Introduce un número comprendido entre 0 y 99.999");
		
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Tiene que ser un número mayor que 0");
		}else if(numero < 10) {
			System.out.println("Su número tiene 1 cifra");
		}else if (numero <100) {
			System.out.println("Su número tiene 2 cifras");
		}else if (numero < 1000) {
			System.out.println("Su número tiene 3 cifras");
		}else if (numero < 10000) {
			System.out.println("Su número tiene 4 cifras");
		}else if (numero < 100000) {
			System.out.println("Su número tiene 5 cifras");
		}else{
			System.out.println("El número máximo es 99.999");
		}
		

	}

}
