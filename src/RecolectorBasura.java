package clase; // 📌 Indica que esta clase pertenece al paquete "clase"

// 📌 Definimos la clase GuerreroZ para representar personajes de Dragon Ball
class GuerreroZ {
    // 📌 ATRIBUTOS: Características del personaje
    public String nombre;  // 🟢 Nombre del Guerrero Z
    private int poder;     // 🔴 Nivel de poder (privado)

    // 📌 CONSTRUCTOR: Se ejecuta cuando se crea un objeto con `new`
    public GuerreroZ(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
        System.out.println("🔥 Un Guerrero Z ha aparecido: " + nombre + " (Poder: " + poder + ")");
    }

    // 📌 MÉTODO PÚBLICO: Muestra la información del personaje
    public void mostrarInfo() {
        System.out.println("💥 Nombre: " + nombre);
        System.out.println("⚡ Nivel de poder: " + poder);
    }

    // 📌 MÉTODO PARA AUMENTAR EL PODER
    public void entrenar(int incremento) {
        poder += incremento;
        System.out.println("💪 " + nombre + " ha entrenado y ahora tiene un poder de " + poder);
    }

    // 📌 MÉTODO FINALIZE: Se ejecuta cuando el objeto es eliminado por el Garbage Collector
    @Override
    protected void finalize() {
        System.out.println("🐉 Shenlong ha invocado al Garbage Collector para eliminar a " + nombre);
    }
}

// 📌 Clase principal donde ejecutamos el código
public class RecolectorBasura {
    public static void main(String[] args) {
        System.out.println("🔹 ¡Comienza la batalla en el Torneo del Poder!");

        // 📌 1️⃣ CREACIÓN DE GUERREROS CON `new`
        GuerreroZ goku = new GuerreroZ("Goku", 9000); // Se crea Goku
        GuerreroZ vegeta = new GuerreroZ("Vegeta", 8500); // Se crea Vegeta

        // 📌 2️⃣ USO DE LOS OBJETOS
        goku.mostrarInfo(); // Mostramos información de Goku
        vegeta.mostrarInfo(); // Mostramos información de Vegeta

        // 📌 3️⃣ MODIFICACIÓN DE OBJETOS (Entrenamiento)
        goku.entrenar(1000); // Goku entrena
        vegeta.entrenar(1200); // Vegeta entrena

        // 📌 4️⃣ ELIMINACIÓN DE OBJETOS
        // Vegeta ha sido eliminado del torneo, asignamos null
        vegeta = null;
        System.out.println("☠ Vegeta ha sido eliminado del Torneo del Poder...");

        // 🔥 Sugerimos al Garbage Collector que elimine objetos sin referencia
        System.gc(); // Llamamos a Shenlong para limpiar la memoria

        System.out.println("🔹 ¡Goku sigue luchando por la victoria!");
    }
}
