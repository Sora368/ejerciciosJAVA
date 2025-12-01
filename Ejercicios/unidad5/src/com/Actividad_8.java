package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] copiaTabla;
		System.out.println("Introduce el índice de la tabla");
		int n = sc.nextInt();
		int[] tabla =new int [n];
		System.out.println("Introduce los valores de la tabla");
		pedirNumeros(tabla, sc);
		System.out.println("Resolviendo repeticones y eliminandolas de la tabla...");
		copiaTabla=crearCopiaTabla(tabla);
		System.out.println(Arrays.toString(copiaTabla));

	}
	public static int [] pedirNumeros (int [] numero, Scanner sc ) {
		for (int i=0; i < numero.length; i++) {
			numero[i]= sc.nextInt();
		}
		return numero;
	}
	public static int [] crearCopiaTabla (int [] numero) {
		int [] temp1 = new int [numero.length];
		int temp2, cantidad=0 , i2=0;
		int [] devuelveTabla= new int [cantidad];
		for (int i=0; i < numero.length; i++) {
			for (int i3=0; i3<numero.length;i3++) {
				if (temp1[i]==numero[i3]) {
					i++;
				}else {
					devuelveTabla[i2]=temp1[i];
					i2++;
					cantidad++;
					
				}
			}
		}
		return devuelveTabla;
	}
		
}
