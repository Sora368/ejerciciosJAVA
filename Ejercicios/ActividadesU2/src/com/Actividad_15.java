package com;
import java.util.Scanner;
public class Actividad_15 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int dia;
		
		//Pedimos un número
		System.out.println("Introduce un número y te diré a que dia de la semana corresponde");
		dia = sc.nextInt();
		if ((dia< 1)||(dia >7)){
			System.out.println("No es un número válido");
		}else{
			switch (dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
		}
		
		
			
		}

	}

}
