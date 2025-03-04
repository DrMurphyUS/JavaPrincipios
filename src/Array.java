public class Array {
    public static void main(String[] args) {
        // Un array almacena múltiples valores del mismo tipo en una estructura de tamaño fijo.
        // IMPORTANCIA: Son eficientes en términos de acceso a elementos y se usan en algoritmos y estructuras de datos básicas.

        // Declaración e inicialización de un array de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // Recorrer el array con un bucle for
        System.out.println("Elementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}
