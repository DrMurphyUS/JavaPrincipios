import java.util.Scanner; // Importamos Scanner para leer datos del usuario

// Definimos la CLASE Cuenta (Account)
public class Account {
    private String accountNumber; // ATRIBUTO: Número de cuenta
    private double balance; // ATRIBUTO: Saldo de la cuenta

    // CONSTRUCTOR: Inicializa la cuenta con número y saldo ingresado por el usuario
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber; // Guardamos el número de cuenta
        this.balance = balance; // Guardamos el saldo inicial
    }

    // MÉTODO para depositar dinero en la cuenta
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: No puedes depositar una cantidad negativa o cero.");
        } else {
            this.balance += amount;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + this.balance);
        }
    }

    // MÉTODO para retirar dinero con excepción si no hay fondos suficientes
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Error: Fondos insuficientes en la cuenta.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Error: No puedes retirar una cantidad negativa o cero.");
        }
        this.balance -= amount;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + this.balance);
    }

    // MÉTODO para mostrar el saldo actual
    public void showBalance() {
        System.out.println("Saldo actual en la cuenta [" + this.accountNumber + "]: $" + this.balance);
    }

    // Método para obtener el número de cuenta
    public String getAccountNumber() {
        return this.accountNumber;
    }
}

// CLASE para manejar la excepción de fondos insuficientes
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // Llama al constructor de la clase Exception con el mensaje de error
    }
}

// CLASE PRINCIPAL con menú interactivo
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        // SOLICITAR AL USUARIO SU NÚMERO DE CUENTA Y SALDO INICIAL
        System.out.print("Ingrese su número de cuenta: ");
        String accountNumber = scanner.nextLine(); // Leer el número de cuenta

        System.out.print("Ingrese su saldo inicial: ");
        double initialBalance = scanner.nextDouble(); // Leer el saldo inicial

        // Crear una cuenta con los datos ingresados
        Account miCuenta = new Account(accountNumber, initialBalance);
        System.out.println("¡Cuenta creada con éxito!");
        miCuenta.showBalance(); // Mostrar saldo inicial

        // Menú interactivo para el usuario
        while (true) {
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt(); // Leer la opción del usuario

            try {
                switch (opcion) {
                    case 1: // Depositar dinero
                        System.out.print("Ingrese la cantidad a depositar: ");
                        double deposito = scanner.nextDouble();
                        miCuenta.deposit(deposito);
                        break;

                    case 2: // Retirar dinero
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double retiro = scanner.nextDouble();
                        miCuenta.withdraw(retiro);
                        break;

                    case 3: // Mostrar saldo
                        miCuenta.showBalance();
                        break;

                    case 4: // Salir del programa
                        System.out.println("Gracias por usar el sistema bancario. ¡Hasta luego!");
                        scanner.close();
                        return; // Termina la ejecución del programa

                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage()); // Muestra el mensaje de error si no hay fondos suficientes
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Maneja otros errores (como valores negativos)
            }
        }
    }
}
