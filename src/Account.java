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

