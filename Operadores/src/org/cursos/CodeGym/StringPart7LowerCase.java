package org.cursos.CodeGym;

/*
El método main muestra cuatro líneas. Cada una de ellas es un ejemplo excelente de abuso de mayúsculas.
Modifica el código para que todas las letras de estas cadenas estén en minúsculas.

Requirements:
•	No cambie los valores de las variables de title, degree y career.
•	Necesitas llamar al método toLowerCase() en las cuatro cadenas pasadas al método println().
•	La salida del programa debe constar de cuatro líneas.
*/

public class StringPart7LowerCase {
    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //escribe aquí tu código
        System.out.println(("RESUME").toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: " + career).toLowerCase());
    }
}
