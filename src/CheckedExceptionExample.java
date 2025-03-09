// Ejemplo de Excepción Checked (IOException)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentamos abrir un archivo que no existe
            File archivo = new File("archivo_inexistente.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();
        } catch (FileNotFoundException e) {
            // Capturamos la excepción FileNotFoundException
            System.out.println("Error: El archivo no fue encontrado.");
        }

        System.out.println("El programa continúa después del manejo de la excepción.");
    }
}

// Otras excepciones Checked comunes:
// - SQLException: Ocurre cuando hay un error en la ejecución de una consulta SQL.
// - InterruptedException: Se lanza cuando un hilo es interrumpido mientras está esperando o dormido.
// - MalformedURLException: Se genera cuando la URL proporcionada no tiene un formato válido.
// - ClassNotFoundException: Ocurre cuando una clase no puede ser encontrada en tiempo de ejecución.
