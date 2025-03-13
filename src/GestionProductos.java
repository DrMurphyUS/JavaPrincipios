import java.io.*;

// Clase Producto que será guardada en el archivo (Debe ser Serializable)
class Producto implements Serializable {
    private static final long serialVersionUID = 1L; // Para compatibilidad en serialización
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar la información del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: S/ " + precio + ", Stock: " + stock);
    }
}

// Clase principal para gestionar productos
public class GestionProductos {
    public static void main(String[] args) {
        String archivo = "productos.dat"; // Archivo donde se guardarán los objetos

        // **ESCRIBIR OBJETOS en un archivo usando ObjectOutputStream**
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            // Crear productos
            Producto p1 = new Producto("Laptop", 3500.99, 10);
            Producto p2 = new Producto("Mouse", 49.99, 50);
            Producto p3 = new Producto("Teclado Mecánico", 199.99, 20);

            // Escribir los productos en el archivo
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);

            System.out.println("Productos escritos en " + archivo);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // **LEER OBJETOS desde un archivo usando ObjectInputStream**
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            System.out.println("\nLeyendo productos desde " + archivo + ":");

            // Leer objetos del archivo y mostrarlos en consola
            while (true) {
                try {
                    Producto producto = (Producto) ois.readObject();
                    producto.mostrarInfo();
                } catch (EOFException e) {
                    break; // Fin del archivo, salimos del loop
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
