package com;

import java.util.Scanner;

public class Actividad_9 {
	
	static Scanner sc = new Scanner(System.in);
	/**
	Los habitantes de Javalandia tienen un idioma algo extraño;
	cuando hablan siempre comienzan sus frases con “Javalín, javalón”, 
	para después hacer una pausa más o menos larga (la pausa se representa mediante 
	espacios en blanco o tabuladores) y a continuación expresan el mensaje. Existe un dialecto
	que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio, 
	más o menos prolongado y la coletilla “javalén, len, len”. Se pide diseñar un traductor que, en 
	primer lugar, nos diga si la frase introducida está escrita en el idioma de Javalandia 
	(en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo 
	el mensaje sin muletillas.**/
	
	public static void main(String[] args) {
		
		//Declaramos variables
		String mensaje;
		
		//Pedimos al usuario una frase para determinar si está en el idioma de javalandia
		System.out.println("Di una frase y si está en idioma de javalandia te la traduciré");
		mensaje = sc.nextLine();
		mensaje.trim();
		traductorJava(esJavalandés(mensaje), mensaje);
		
	}
	public static boolean esJavalandés (String frase) {
		boolean esJavalandés= false;
		String muletillaInicial= "Javalín, javalón", muletillaFinal="javalén, len, len";
		
		if (frase.startsWith(muletillaInicial)) {
			esJavalandés=true;
		}else if (frase.endsWith(muletillaFinal))
			esJavalandés=true;
		return esJavalandés;
	}
	public static void traductorJava (boolean es, String cadena) {
		String muletillaInicial= "Javalín, Javalón";
		String muletillaFinal= "javalén, len, len";
		String sust= cadena.replaceAll((muletillaInicial), "");
		sust=sust.replaceAll(muletillaFinal, "");
		if (es==true) {
			System.out.println(sust);
		}else {
			System.out.println("No es javalandés");
		}
	}

}
