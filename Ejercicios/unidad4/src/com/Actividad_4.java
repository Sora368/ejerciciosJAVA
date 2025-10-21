package com;

public class Actividad_4 {

	public static void main(String[] args) {
		mayorMenor(7, 6);
	}
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int mayorMenor(int n1, int n2) {
		int n3;
		if (n1>n2) {
			n3=n1;
		}else {
			n3=n2;
		}
		System.out.println(n3);
		return n3;
	}
}
