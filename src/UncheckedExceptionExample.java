// Ejemplo de Excepción Unchecked (NullPointerException)
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentamos acceder a un método de un objeto que es null.
            String texto = null;
            int longitud = texto.length(); // Esto lanza NullPointerException
            System.out.println("La longitud del texto es: " + longitud);
        } catch (NullPointerException e) {
            // Capturamos la excepción NullPointerException
            System.out.println("Error: Se intentó acceder a un objeto que es null.");
        }

        System.out.println("El programa continúa después del manejo de la excepción.");
    }
}

// Otras excepciones Unchecked comunes:
// - ArithmeticException: Ocurre cuando hay una operación aritmética inválida (Ejemplo: división por cero).
// - ArrayIndexOutOfBoundsException: Se lanza cuando intentas acceder a un índice fuera del rango de un array.
// - NumberFormatException: Se genera cuando intentas convertir un String en número pero el formato no es válido.
// - IllegalArgumentException: Se lanza cuando un argumento pasado a un método es inválido.
