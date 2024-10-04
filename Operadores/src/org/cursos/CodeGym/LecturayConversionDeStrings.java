package org.cursos.CodeGym;

/* 
 
Lea tres strings del teclado.
Y luego:

Mostrar el tercer string sin cambios.
Mostrar el segundo string después de convertirlo a mayúsculas.
Mostrar el primer string después de convertirlo a minúsculas.
Ejemplo de entrada:

e>Line Number TIMES
nd line
Line 3
Ejemplo de salida:

Line 3
SECOND LINE
line number times
Requirements:
•	El programa debe leer tres líneas desde el teclado.
•	La tercera línea se debe mostrar sin cambios.
•	La segunda línea se debe mostrar en mayúsculas.
•	La primera línea se debe mostrar en minúsculas.
•	Las tres líneas se deben imprimir en el orden correcto: tercero, segundo, primero.
*/
import java.util.Scanner;
public class LecturayConversionDeStrings {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicitar la primera línea (se convertirá a minúsculas)
        System.out.println("Ingrese una primera palabra: ");
        String firstLine = s.nextLine();

        // Solicitar la segunda línea (se convertirá a mayúsculas)
        System.out.println("Ingrese una segunda palabra: ");
        String secondLine = s.nextLine();

        // Solicitar la tercera línea (se mostrará sin cambios)
        System.out.println("Ingrese una tercera palabra: ");
        String threeLine = s.nextLine();

        // Imprimir las líneas con las transformaciones correctas
        System.out.println(threeLine);               // Mostrar tercera línea sin cambios
        System.out.println(secondLine.toUpperCase()); // Mostrar segunda línea en mayúsculas
        System.out.println(firstLine.toLowerCase());  // Mostrar primera línea en minúsculas
    }
}
