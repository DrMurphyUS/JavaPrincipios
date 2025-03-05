package clase; // 📌 Indica que esta clase pertenece al paquete "clase"

// 📌 Definimos una clase Vehiculo para demostrar los modificadores de acceso
class Vehiculo {
    // 📌 ATRIBUTOS CON DIFERENTES MODIFICADORES DE ACCESO
    public String marca = "Toyota";      // 🟢 Público: accesible desde cualquier parte
    private int velocidad = 0;           // 🔴 Privado: solo accesible dentro de esta clase
    protected String modelo = "Corolla"; // 🟠 Protegido: accesible dentro del mismo paquete o por herencia
    String color = "Rojo";               // 🔵 Default (sin modificador): accesible solo dentro del paquete

    // 📌 ATRIBUTO ESTÁTICO: No depende de una instancia, es compartido por todos los objetos
    static int totalVehiculos = 0;

    // 📌 ATRIBUTO FINAL: No se puede modificar después de asignarlo
    final int ruedas = 4;

    // 📌 CONSTRUCTOR: Se ejecuta cuando creamos un objeto de Vehiculo
    public Vehiculo() {
        totalVehiculos++; // Aumentamos el número de vehículos creados
    }

    // 📌 EJEMPLOS DE MÉTODOS CON MODIFICADORES DE ACCESO

    public void acelerar(int incremento) { // 🟢 Público: cualquiera puede llamarlo
        velocidad += incremento;
        System.out.println("El vehículo aceleró a " + velocidad + " km/h.");
    }

    private void mostrarVelocidad() { // 🔴 Privado: solo accesible dentro de esta clase
        System.out.println("Velocidad actual: " + velocidad + " km/h.");
    }

    protected void mostrarModelo() { // 🟠 Protegido: accesible dentro del paquete o por herencia
        System.out.println("Modelo del vehículo: " + modelo);
    }

    void mostrarColor() { // 🔵 Default: accesible solo dentro del paquete
        System.out.println("Color del vehículo: " + color);
    }

    // 📌 MÉTODO ESTÁTICO: Se puede llamar sin crear un objeto
    public static void mostrarTotalVehiculos() {
        System.out.println("Total de vehículos creados: " + totalVehiculos);
    }

    // 📌 MÉTODO FINAL: No puede ser sobrescrito en una subclase
    public final void infoFinal() {
        System.out.println("Este vehículo tiene " + ruedas + " ruedas y no se puede modificar.");
    }

    // 📌 Método privado para demostrar acceso restringido
    private void metodoPrivadoEjemplo() {
        System.out.println("🔴 Este método es privado y no se puede llamar desde fuera de la clase.");
    }

    // 📌 Método público que usa el método privado dentro de la misma clase
    public void llamarMetodoPrivado() {
        metodoPrivadoEjemplo(); // 🔴 Sí se puede llamar aquí porque estamos dentro de la clase
    }
}

// 📌 Clase principal donde ejecutamos el código
public class ModificadoresAcceso {
    public static void main(String[] args) {
        // 🔥 Creamos un objeto de la clase Vehiculo
        Vehiculo miVehiculo = new Vehiculo();

        // 📌 ACCESO A ATRIBUTOS SEGÚN SU MODIFICADOR
        System.out.println("🔹 Accediendo a atributos:");
        System.out.println("🟢 Público (marca): " + miVehiculo.marca); // ✅ Se puede acceder
        // System.out.println("🔴 Privado (velocidad): " + miVehiculo.velocidad); // ❌ ERROR: No se puede acceder
        System.out.println("🟠 Protegido (modelo): " + miVehiculo.modelo); // ✅ Se puede acceder en el mismo paquete
        System.out.println("🔵 Default (color): " + miVehiculo.color); // ✅ Se puede acceder en el mismo paquete

        // 📌 ACCESO A MÉTODOS SEGÚN SU MODIFICADOR
        System.out.println("\n🔹 Llamando a métodos:");
        miVehiculo.acelerar(50); // 🟢 Público
        // miVehiculo.mostrarVelocidad(); // ❌ ERROR: No se puede acceder (privado)
        miVehiculo.mostrarModelo(); // 🟠 Protegido (se puede acceder dentro del mismo paquete)
        miVehiculo.mostrarColor(); // 🔵 Default (se puede acceder dentro del mismo paquete)

        // 📌 ACCEDIENDO A MÉTODOS ESTÁTICOS
        System.out.println("\n🔹 Método estático sin necesidad de crear un objeto:");
        Vehiculo.mostrarTotalVehiculos(); // ✅ Se puede llamar sin instanciar un objeto

        // 📌 ACCEDIENDO A MÉTODO FINAL
        System.out.println("\n🔹 Método final:");
        miVehiculo.infoFinal(); // ✅ Se puede llamar, pero no modificar en subclases

        // 📌 EJEMPLO DE MÉTODO PRIVADO
        System.out.println("\n🔹 Llamando a un método privado a través de un método público:");
        miVehiculo.llamarMetodoPrivado(); // ✅ El método público puede llamar al método privado dentro de la misma clase

        // 📌 Intentar acceder a un método privado directamente (esto daría error si lo descomentamos)
        // miVehiculo.metodoPrivadoEjemplo(); // ❌ ERROR: No se puede acceder a un método privado
    }
}
