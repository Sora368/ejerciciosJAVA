package com;

import java.util.Scanner;

public class Actividad_8_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
				Scanner sc = new Scanner(System.in);
				double a, b, c, discriminante,raiz, resul1, resul2;
				discriminante=1;
				raiz=1;
				//Pedimos los coeficientes de la ecuación de segundo grado.
				
				System.out.println("Introduce el primer cociente");
				
				a = sc.nextDouble();
				
				System.out.println("Introduce el segundo cociente");
				
				b = sc.nextDouble();
				
				System.out.println("Introduce el tercer cociente");
				
				
				c = sc.nextDouble();
				
				//hacemos las primeras condicionales
				if (a == 0) {
					System.out.println("No es una ecuación de segundo grado");
					discriminante = ((b*b)-4*a*c);
					raiz = Math.sqrt(discriminante);
				}else if (raiz <= 0) {
					System.out.println("no tiene solución");
				}else{
					resul1= (int) (-1* b + raiz)/(2*a);
					resul2= (int) (-1* b - raiz)/(2*a);
					System.out.println("Su primer resultado es "+ resul1+ " y el segundo es "+resul2);
					
				}
	}

}
