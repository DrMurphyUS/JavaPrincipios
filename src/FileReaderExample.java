import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderExample { // La clase no puede llamarse exactamente "FileReader" porque ya existe en Java
    public static void main(String[] args) {
        String nombreArchivo = "ejemplo.txt"; // Nombre del archivo a leer

        try (FileReader fr = new FileReader(nombreArchivo);
             BufferedReader br = new BufferedReader(fr)) {
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); // Imprimir cada línea del archivo
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
