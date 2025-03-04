public class CleanCode {
    public static void main(String[] args) {
        // Llamamos a los métodos organizados para mostrar ejemplos de Clean Code
        mostrarMensajeBienvenida();
        int resultadoSuma = sumar(10, 5);
        int resultadoMultiplicacion = multiplicar(4, 3);
        boolean esPar = esNumeroPar(8);

        // Mostramos los resultados
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("¿El número 8 es par? " + esPar);
    }

    // Método con un nombre descriptivo
    private static void mostrarMensajeBienvenida() {
        System.out.println("¡Bienvenido a los principios de Clean Code en Java!");
    }

    // Métodos pequeños y reutilizables con nombres claros
    private static int sumar(int a, int b) {
        return a + b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }
}
