package com;
public class Actividad_2 {

	public static void main(String[] args) {
		Actividad_2.numerosIntervalo(50, 1000);
	}
	public static void numerosIntervalo(int n1, int n2) {
		int n3;
		if (n1>n2) {
			n3=n2;
			while (n3<=n1) {
				System.out.println(n3);
				n3++;
			}
		}else {
			n3=n1;
			while (n3<=n2) {
				System.out.println(n3);
				n3++;
			}
		}
	}

}
