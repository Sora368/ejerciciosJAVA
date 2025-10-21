package com;
import java.util.Scanner;
public class Actividad_12 {

	public static void main(String[] args) {
		//Declaramos variables
		Scanner sc = new Scanner(System.in);
		int cal, numcal;
		numcal=1;
		System.out.println("Introduce las calificaciones");
		while(numcal<=5) {
			cal = sc.nextInt();
			numcal++;
			if (cal <5) {
				System.out.println("Alumno suspenso");
			}else {
				System.out.println("Alumno aprobado");
			}
		}
		

	}

}
