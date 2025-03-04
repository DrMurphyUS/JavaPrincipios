import java.util.ArrayList;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        // ArrayList permite almacenar una colección dinámica de elementos.
        // IMPORTANCIA: Es más flexible que un array porque puede crecer dinámicamente.

        // Declaración e inicialización de un ArrayList de String
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        // Mostrar los elementos del ArrayList
        System.out.println("Elementos del ArrayList:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
