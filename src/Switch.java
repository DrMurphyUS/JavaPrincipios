import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo 1: Switch con números (Días de la semana)
        System.out.print("Ingrese un número del 1 al 7 para ver el día de la semana: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido, ingrese un número del 1 al 7.");
        }

        // Ejemplo 2: Switch con cadenas (Colores)
        System.out.print("\nIngrese un color (rojo, azul, verde): ");
        scanner.nextLine(); // Limpiar buffer
        String color = scanner.nextLine().toLowerCase();

        switch (color) {
            case "rojo":
                System.out.println("Seleccionaste el color ROJO.");
                break;
            case "azul":
                System.out.println("Seleccionaste el color AZUL.");
                break;
            case "verde":
                System.out.println("Seleccionaste el color VERDE.");
                break;
            default:
                System.out.println("Color no reconocido.");
        }

        scanner.close();
    }
}
