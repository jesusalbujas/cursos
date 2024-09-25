package org.cursos.CodeGym;

/*
Rellena los espacios en blanco con espacios emptiness... o viceversa.

Utilice la variable emptiness, cadenas de espacio simple y concatenación de cadenas, para escribir la cadena "emptiness emptiness emptiness" en la variable fullness.

Requirements:
•	No cambie el valor de la variable de emptiness.
•	La variable de fullness debe inicializarse en una sola cadena utilizando la variable de emptiness, cadenas de espacio simple y concatenación de cadenas.
•	El programa debería mostrar el valor de la variable de fullness.
*/

public class StringPart3VoidAndSpaces {
    public static void main (String[] args) {
        String emptiness = "emptiness";

        String fullness = emptiness + " " + emptiness + " " + emptiness; //escribe aquí tu código

        System.out.println(fullness);
    }
}
