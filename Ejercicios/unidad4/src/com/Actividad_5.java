package com;

public class Actividad_5 {

	public static void main(String[] args) {
	mayor(7, 8, 2);

	}
	public static int mayor (int n1, int n2, int n3) {
		int n4;
		if (n1 > n2 && n1< n3) {
			n4=n3;
		}else if (n2 > n3 && n2 <n1) {
			n4=n1;
		}else {
			n4=n2;
		}
		System.out.println(n4);
		return n4;
	}
}
