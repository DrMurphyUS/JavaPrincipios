package clase; // 📌 Indica que esta clase pertenece al paquete "clase"

// 📌 Definimos la clase PersonaMetodos con atributos y métodos
class PersonaMetodos {
    // 📌 ESTOS SON LOS ATRIBUTOS (Características de la persona)
    String nombre;  // Esto es un atributo, almacena el nombre de la persona
    int edad;       // Esto es un atributo, almacena la edad de la persona

    // 📌 Constructor: Nos permite crear objetos con valores iniciales
    public PersonaMetodos(String nombre, int edad) {
        this.nombre = nombre;  // Asignamos el valor al atributo nombre
        this.edad = edad;      // Asignamos el valor al atributo edad
    }

    // 📌 MÉTODO 1: Un método sin parámetros que muestra un saludo
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // 📌 MÉTODO 2: Un método que aumenta la edad en 1 (simula un cumpleaños)
    public void cumplirAnios() {
        edad += 1; // Incrementamos la edad en 1
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    // 📌 MÉTODO 3: Un método que cambia el nombre de la persona
    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre; // Actualizamos el atributo nombre
        System.out.println("Mi nuevo nombre es " + nombre);
    }
}

// 📌 Clase principal donde ejecutamos el código
public class Metodos {
    public static void main(String[] args) {
        // 📌 Crear una instancia (objeto) de PersonaMetodos con atributos específicos
        PersonaMetodos persona1 = new PersonaMetodos("Carlos", 25);

        // 📌 Llamamos al método saludar()
        persona1.saludar();

        // 📌 Llamamos al método cumplirAnios()
        persona1.cumplirAnios();

        // 📌 Llamamos al método cambiarNombre() para modificar el nombre
        persona1.cambiarNombre("Juan");

        // 📌 Volvemos a llamar a saludar() para ver los cambios
        persona1.saludar();
    }
}
