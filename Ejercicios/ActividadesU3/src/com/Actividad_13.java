package com;
import java.util.Scanner;
public class Actividad_13 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int numnot,nota, alumAprob, alumSusp;
		numnot=1;
		alumAprob=0;
		alumSusp=0;
		while (numnot<=6) {
			System.out.println("Introduce la nota del alumno número "+numnot);
			nota = sc.nextInt();
			numnot++;
			if(nota>=5) {
				alumAprob++;
			}else {
				alumSusp++;
			}
		}System.out.println("Entre los alumnos ha habido "+ alumAprob+ " alumnos aprobados y "+alumSusp+ " alumnos suspendidos");

	}

}
