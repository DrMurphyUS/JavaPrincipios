public class Loops {
    public static void main(String[] args) {
        // Bucle For
        System.out.println("Bucle For:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // Bucle While
        System.out.println("\nBucle While:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Iteración: " + contador);
            contador++;
        }

        // Bucle Do-While
        System.out.println("\nBucle Do-While:");
        int numero = 1;
        do {
            System.out.println("Iteración: " + numero);
            numero++;
        } while (numero <= 5);

        // Bucle For-Each (para recorrer arrays)
        System.out.println("\nBucle For-Each:");
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo"};
        for (String color : colores) {
            System.out.println("Color: " + color);
        }
    }
}
