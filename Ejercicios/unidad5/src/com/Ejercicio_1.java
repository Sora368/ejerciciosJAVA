package com;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nums = new double [5];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduzca un número");
			nums[i]= sc.nextDouble();
		}
		for (double numero : nums) {
			System.out.println(numero);
		}
	}

}
