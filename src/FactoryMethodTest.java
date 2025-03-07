// Ejemplo del Patrón Factory Method en Java
// Este patrón permite la creación de objetos sin especificar su clase exacta, delegando la responsabilidad a una subclase
// Se usa para evitar la creación directa de instancias y mejorar la flexibilidad del código

// Interfaz común para todos los productos que serán creados
interface Producto {
    void usar(); // Método que cada producto implementará
}

// Clases concretas que representan productos específicos
class ProductoA implements Producto {
    public void usar() {
        System.out.println("Usando el Producto A");
    }
}

class ProductoB implements Producto {
    public void usar() {
        System.out.println("Usando el Producto B");
    }
}

// Clase Factory Method que define el método para crear objetos
abstract class Creador {
    // Método Factory que las subclases implementarán para crear productos
    public abstract Producto crearProducto();
}

// Clases concretas que extienden de Creador y definen qué producto crear
class CreadorProductoA extends Creador {
    public Producto crearProducto() {
        return new ProductoA(); // Devuelve una instancia de ProductoA
    }
}

class CreadorProductoB extends Creador {
    public Producto crearProducto() {
        return new ProductoB(); // Devuelve una instancia de ProductoB
    }
}

// Clase de prueba para demostrar el uso del patrón Factory Method
public class FactoryMethodTest {
    public static void main(String[] args) {
        // Creamos un creador de ProductoA y un creador de ProductoB
        Creador creadorA = new CreadorProductoA();
        Creador creadorB = new CreadorProductoB();

        // Creamos los productos usando el Factory Method
        Producto producto1 = creadorA.crearProducto();
        Producto producto2 = creadorB.crearProducto();

        // Usamos los productos
        producto1.usar();
        producto2.usar();
    }
}
