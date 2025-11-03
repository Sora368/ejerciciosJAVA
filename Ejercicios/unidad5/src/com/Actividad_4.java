package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] fav= {3, 21, 33, 29, 12, 56, 58, 94, 13, 54};
		int aux;
		System.out.println("Inicio...");
		mostrar(fav);
		do {
			//Pedir al usuario el índice de un elemento
			System.out.println("Dime el índice: ");
			int num = sc.nextInt();
			
			if (num> fav.length || num<0 ) {
				continue;
			}
			//Imprimir el último número  de 'numeros'
			
			aux = fav[fav.length-1];
			
			fav[num]=aux;
			
			fav= Arrays.copyOf(fav, fav.length-1);
			
			
			mostrar(fav);
			
			
		}while (fav.length>0);
		
		System.out.println("FIN");
		
		
	}
	
	public static void mostrar (int [] tabla) {
		System.out.print("[");
		for (int elemento :tabla) {
			System.out.print(elemento+"\t");
		}
		System.out.print("]");
	}

}
