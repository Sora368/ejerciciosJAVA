package com;

public class Actividad_3 {

	public static void main(String[] args) {
		
		Actividad_3.areaCilindro(1, 2);

	}
	public static void areaCilindro (double altura, double base) {
		double area = 2 * Math.PI * base * (altura + base);
		System.out.println("El área de ese cilindro es "+ area);
		double volumen = Math.PI * (base * base ) *altura;
		System.out.println("El volumen del cilindro es "+ volumen);
		
		
		
	}

}
