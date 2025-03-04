public class IfElse {
    public static void main(String[] args) {
        int numero = 18;

        // Ejemplo básico de if-else
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo o cero.");
        }

        // Ejemplo de if-else anidado
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Ejemplo de if-else con booleanos
        boolean esMayorDeEdad = verificarEdad(numero);
        if (esMayorDeEdad) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    // Método para verificar si una persona es mayor de edad
    private static boolean verificarEdad(int edad) {
        return edad >= 18;
    }
}
