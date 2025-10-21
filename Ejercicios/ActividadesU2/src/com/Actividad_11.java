package com;
import java.util.Scanner;
public class Actividad_11 {

	public static void main(String[] args) {
		//declaramos las variables
		Scanner sc = new Scanner(System.in);
		double notas;
		//Pedimos las notas
		System.out.println("Introduce tus notas");
		
		notas = sc.nextDouble();
		
		if (notas < 0) {
			System.out.println("Esa nota no es posible");
			
		}else if( notas > 10) {
			System.out.println("Esa nota no es posile");
			
		}else if (notas<= 4) {
			System.out.println("Has suspendido");
		}else if (notas>= 5 && notas<6) {
			System.out.println("Tienes un suficiente");
		}else if (notas>=6 && notas <7) {
			System.out.println("Tienes un bien");
			
		}else if (notas>=7 && notas < 9) {
			System.out.println("Tienes un notable");
		}else {
			System.out.println("Tienes un sobresaliente");
		}
		
	}


}
	