package clase; // 📌 Indica que esta clase pertenece al paquete "clase"

// 📌 Definimos la clase Pokemon para demostrar el uso de `new`
class Pokemon {
    // 📌 ATRIBUTOS: Son las características de cada Pokémon
    public String nombre;  // 🟢 Atributo público (nombre del Pokémon)
    private int nivel;     // 🔴 Atributo privado (nivel del Pokémon)

    // 📌 CONSTRUCTOR: Se ejecuta automáticamente cuando usamos `new`
    public Pokemon(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        System.out.println("⚡ Un nuevo Pokémon ha aparecido: " + nombre + " (Nivel " + nivel + ")");
    }

    // 📌 MÉTODO PÚBLICO: Permite mostrar la información del Pokémon
    public void mostrarInfo() {
        System.out.println("🐉 Pokémon: " + nombre);
        System.out.println("📈 Nivel: " + nivel);
    }

    // 📌 MÉTODO PÚBLICO: Permite subir de nivel al Pokémon
    public void subirNivel() {
        nivel += 5;
        System.out.println("🔥 " + nombre + " ha subido de nivel! Ahora es nivel " + nivel);
    }
}

// 📌 Clase principal donde ejecutamos el código
public class NewEjemplo {
    public static void main(String[] args) {
        System.out.println("🔹 ¡Comienza tu aventura Pokémon!");

        // 📌 1️⃣ CREACIÓN DE POKÉMONS CON `new`
        Pokemon pikachu = new Pokemon("Pikachu", 10); // Se crea un Pikachu
        Pokemon charizard = new Pokemon("Charizard", 36);  // Se crea un Charizard

        // 📌 2️⃣ USO DE LOS OBJETOS
        pikachu.mostrarInfo(); // Mostramos información de Pikachu
        charizard.mostrarInfo(); // Mostramos información de Charizard

        // 📌 3️⃣ MODIFICACIÓN DE OBJETOS
        pikachu.subirNivel(); // Pikachu sube de nivel
        charizard.subirNivel(); // Charizard sube de nivel

        System.out.println("🔹 ¡Tu equipo Pokémon está listo para la batalla!");
    }
}
