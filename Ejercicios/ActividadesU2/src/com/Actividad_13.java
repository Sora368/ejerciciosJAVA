package com;
import java.util.Scanner;
public class Actividad_13 {

	public static void main(String[] args) {
		// Declaramos las variables
		int hora, min, seg;
		Scanner sc = new Scanner(System.in);
		
		
		/**############################
		 * #     Pedimos los números  #
		   ############################*/
		
		
		System.out.println("Introduce la hora");
		
		hora = sc.nextInt();
		
		System.out.println("Introduce los minutos");
		
		min = sc.nextInt();
		
		System.out.println("Introduce los segundos");
		
		seg = sc.nextInt();
		
		
		//Hacemos las condicionales
		
		if ((hora > 23 || hora < 00)||(min > 60 || min <1 )||(seg > 60 || seg <1)) {
			System.out.println("Esa hora no es válida");
		}else {
			System.out.println("Calculando la hora...");
			seg++;
			
		}if (seg == 60){
			seg=0;
			min++;
			if (min == 60) {
				min=0;
				hora++;
				if (hora == 24) {
					hora =00;
					System.out.println("La hora actual es "+ hora +""+hora+ " horas "+ min+""+min+ " minutos "+seg+""+seg+ " segundos");
				}else {
					System.out.println("La hora actual es "+ hora + " horas "+ min+""+min+ " minutos "+seg+""+seg+ " segundos");
				}
			}else {
				System.out.println("La hora actual es "+ hora + " horas "+ min+ " minutos "+seg+""+seg+ " segundos");
			}
		}else {
			System.out.println("La hora actual es "+ hora + " horas "+ min+ " minutos "+seg+ " segundos");
		}
	}

}
