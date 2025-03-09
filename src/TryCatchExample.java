public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Intentamos dividir un número entre 0, lo cual genera una excepción.
            int resultado = 10 / 0;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos la excepción específica de división por cero.
            // Esta excepción ocurre cuando intentamos dividir un número por cero.
            System.out.println("Error: No se puede dividir por cero.");
        } catch (NullPointerException e) {
            // Capturamos un posible error cuando intentamos acceder a un objeto nulo.
            // Esto ocurre si intentamos llamar un método o acceder a una propiedad en un objeto que no ha sido inicializado.
            System.out.println("Error: Se intentó acceder a un objeto que es null.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturamos error al intentar acceder a un índice fuera del rango de un array.
            // Esto ocurre si intentamos acceder a una posición que no existe dentro del array.
            System.out.println("Error: Índice fuera de los límites del array.");
        } catch (NumberFormatException e) {
            // Capturamos error cuando intentamos convertir un String a número pero el formato no es válido.
            // Ocurre cuando usamos Integer.parseInt() o Double.parseDouble() con un string no numérico.
            System.out.println("Error: No se puede convertir el texto a número.");
        } catch (Exception e) {
            // Capturamos cualquier otra excepción no contemplada anteriormente.
            // Exception es la clase base de todas las excepciones, por lo que esto atrapa cualquier error inesperado.
            System.out.println("Error general: " + e.getMessage());
        } finally {
            // El bloque finally se ejecuta siempre, haya o no una excepción.
            // Es útil para cerrar recursos como archivos o conexiones a bases de datos.
            System.out.println("Este mensaje siempre aparece al final del try-catch.");
        }

        // Este mensaje se imprime después del manejo de excepciones.
        // Demuestra que el programa continúa ejecutándose sin detenerse abruptamente.
        System.out.println("El programa continúa después del try-catch.");
    }
}
