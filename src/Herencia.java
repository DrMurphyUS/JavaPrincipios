// Clase base (Superclase)
class PersonajeAnime {
    String nombre;
    String serie;

    // Constructor de la clase PersonajeAnime
    public PersonajeAnime(String nombre, String serie) {
        this.nombre = nombre;
        this.serie = serie;
    }

    // Método para mostrar información del personaje
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Serie: " + serie);
    }
}

// Clase que hereda de PersonajeAnime (Subclase)
class Ninja extends PersonajeAnime {
    String aldea; // Aldea del ninja

    // Constructor de la clase Ninja
    public Ninja(String nombre, String serie, String aldea) {
        // Llamamos al constructor de la superclase con "super()"
        super(nombre, serie);
        this.aldea = aldea;
    }

    // Método para mostrar información del Ninja
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método de la clase padre
        System.out.println("Aldea: " + aldea);
    }
}

// Clase que hereda de PersonajeAnime (Subclase)
class Espadachin extends PersonajeAnime {
    String espada; // Espada del personaje

    // Constructor de la clase Espadachin
    public Espadachin(String nombre, String serie, String espada) {
        super(nombre, serie);
        this.espada = espada;
    }

    // Método para mostrar información del Espadachin
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Espada: " + espada);
    }
}

// Clase principal para probar la herencia
public class Herencia {
    public static void main(String[] args) {
        System.out.println("=== Ninja ===");
        // Creamos un objeto Ninja (Naruto)
        Ninja naruto = new Ninja("Naruto Uzumaki", "Naruto", "Aldea Oculta de la Hoja");
        naruto.mostrarInfo();

        System.out.println("\n=== Espadachin ===");
        // Creamos un objeto Espadachin (Zoro de One Piece)
        Espadachin zoro = new Espadachin("Roronoa Zoro", "One Piece", "Wado Ichimonji");
        zoro.mostrarInfo();
    }
}