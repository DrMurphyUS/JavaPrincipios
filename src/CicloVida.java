package clase; // 📌 Indica que esta clase pertenece al paquete "clase"

// 📌 Definimos la clase ObjetoEjemplo para demostrar el ciclo de vida de un objeto
class ObjetoEjemplo {
    // 📌 ATRIBUTOS: Características del objeto
    public String nombre; // 🟢 Público: accesible desde cualquier parte
    private int edad;     // 🔴 Privado: solo accesible dentro de esta clase

    // 📌 1️⃣ CREACIÓN: CONSTRUCTOR
    // Se ejecuta automáticamente cuando se crea un objeto con `new`
    public ObjetoEjemplo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("🟢 Objeto creado: " + nombre + " (Edad: " + edad + ")");
    }

    // 📌 2️⃣ USO: Métodos para interactuar con el objeto

    // Método público para mostrar información del objeto
    public void mostrarInfo() {
        System.out.println("👤 Nombre: " + nombre);
        System.out.println("📆 Edad: " + edad);
    }

    // Método público para modificar un atributo del objeto
    public void cambiarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println("🔄 Edad actualizada a: " + edad);
    }

    // 📌 3️⃣ ELIMINACIÓN: Método llamado automáticamente cuando el objeto es eliminado
    @Override
    protected void finalize() {
        System.out.println("❌ Objeto " + nombre + " está siendo eliminado por el Garbage Collector.");
    }
}

// 📌 Clase principal donde ejecutamos el código
public class CicloVida {
    public static void main(String[] args) {
        System.out.println("🔹 Inicio del ciclo de vida del objeto");

        // 📌 1️⃣ CREACIÓN DEL OBJETO
        // Se usa `new` para crear un objeto, lo que llama al constructor
        ObjetoEjemplo objeto1 = new ObjetoEjemplo("Carlos", 25);

        // 📌 2️⃣ USO DEL OBJETO
        // Llamamos a métodos para interactuar con el objeto
        objeto1.mostrarInfo();    // Mostramos la información del objeto
        objeto1.cambiarEdad(30);  // Modificamos un atributo del objeto
        objeto1.mostrarInfo();    // Mostramos la nueva información

        // 📌 3️⃣ ELIMINACIÓN DEL OBJETO
        // Asignamos "null" y sugerimos que el Garbage Collector lo elimine
        objeto1 = null; // El objeto ya no tiene referencia, puede ser eliminado
        System.gc();    // Sugerimos al Garbage Collector que elimine el objeto

        System.out.println("🔹 Fin del ciclo de vida del objeto");
    }
}
