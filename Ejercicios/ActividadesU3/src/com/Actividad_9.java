package com;
import java.util.Scanner;
public class Actividad_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura, etiqueta = 0, maxAltura=0 , arbolMasAlto=0;
		
		do {
			System.out.println("Introduzca la áltura dek arbol " + etiqueta);
			altura = sc.nextInt();
			if (altura > maxAltura){
				maxAltura = altura;
			
			}
		}
	}

}
