package com;
import java.util.Scanner;
public class Actividad_11 {

	public static void main(String[] args) {
		//declaramos las variables
		Scanner sc = new Scanner(System.in);
		int notas;
		//Pedimos las notas
		System.out.println("Introduce tus notas");
		
		notas = sc.nextInt();
		
		if (notas < 0) {
			System.out.println("Esa nota no es posible");
			
		}else if( notas > 10) {
			System.out.println("Esa nota no es posile");
			
		}else if (notas<= 4) {
			System.out.println("Has suspendido");
		}else if (notas == 5) {
			System.out.println("Tienes un suficiente");
		}else if (notas == 6) {
			System.out.println("Tienes un bien");
			
		}else if (notas <= 8) {
			System.out.println("Tienes un notable");
		}else {
			System.out.println("Tienes un sobresaliente");
		}
			

	}

}
