package clase; // 📌 El archivo pertenece al paquete "clase"

// Definimos la clase Motor
class Motor {
    // Método que simula el encendido del motor
    public void encender() {
        System.out.println("Motor encendido 🚗");
    }
}

// Definimos la clase Auto, que tiene un Motor (COMPOSICIÓN)
class Auto {
    private Motor motor; // 📌 Un Auto TIENE un Motor (Composición)

    // Constructor del Auto que crea automáticamente un Motor
    public Auto() {
        this.motor = new Motor(); // 🔥 Se crea un Motor dentro del Auto
    }

    // Método que permite encender el auto
    public void arrancar() {
        System.out.println("Intentando encender el auto...");
        motor.encender(); // 🔥 El Auto usa su Motor para arrancar (Composición)
    }
}

// Clase principal para ejecutar el ejemplo de composición
public class ComposicionEjemplo {
    public static void main(String[] args) {
        // 🔥 Creación de una instancia de Auto
        Auto miAuto = new Auto();

        // 🔥 Llamamos al método arrancar(), que usa el Motor (COMPOSICIÓN)
        miAuto.arrancar();
    }
}
