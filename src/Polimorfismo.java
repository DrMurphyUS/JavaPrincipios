// Clase base (Superclase)
class Transporte {
    String nombre;

    // Constructor de la clase Transporte
    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    // Método que será sobreescrito (polimorfismo)
    public void moverse() {
        System.out.println(nombre + " se mueve de una manera genérica.");
    }
}

// Subclase Avion que hereda de Transporte
class Avion extends Transporte {
    public Avion(String nombre) {
        super(nombre);
    }

    // Sobreescribimos el método moverse
    @Override
    public void moverse() {
        System.out.println(nombre + " despega y vuela por los cielos.");
    }
}

// Subclase Barco que hereda de Transporte
class Barco extends Transporte {
    public Barco(String nombre) {
        super(nombre);
    }

    // Sobreescribimos el método moverse
    @Override
    public void moverse() {
        System.out.println(nombre + " navega por el mar.");
    }
}

// Subclase Tren que hereda de Transporte
class Tren extends Transporte {
    public Tren(String nombre) {
        super(nombre);
    }

    // Sobreescribimos el método moverse
    @Override
    public void moverse() {
        System.out.println(nombre + " avanza sobre rieles a gran velocidad.");
    }
}

// Clase principal para probar el polimorfismo
public class Polimorfismo {
    public static void main(String[] args) {
        // Creamos un transporte genérico
        Transporte transporte1 = new Transporte("Vehículo desconocido");

        // Creamos un avión
        Transporte transporte2 = new Avion("Boeing 747");

        // Creamos un barco
        Transporte transporte3 = new Barco("Titanic");

        // Creamos un tren
        Transporte transporte4 = new Tren("Shinkansen");

        // Probamos el polimorfismo
        System.out.println("=== Formas de moverse de los transportes ===");
        transporte1.moverse(); // Movimiento genérico
        transporte2.moverse(); // Movimiento del avión
        transporte3.moverse(); // Movimiento del barco
        transporte4.moverse(); // Movimiento del tren
    }
}
