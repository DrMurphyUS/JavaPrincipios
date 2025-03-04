import java.util.HashMap;

public class HashMapEjemplo {
    public static void main(String[] args) {
        // HashMap almacena pares clave-valor y permite búsquedas rápidas.
        // IMPORTANCIA: Es útil cuando se necesita acceder a elementos por una clave en lugar de un índice.

        // Crear un HashMap
        HashMap<String, Integer> edades = new HashMap<>();

        // Agregar elementos (clave, valor)
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Carlos", 22);

        // Acceder a un valor por su clave
        System.out.println("Edad de María: " + edades.get("María"));

        // Recorrer el HashMap
        System.out.println("\nLista de edades:");
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + ": " + edades.get(nombre) + " años");
        }
    }
}
