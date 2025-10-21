package com;
import java.util.Scanner;
public class Actividad_14 {

	public static void main(String[] args) {
		
		
		/**############################################
		 * #   Declaramos las variables               #
		   ############################################*/
			
		int dia, mes, año;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la fecha
		System.out.println("Introduce el día");
		dia = sc.nextInt();
		System.out.println("Introduce el mes");
		mes= sc.nextInt();
		System.out.println("Introduce el año");
		año = sc.nextInt();
		//Sumamos el día
		dia++;
		
		//Escribimos las condicionales
		if ((mes <1 )|| (mes>12)||(dia<1)){
			System.out.println("La fecha no es válida");
		}else {
			if ((dia == 32)&&(mes == 1))  {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
				
			}else if ((dia == 29)&& ( mes == 2)) {
				dia = 1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if ((dia == 31 )&& ( mes == 3)) {
				dia = 1;
				mes++;
				System.out.println("El dia siguiente "+dia+"/"+mes+"/"+ año );
			}else if ((dia == 32) && (mes == 4)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if ((dia == 31) && (mes == 5)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
				
			}else if ((dia == 32)&& (mes == 6)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if ((dia == 31) && (mes == 7)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if ((dia == 32) && (mes == 8)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if ((dia == 31) && (mes == 9)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if (( dia == 32) && (mes == 10)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if (( dia == 31)&& (mes == 11)) {
				dia=1;
				mes++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else if((dia == 32)&& mes == 12) {
				dia=1;
				mes=1;
				año++;
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}else {
				System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+ año );
			}
		}
		
	}

}
