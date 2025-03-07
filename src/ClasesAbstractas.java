// Ejemplo de Clases Abstractas en Java con temática de Pokémon

// Clase abstracta que representa un Pokémon
abstract class Pokemon {
    protected String nombre;
    protected String tipo;

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Método abstracto que debe ser implementado por las subclases
    abstract void atacar();

    // Método concreto que todas las subclases heredarán sin necesidad de modificar
    public void mostrarInfo() {
        System.out.println("Pokémon: " + nombre + " | Tipo: " + tipo);
    }
}

// Clase concreta que extiende de la clase abstracta (Pokémon tipo fuego)
class Charizard extends Pokemon {
    public Charizard() {
        super("Charizard", "Fuego/Volador");
    }

    @Override
    void atacar() {
        System.out.println(nombre + " usa Llamarada! 🔥");
    }
}

// Clase concreta que extiende de la clase abstracta (Pokémon tipo eléctrico)
class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", "Eléctrico");
    }

    @Override
    void atacar() {
        System.out.println(nombre + " usa Impactrueno! ⚡");
    }
}

// Clase concreta que extiende de la clase abstracta (Pokémon tipo agua)
class Squirtle extends Pokemon {
    public Squirtle() {
        super("Squirtle", "Agua");
    }

    @Override
    void atacar() {
        System.out.println(nombre + " usa Pistola de Agua! 💦");
    }
}

// Clase principal para ejecutar el programa
public class ClasesAbstractas {
    public static void main(String[] args) {
        // Creamos instancias de los diferentes Pokémon
        Pokemon charizard = new Charizard();
        Pokemon pikachu = new Pikachu();
        Pokemon squirtle = new Squirtle();

        // Mostramos información y ataques
        System.out.println("=== Información y ataques de Pokémon ===");
        charizard.mostrarInfo();
        charizard.atacar();

        System.out.println();
        pikachu.mostrarInfo();
        pikachu.atacar();

        System.out.println();
        squirtle.mostrarInfo();
        squirtle.atacar();
    }
}
