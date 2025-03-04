import java.util.Scanner;

public class Leer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto para leer datos

        // Leer texto
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Leer número entero
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Leer número decimal
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Mostrar los valores ingresados
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");

        scanner.close(); // Cerrar el Scanner
    }
}
