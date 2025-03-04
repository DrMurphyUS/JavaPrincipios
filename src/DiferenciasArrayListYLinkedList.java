import java.util.ArrayList;
import java.util.LinkedList;

public class DiferenciasArrayListYLinkedList {
    public static void main(String[] args) {
        // ArrayList vs LinkedList
        // ArrayList usa un array interno para almacenar elementos, lo que permite accesos rápidos pero inserciones y eliminaciones más lentas.
        // LinkedList usa una estructura de nodos enlazados, lo que permite inserciones y eliminaciones rápidas pero accesos más lentos.

        // Crear un ArrayList
        ArrayList<Integer> listaArrayList = new ArrayList<>();
        listaArrayList.add(10);
        listaArrayList.add(20);
        listaArrayList.add(30);

        // Crear un LinkedList
        LinkedList<Integer> listaLinkedList = new LinkedList<>();
        listaLinkedList.add(10);
        listaLinkedList.add(20);
        listaLinkedList.add(30);

        // Mostrar elementos de ArrayList
        System.out.println("Elementos de ArrayList:");
        for (int num : listaArrayList) {
            System.out.println(num);
        }

        // Mostrar elementos de LinkedList
        System.out.println("\nElementos de LinkedList:");
        for (int num : listaLinkedList) {
            System.out.println(num);
        }
    }
}
