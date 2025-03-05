package clase; // 📌 El archivo pertenece al paquete "clase"

// Definimos la clase Persona
class Persona {
    String nombre; // Atributo para almacenar el nombre de la persona

    // Constructor que recibe un nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método que permite a la persona presentarse
    public void decirNombre() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

// Clase principal para ejecutar el ejemplo de instancia e interacción
public class InstanciaEjemplo {
    public static void main(String[] args) {
        // 🔥 Creación de una instancia de la clase Persona (INSTANCIA)
        Persona persona1 = new Persona("Carlos");

        // 🔥 Llamamos a un método de la instancia (INTERACCIÓN)
        persona1.decirNombre();
    }
}
