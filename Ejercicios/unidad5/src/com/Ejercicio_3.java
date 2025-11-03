package com;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		//Declaramos las variables
		
		Scanner sc = new Scanner(System.in);
		
		/***********************************************
		 * Pedimos cuantos números podrá tener la tabla*
		 *                                             *
		 ***********************************************/
		System.out.println("¿Cuantos números quieres que tenga la tabla?");
		int n= sc.nextInt();
		int[] tabla= new int [n];
		
		/*************************************************
		 * Hacemos el bucle que se repetirá hasta cumplir* 
		 * con la cantidadde números introducida         *                               
		 *************************************************/
		
		for (int i=0 ; i< tabla.length; i++) {
			System.out.println("Introduce un número");
			tabla[i]=sc.nextInt();
		}
		/****************************
		 * Imprimimos los resultados*
		 ****************************/
		System.out.println("los números positivos son "+positivos(tabla)+ ", los negativos son " +negativos(tabla)+ " y los ceros son "+ceros(tabla));
	
	
	}
	/**
	 ********************************* 
	 * Función para números positivos*
	 *********************************
	 * @param numeros
	 * @return
	 */
	public static int positivos (int []numeros) {
		int contador=0;
		for (int numero:numeros) {
			if (numero > 0) {
				contador++;
			}
		}
		return contador;
		
	}
	/*********************************
	 * Función para números negativos*
	 *********************************
	 * @param numeros
	 * @return
	 */
	public static int negativos(int [] numeros) {
		int contador =0;
		for (int numero:numeros) {
			if (numero< 0) {
				contador++;
			}
		}
		return contador;
	}
	/****************************
	 * Función para contar ceros*
	 ****************************
	 * @param numeros
	 * @return
	 */
	public static int ceros (int [] numeros) {
		int contador=0;
		for (int numero: numeros) {
			if (numero==0) {
				contador++;
				
			}
		}
		return contador;
	}
}
