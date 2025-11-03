package com;
import java.util.Scanner;
public class EjemploSobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static  String mostrar (String mensaje){
		String hola=mensaje;
		System.out.println("Hola");
		return mensaje;
	}
	public static int mostrar (int numero) {
		if (numero%2==0) {
			System.out.println("Es un número Par");
		}else {
			System.out.println("Es un número impar");
		}
		
		return numero;
	}
	public static void mostrar (String texto , int veces) {
		int numero;
		numero=1;
		while (numero<=veces) {
			numero++;
			System.out.println(texto);
			
		}
	}
}