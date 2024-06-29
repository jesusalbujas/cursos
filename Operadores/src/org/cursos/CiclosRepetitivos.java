package org.cursos;

public class CiclosRepetitivos {
	
	public static void main(String[] args) {
		//	For
		//	for(declaración; condición ; operador )
		for(int valor = 0; valor < 100; valor ++) {
			System.out.println("El valor es: " + valor);
		}
		//	
		System.out.println("Arreglos***********************");
		String[] nombres = {
				"José",
				"Pedro",
				"María",
				"Juana",
				"Pepe"
		};
		System.out.println("Longitud del Arreglo = " + nombres.length);
		System.out.println("Primer Nombre del Arreglo = " + nombres[0]);
		//	Todo el Arreglo
		System.out.println("For: Imprime todo el arreglo");
		for(int indice = 0; indice < nombres.length; indice ++) {
			System.out.println("El Nombre del indice " + indice + " es " + nombres[indice]);
		}
		//	
		System.out.println("For: Imprime todo el arreglo de atrás para adelante");
		for(int indice = nombres.length - 1; indice >= 0; indice --) {
			System.out.println("El Nombre del indice " + indice + " es " + nombres[indice]);
		}
		System.out.println("For: Forma más corta");
		for(String nombre : nombres) {
			System.out.println("El Nombre es " + nombre);
		}
		//	While
		System.out.println("While:*******************");
		int indice = 0;
		while(indice < nombres.length) {
			System.out.println("El Nombre del indice " + indice + " es " + nombres[indice]);
			indice ++;
		}
		System.out.println("Do While:*******************");
		int indice1 = 0;
		do {
			System.out.println("El Nombre del indice " + indice1 + " es " + nombres[indice1]);
			indice1 ++;
		} while(nombres[indice1].equals("Pepe"));
	}
}
