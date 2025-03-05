package clase; // 📌 Indica que esta clase pertenece al paquete "clase"

// 📌 Definimos una excepción personalizada que extiende de Exception
class SaldoInsuficienteException extends Exception {
    // Constructor que recibe un mensaje de error
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje); // Llamamos al constructor de la clase Exception con el mensaje
    }
}

// 📌 Definimos una clase CuentaBancaria para manejar retiros de dinero
class CuentaBancaria {
    // 📌 Atributos: características de la cuenta
    private String titular; // Nombre del titular de la cuenta
    private double saldo;   // Cantidad de dinero disponible

    // 📌 Constructor: inicializa la cuenta con un titular y un saldo inicial
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // 📌 Método para mostrar el saldo actual
    public void mostrarSaldo() {
        System.out.println("Saldo actual de " + titular + ": $" + saldo);
    }

    // 📌 Método para retirar dinero con manejo de excepciones
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        // 📌 Verificamos si el saldo es suficiente antes de retirar
        if (cantidad > saldo) {
            // 🔥 Lanzamos una excepción si no hay suficiente dinero
            throw new SaldoInsuficienteException("Error: Saldo insuficiente para retirar $" + cantidad);
        }
        saldo -= cantidad; // Restamos la cantidad del saldo
        System.out.println("Retiro exitoso de $" + cantidad);
    }
}

// 📌 Clase principal donde ejecutamos el código
public class Excepcion {
    public static void main(String[] args) {
        // 📌 Creamos una cuenta con un saldo inicial de $100
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 100);

        // 📌 Mostramos el saldo inicial
        cuenta.mostrarSaldo();

        try {
            // 📌 Intentamos retirar $50 (debería ser exitoso)
            cuenta.retirar(50);
            cuenta.mostrarSaldo(); // Ver saldo después del retiro

            // 📌 Intentamos retirar $100 (esto generará una excepción)
            cuenta.retirar(100);
            cuenta.mostrarSaldo(); // Esta línea no se ejecutará si hay error
        } catch (SaldoInsuficienteException e) {
            // 📌 Capturamos la excepción y mostramos el mensaje de error
            System.out.println(e.getMessage());
        }

        // 📌 Diferencia entre una excepción y el uso de valores por defecto
        System.out.println("\n🔹 Diferencia entre excepción y valor por defecto:");

        // 📌 Ejemplo de valor por defecto con un switch
        String dia = "Martes";

        switch (dia) {
            case "Lunes":
                System.out.println("Es lunes, inicio de semana.");
                break;
            case "Viernes":
                System.out.println("Es viernes, casi fin de semana.");
                break;
            default:
                // 📌 Si no coincide con ningún caso, se usa el valor por defecto
                System.out.println("Es un día cualquiera.");
        }
    }
}
