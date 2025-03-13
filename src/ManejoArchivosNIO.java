import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManejoArchivosNIO {
    public static void main(String[] args) {
        String archivo = "archivo.txt"; // Nombre del archivo que se usará

        // *** ESCRIBIR ARCHIVO USANDO BufferedWriter Y flush() ***
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            // Escribimos líneas de texto en el archivo
            bw.write("Primera línea de texto.\n");
            bw.write("Segunda línea de texto.\n");

            // FLUSH: Se usa para forzar la escritura inmediata en el archivo
            // Normalmente, los datos se almacenan en un buffer antes de escribirse en el disco.
            // flush() garantiza que esos datos se guarden en el archivo de inmediato, sin cerrar el BufferedWriter.
            bw.flush();

            System.out.println("Datos escritos en " + archivo);

        } catch (IOException e) {
            // Capturamos cualquier error al intentar escribir en el archivo.
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        // *** LEER ARCHIVO USANDO Files.readAllLines() ***
        try {
            // Creamos un objeto Path para representar la ruta del archivo
            Path path = Paths.get(archivo);

            // readAllLines(): Lee todas las líneas del archivo y las almacena en una lista de Strings.
            // Cada elemento de la lista representa una línea del archivo.
            List<String> lineas = Files.readAllLines(path);

            // Mostramos el contenido del archivo en la consola
            System.out.println("\nContenido del archivo:");
            for (String linea : lineas) {
                System.out.println(linea); // Imprimimos cada línea en la consola
            }

        } catch (IOException e) {
            // Capturamos cualquier error al intentar leer el archivo.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
