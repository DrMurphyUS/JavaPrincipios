// Ejemplo del Patrón Singleton en Java
// El Singleton asegura que solo haya una instancia de una clase y proporciona un punto global de acceso a ella.
// Se usa cuando queremos restringir la creación de múltiples instancias de una clase, como en el manejo de configuración, logs o conexiones a bases de datos.

class PatronSingleton {
    // Variable estática que almacenará la única instancia de la clase
    // Se inicializa en null y se crea solo cuando se necesita (lazy initialization)
    private static PatronSingleton instancia;

    // Constructor privado para evitar que se creen instancias desde fuera de la clase
    private PatronSingleton() {
        System.out.println("Instancia de PatronSingleton creada");
    }

    // Método estático para obtener la única instancia de la clase
    public static PatronSingleton getInstancia() {
        // Verifica si la instancia aún no ha sido creada
        if (instancia == null) {
            instancia = new PatronSingleton(); // Se crea la instancia solo una vez
        }
        return instancia; // Devuelve la misma instancia en cada llamada
    }

    // Método de ejemplo para demostrar el uso de la instancia única
    public void mostrarMensaje() {
        System.out.println("Hola, soy una instancia única de PatronSingleton");
    }
}

public class PatronSingletonTest {
    public static void main(String[] args) {
        // Intentamos obtener la instancia varias veces
        PatronSingleton s1 = PatronSingleton.getInstancia();
        PatronSingleton s2 = PatronSingleton.getInstancia();

        // Mostramos mensajes para comprobar que es la misma instancia
        s1.mostrarMensaje();
        s2.mostrarMensaje();

        // Comprobamos que ambas variables apuntan a la misma instancia
        System.out.println("¿s1 y s2 son la misma instancia? " + (s1 == s2));
        // Debería imprimir 'true', indicando que ambas referencias apuntan al mismo objeto
    }
}
