package clase; // 📌 Indica que esta clase pertenece al paquete "clase"

// 📌 Definimos la clase PersonaAtributos con atributos
class PersonaAtributos {
    // 📌 ESTOS SON LOS ATRIBUTOS (características de la persona)
    String nombre;  // Esto es un atributo, almacena el nombre de la persona
    int edad;       // Esto es un atributo, almacena la edad de la persona
    double altura;  // Esto es un atributo, almacena la altura de la persona

    // 📌 Constructor: Nos permite crear objetos con valores iniciales
    public PersonaAtributos(String nombre, int edad, double altura) {
        this.nombre = nombre;  // Asignamos el valor al atributo nombre
        this.edad = edad;      // Asignamos el valor al atributo edad
        this.altura = altura;  // Asignamos el valor al atributo altura
    }

    // 📌 Método para mostrar los atributos del objeto
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
    }
}

// 📌 Clase principal donde ejecutamos el código
public class Atributos {
    public static void main(String[] args) {
        // 📌 Crear una instancia (objeto) de PersonaAtributos con atributos específicos
        PersonaAtributos persona1 = new PersonaAtributos("Carlos", 25, 1.75);

        // 📌 Llamar al método mostrarInfo() para ver los atributos del objeto
        persona1.mostrarInfo();
    }
}
