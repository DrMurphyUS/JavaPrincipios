public class TiposDeDatos {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        byte numeroByte = 127; // Rango: -128 a 127
        short numeroShort = 32000; // Rango: -32,768 a 32,767
        int numeroInt = 2147483647; // Rango: -2^31 a 2^31-1
        long numeroLong = 9223372036854775807L; // Rango: -2^63 a 2^63-1

        float numeroFloat = 3.1416f; // Decimal de precisión simple (32 bits)
        double numeroDouble = 3.141592653589793; // Decimal de precisión doble (64 bits)

        char caracter = 'J'; // Caracter Unicode
        boolean esVerdadero = true; // Booleano (true o false)

        // Tipo de datos no primitivo
        String texto = "Hola, Java"; // Cadena de texto (referencia)

        // Imprimir los valores de cada tipo de dato
        System.out.println("Tipos de datos en Java:");
        System.out.println("Byte: " + numeroByte);
        System.out.println("Short: " + numeroShort);
        System.out.println("Int: " + numeroInt);
        System.out.println("Long: " + numeroLong);
        System.out.println("Float: " + numeroFloat);
        System.out.println("Double: " + numeroDouble);
        System.out.println("Char: " + caracter);
        System.out.println("Boolean: " + esVerdadero);
        System.out.println("String: " + texto);
    }
}
