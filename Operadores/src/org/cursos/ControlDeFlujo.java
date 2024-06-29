package org.cursos;

public class ControlDeFlujo {
	
	public static void main(String[] args) {
		int a = 90;
		int b = 10;
		// Control de Flujo
		if(!(a == b)) {
			System.out.println("(A) es igual a (B)");
		} else {
			System.out.println("(A) no es igual a (B)");
		}
		//	Dos condiciones
		if(a > b && a != b) {
			System.out.println("(A) es mayor a (B) y (A) es diferente de (B)");
		}
		if(a > b && a == b) {
			System.out.println("(A) es mayor a (B) y (A) es igual a (B)");
		}
		if(a == b || a > b) {
			System.out.println("(A) es igual a (B) o (A) es mayor que (B)");
		}
		if(((a > b && a == b) || a > b) && a < b) {
			System.out.println("****");
		}
		//	
		if(a < b) {
			System.out.println("a < b");
		} else {
			System.out.println("a > b");
		}
		//	
		if(a < b) {
			System.out.println("a < b");
		} else {
			if(a > b) {
				System.out.println("a > b");
			} else {
				System.out.println("a == b");
			}
		}
		//	Simplificado
		System.out.println("IF/Else:**************************");
		if(a < b) {
			System.out.println("a < b");
		} else if(a > b) {
			System.out.println("a > b");
		} else if(a == b) {
			System.out.println("a == b");
		} else if(a >= b) {
			System.out.println("a >= b");
		} else if(a <= b) {
			System.out.println("a <= b");
		}
		//	
		System.out.println("IF:**************************");
		if(a < b) {
			System.out.println("a < b");
		}
		if(a > b) {
			System.out.println("a > b");
		}
		if(a == b) {
			System.out.println("a == b");
		}
		if(a >= b) {
			System.out.println("a >= b");
		}
		if(a <= b) {
			System.out.println("a <= b");
		}
		System.out.println("Switch:**************************");
		//	Switch
		switch (a) {
			case 10: {
				System.out.println("a == 10");
			}
			case 20: {
				System.out.println("a == 20");
			}
			case 91: {
				System.out.println("a == 91");
			}
			default: {
				System.out.println("a == no se");
			}
		}
	}
}
