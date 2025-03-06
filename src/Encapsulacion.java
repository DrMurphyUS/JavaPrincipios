// Clase que demuestra encapsulación con Coraje el Perro Cobarde
class Perro {
    // Atributos privados (No pueden ser accedidos directamente desde fuera de la clase)
    private String nombre;
    private int nivelDeMiedo;

    // Constructor para inicializar los atributos
    public Perro(String nombre, int nivelDeMiedo) {
        this.nombre = nombre;
        this.nivelDeMiedo = nivelDeMiedo;
    }

    // Métodos públicos para acceder y modificar los atributos de forma segura
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDeMiedo() {
        return nivelDeMiedo;
    }

    public void setNivelDeMiedo(int nivelDeMiedo) {
        if (nivelDeMiedo >= 0 && nivelDeMiedo <= 100) { // Validamos que el miedo esté dentro de un rango
            this.nivelDeMiedo = nivelDeMiedo;
        } else {
            System.out.println("¡El nivel de miedo debe estar entre 0 y 100!");
        }
    }

    // Método para mostrar información del perro
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel de Miedo: " + nivelDeMiedo);
    }
}

// Clase principal para probar la encapsulación
public class Encapsulacion {
    public static void main(String[] args) {
        // Creamos un objeto Perro representando a Coraje
        Perro coraje = new Perro("Coraje el Perro Cobarde", 90);

        // Mostramos la información inicial
        System.out.println("=== Datos Iniciales ===");
        coraje.mostrarInfo();

        // Intentamos modificar su nivel de miedo de forma segura
        System.out.println("\n=== Modificando Nivel de Miedo ===");
        coraje.setNivelDeMiedo(50); // Cambio válido
        coraje.mostrarInfo();

        // Intentamos poner un nivel de miedo inválido (debe rechazarlo)
        System.out.println("\n=== Intento de Nivel de Miedo Inválido ===");
        coraje.setNivelDeMiedo(150);
        coraje.mostrarInfo();
    }
}
