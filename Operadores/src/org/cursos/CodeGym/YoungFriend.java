package org.cursos.CodeGym;

/*
Actualmente estamos en el año 3126. Mi amigo nació hace 8 años.
Escribe un programa que muestre el año de nacimiento de mi amigo.

Requirements:
El programa debe generar texto.
El año mostrado debe tener cuatro dígitos.
El año mostrado debe comenzar por «31».
El año mostrado debe cumplir las condiciones de la tarea.
*/

public class YoungFriend {
	public static void main(String[] args) {
	    Integer year = 3126;
	    Integer yearBefore = 8;
	    
	    Integer yearActual = year - yearBefore;
	    System.out.println(yearActual);
	}
}
