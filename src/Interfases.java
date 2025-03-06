// Ejemplo de interfaces innovador con tecnología de anime

// Definimos la interfaz Conductor
interface Conductor {
    void conducir(); // Método sin implementación
}

// Definimos la interfaz Piloto de Mecha
interface PilotoMecha {
    void pilotear(); // Método sin implementación
}

// Clase que implementa la interfaz Conductor
class Kaneda implements Conductor {
    private String nombre;

    public Kaneda(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void conducir() {
        System.out.println(nombre + " conduce su moto futurista a toda velocidad!");
    }
}

// Clase que implementa la interfaz Piloto de Mecha
class Shinji implements PilotoMecha {
    private String nombre;

    public Shinji(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void pilotear() {
        System.out.println(nombre + " sube al EVA y lo pilota en batalla!");
    }
}

// Clase que implementa ambas interfaces (un personaje con múltiples habilidades)
class Asuka implements Conductor, PilotoMecha {
    private String nombre;

    public Asuka(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void conducir() {
        System.out.println(nombre + " maneja su vehículo como una experta!");
    }

    @Override
    public void pilotear() {
        System.out.println(nombre + " pilota su EVA con una gran confianza y destreza!");
    }
}

// Clase principal para probar las interfaces
public class Interfases {
    public static void main(String[] args) {
        // Creamos objetos de cada personaje
        Kaneda kaneda = new Kaneda("Kaneda");
        Shinji shinji = new Shinji("Shinji Ikari");
        Asuka asuka = new Asuka("Asuka Langley");

        // Probamos sus habilidades
        System.out.println("=== Acciones de los personajes ===");
        kaneda.conducir(); // Kaneda manejando su moto
        shinji.pilotear(); // Shinji pilotando el EVA

        System.out.println("\n=== Asuka tiene ambas habilidades ===");
        asuka.conducir(); // Asuka conduciendo
        asuka.pilotear(); // Asuka piloteando el EVA
    }
}
