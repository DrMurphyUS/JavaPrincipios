import java.util.Scanner; // Importamos la clase Scanner para leer datos del usuario

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear Scanner para entrada de datos
        boolean continuar = true; // Variable para controlar si el usuario quiere seguir operando

        while (continuar) {
            // Pedir al usuario que ingrese la operación
            System.out.print("Ingrese la operación (sumar, restar, multiplicar, dividir): ");
            String operacion = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para evitar errores

            // Pedir los dos números
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            // Limpiar el buffer de entrada después de leer números
            scanner.nextLine();

            // Ejecutar la operación y mostrar el resultado
            double resultado = calcular(operacion, num1, num2);
            System.out.println("Resultado: " + resultado);

            // Preguntar al usuario si quiere hacer otra operación
            System.out.print("¿Desea realizar otra operación? (sí/no): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("si") && !respuesta.equals("sí")) {
                continuar = false; // Si no escribe "sí" o "si", se sale del bucle
            }
        }

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        scanner.close(); // Cerrar el Scanner para evitar fugas de memoria
    }

    // Método para realizar la operación matemática
    public static double calcular(String operacion, double a, double b) {
        switch (operacion) {
            case "sumar":
                return a + b;
            case "restar":
                return a - b;
            case "multiplicar":
                return a * b;
            case "dividir":
                if (b == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                    return Double.NaN; // Retorna "Not a Number" si hay un error
                }
                return a / b;
            default:
                System.out.println("Operación no válida. Use: sumar, restar, multiplicar o dividir.");
                return Double.NaN;
        }
    }
}
