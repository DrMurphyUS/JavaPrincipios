import java.io.*;

public class BufferedReadWriteExample {
    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida.txt";

        // Escribir en un archivo con BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoEntrada))) {
            bw.write("Hola, este es un archivo de prueba.\n");
            bw.write("Estamos aprendiendo BufferedWriter en Java.\n");
            bw.write("Esta es otra línea de texto.\n");
            System.out.println("Archivo escrito correctamente en " + archivoEntrada);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Leer el archivo con BufferedReader y escribirlo en otro archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Leyendo: " + linea);
                bw.write(linea + "\n"); // Escribimos en el archivo de salida
            }

            System.out.println("Archivo copiado a " + archivoSalida);

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
}
