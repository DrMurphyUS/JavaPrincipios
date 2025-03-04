import java.util.ArrayList;

public class IterarArrayYArrayList {
    public static void main(String[] args) {
        // Iteración de un Array
        int[] numeros = {5, 10, 15, 20};
        System.out.println("Iteración de un Array:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Iteración de un ArrayList
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");

        System.out.println("\nIteración de un ArrayList:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
