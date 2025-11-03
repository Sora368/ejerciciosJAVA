package com;

public class Tarea_6 {

	public static void main(String[] args) {
		System.out.println(vocal('a'));

	}
	public static boolean vocal (char a1) {
		if (a1 == 'a' || a1== 'e' ||a1 == 'i' || a1 =='o' ||a1== 'u') {
			return true;
		}
		return false;
	}
}
