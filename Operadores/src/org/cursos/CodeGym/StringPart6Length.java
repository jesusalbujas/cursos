package org.cursos.CodeGym;

/*
El método main muestra los valores de tres filas.
Cambie el código para que se muestre la longitud de cada línea en lugar de los valores de línea.

Requirements:
•	No cambie el valor de la variable emptyString.
•	Para las tres líneas pasadas al método println, debe llamar al método de length().
•	El programa debería mostrar tres números en la pantalla, cada uno en una nueva línea.
*/

public class StringPart6Length {
    public static void main(String[] args) {
        String emptyString = "";

        //escribe aquí tu código
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
