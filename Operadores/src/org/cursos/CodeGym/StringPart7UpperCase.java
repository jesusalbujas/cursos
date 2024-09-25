package org.cursos.CodeGym;

/*
El método main muestra cuatro líneas. Cada una de ellas es un ejemplo excelente de abuso de mayúsculas.
Modifica el código para que todas las letras de estas cadenas estén en minúsculas.

Requirements:
•	No cambie los valores de las variables de title, degree y career.
•	Necesitas llamar al método toLowerCase() en las cuatro cadenas pasadas al método println().
•	La salida del programa debe constar de cuatro líneas.
*/

public class StringPart7UpperCase {
    public static void main(String[] args) {
        String caps = "si escribo en mayúsculas, ";
        String usa = "usa";

        //escribe aquí tu código
        System.out.println(usa.toUpperCase());
        System.out.println(("Winnie the Pooh").toUpperCase());
        System.out.println((caps + "saben que lo digo en serio").toUpperCase());
    }
}
