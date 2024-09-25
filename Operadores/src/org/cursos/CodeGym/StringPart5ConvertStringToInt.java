package org.cursos.CodeGym;

/*
En la variable hugeAmount debes escribir el número 100500.
Utilice las variables bigAmount, greatAmount y convierta una cadena en un número.
Utilice un comando para declarar e inicializar hugeAmount.

Requirements:
•	No cambie los valores de las variables bigAmount y GreatAmount.
•	Para inicializar la variable hugeAmount, utilice bigAmount, greatAmount y el método Integer.parseInt(String).
•	El programa debería mostrar la variable hugeAmount.
*/

public class StringPart5ConvertStringToInt {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //escribe aquí tu código
        // Para convertir de String a Número se usa el método Integer.parseInt() para solo números

        System.out.println(hugeAmount);
    }
}
