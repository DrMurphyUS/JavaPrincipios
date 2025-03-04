public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int suma = 10 + 5;
        int resta = 10 - 5;
        int multiplicacion = 10 * 5;
        int division = 10 / 5;
        int modulo = 10 % 3;

        // Operadores de Asignación
        int numero = 10;
        numero += 5; // Equivalente a numero = numero + 5;
        numero -= 3; // Equivalente a numero = numero - 3;

        // Operadores de Comparación
        boolean esIgual = (10 == 5);
        boolean esDiferente = (10 != 5);
        boolean esMayor = (10 > 5);
        boolean esMenor = (10 < 5);
        boolean esMayorIgual = (10 >= 5);
        boolean esMenorIgual = (10 <= 5);

        // Operadores Lógicos
        boolean operadorAnd = (true && false);
        boolean operadorOr = (true || false);
        boolean operadorNot = !true;

        // Operadores de Incremento y Decremento
        int contador = 10;
        contador++; // Incremento en 1
        contador--; // Decremento en 1

        // Imprimir resultados
        System.out.println("Operadores Aritméticos:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        System.out.println("\nOperadores de Asignación:");
        System.out.println("Número después de asignaciones: " + numero);

        System.out.println("\nOperadores de Comparación:");
        System.out.println("¿10 es igual a 5? " + esIgual);
        System.out.println("¿10 es diferente a 5? " + esDiferente);
        System.out.println("¿10 es mayor que 5? " + esMayor);
        System.out.println("¿10 es menor que 5? " + esMenor);
        System.out.println("¿10 es mayor o igual que 5? " + esMayorIgual);
        System.out.println("¿10 es menor o igual que 5? " + esMenorIgual);

        System.out.println("\nOperadores Lógicos:");
        System.out.println("true && false: " + operadorAnd);
        System.out.println("true || false: " + operadorOr);
        System.out.println("!true: " + operadorNot);

        System.out.println("\nOperadores de Incremento y Decremento:");
        System.out.println("Contador después de incrementar y decrementar: " + contador);
    }
}
