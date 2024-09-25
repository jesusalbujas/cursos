package org.cursos.CodeGym;

/* 
La variable number contiene un número.
Establezca la variable lastDigit igual al último dígito de este número.
Para realizar el cálculo, use la variable number y el operador módulo.
Use una sola instrucción para declarar e inicializar lastDigit.

Consejo: necesita el resto después de la división por 10.

Requirements:
•	No cambie el valor de la variable number.
•	Para calcular lastDigit, use la variable number y el operador módulo.
•	El programa debe mostrar el valor de la variable lastDigit.


Para un número entero, el último dígito de ese número siempre es el residuo cuando divides por 10. 
Esto es porque 10 tiene una sola cifra (de 0 a 9), y cualquier número más grande que 9 dejará un 
residuo que corresponde al último dígito.
*/


public class LastDigitOfANumber {
    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10; //escribe aquí tu código

        System.out.println(lastDigit);
    }
}
