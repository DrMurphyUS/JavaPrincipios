import java.io.*;

public class FileStreamExample {
    public static void main(String[] args) {
        String archivoEntrada = "entrada.bin"; // Nombre del archivo de entrada
        String archivoSalida = "salida.bin";   // Nombre del archivo de salida

        // **ESCRIBIR en un archivo binario usando FileOutputStream**
        try (FileOutputStream fos = new FileOutputStream(archivoEntrada)) {
            // Datos de ejemplo en un array de bytes
            byte[] datos = {65, 66, 67, 68, 69}; // Representa las letras A, B, C, D, E

            fos.write(datos); // Escribimos los datos en el archivo
            System.out.println("Datos escritos en " + archivoEntrada);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // **LEER desde un archivo binario usando FileInputStream**
        try (FileInputStream fis = new FileInputStream(archivoEntrada);
             FileOutputStream fos = new FileOutputStream(archivoSalida)) {

            int byteLeido;
            System.out.println("Leyendo datos desde " + archivoEntrada + ":");

            while ((byteLeido = fis.read()) != -1) { // Lee un byte a la vez
                System.out.print((char) byteLeido + " "); // Muestra el carácter en consola
                fos.write(byteLeido); // Copia el byte en el archivo de salida
            }

            System.out.println("\nArchivo copiado exitosamente a " + archivoSalida);

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
}
