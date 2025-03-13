import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample { // No podemos llamar a la clase "FileWriter" porque ya existe en Java
    public static void main(String[] args) {
        String nombreArchivo = "salida.txt"; // Nombre del archivo a escribir

        try (FileWriter fw = new FileWriter(nombreArchivo)) {
            fw.write("Hola, este es un archivo de prueba.\n");
            fw.write("Estamos aprendiendo FileWriter en Java.\n");
            fw.write("Esta es otra línea agregada al archivo.\n");

            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
