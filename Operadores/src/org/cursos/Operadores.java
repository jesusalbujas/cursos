package org.cursos;

public class Operadores {
	
	public static void main(String[] args) {
		int a = 90;
		int b = 10;
		//	Suma
		System.out.println("A + B = " + (a + b));
		//	Resta
		System.out.println("A - B = " + (a - b));
		//	Multiplicación
		System.out.println("A * B = " + (a * b));
		//	División
		System.out.println("A / B = " + (a / b));
		//	Módulo
		System.out.println("A % B = " + (a % b));
		//	++
		System.out.println("A + 1 = " + (a++));
		System.out.println("A + 1 = " + (a));
		//	++ Antes
		System.out.println("1 + A = " + (++a));
		System.out.println("1 + A = " + (a));
		//	--
		System.out.println("A - 1 = " + (a--));
		System.out.println("A - 1 = " + (a));
		//	-- Antes
		System.out.println("1 - A = " + (--a));
		System.out.println("1 - A = " + (a));
		//	Suma mas de 1
		a += 5;
		System.out.println("A + 5 = " + a);
		//	Resta mas de 1
		a -= 5;
		System.out.println("A - 5 = " + a);
		//	
		boolean compare = (a == b);
		System.out.println("A == B = " + compare);
		System.out.println("!compare = " + !compare);
		System.out.println("A != B = " + (a != b));
		System.out.println("A > B = " + (a > b));
		System.out.println("A < B = " + (a < b));
		System.out.println("A >= B = " + (a >= b));
		System.out.println("A <= B = " + (a <= b));
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
