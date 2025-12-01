package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_7 {
	/**
	 * Leer una serie de 6 enteros, guardarlos y mostrarlos ordenados. Repetir con
	 * otra serie de 6. A continuación, fusionar ambas tablas en una tercera de
	 * forma que los 12 números sigan ordenados, sin volver a ordenar. PISTAS
	 * Rellena t1 y t2, ordénalas con Arrays.sort(). Crea t3 con tamaño t1.length +
	 * t2.length. Usa índices i1, i2, i3 y un bucle mientras i3 < t3.length para
	 * intercalar el menor de t1[i1] y t2[i2], cuidando límites.
	 */

	public static void main(String[] args) {
		int[] t1 = new int[6];
		int[] t2 = new int[6];
		int[] t3 = new int[t1.length + t2.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Di 6 números");
		pedirNumero(t1, sc);
		Arrays.sort(t1);
		System.out.println(Arrays.toString(t1));
		System.out.println("Di otros 6 números");
		pedirNumero(t2, sc);
		Arrays.sort(t2);
		System.out.println(Arrays.toString(t2));
		System.out.println("Combinando ambas series de números equivale a");
		t3=juntarTabla3(t1, t2);
		System.out.println(Arrays.toString(t3));

	}

	public static void pedirNumero(int[] numeros, Scanner sc) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();

		}

	}

	public static int[] juntarTabla3(int[] numero1, int[] numero2) {
		int [] num3= new int[numero1.length + numero2.length];
		int i2=0;
		int i3=0;
		int i =0;
		while (i2< numero1.length && i3< numero2.length ) {
			if (numero1[i2]<numero2[i3]) {
				num3[i]= numero1[i2];
				i++;
				i2++;
			}else if(numero1[i2]==numero2[i3]) {
				num3[i]=numero1[i2];
				i2++;
				i++;
				num3[i]=numero2[i3];
				i3++;
				i++;
			}
			else {
				num3[i] = numero2[i3];
				i3++;
				i++;
			}
		
			
		}
		return num3;

	}
}
