// Ejemplo del Patrón de Comportamiento - Estrategia en Java
// Los patrones de comportamiento se enfocan en cómo los objetos interactúan y se comunican entre sí
// El patrón Estrategia permite cambiar dinámicamente el comportamiento de un objeto en tiempo de ejecución

// Interfaz que define una estrategia de operación
interface Estrategia {
    int ejecutar(int a, int b);
}

// Implementaciones concretas de estrategias
class EstrategiaSuma implements Estrategia {
    public int ejecutar(int a, int b) {
        return a + b;
    }
}

class EstrategiaResta implements Estrategia {
    public int ejecutar(int a, int b) {
        return a - b;
    }
}

class EstrategiaMultiplicacion implements Estrategia {
    public int ejecutar(int a, int b) {
        return a * b;
    }
}

// Contexto que utiliza una estrategia
class Contexto {
    private Estrategia estrategia;

    // Método para definir la estrategia a utilizar
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    // Método que ejecuta la operación usando la estrategia seleccionada
    public int ejecutarEstrategia(int a, int b) {
        return estrategia.ejecutar(a, b);
    }
}

// Clase de prueba para demostrar el uso del patrón Estrategia
public class EstrategiaTest {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        // Usamos la estrategia de suma
        contexto.setEstrategia(new EstrategiaSuma());
        System.out.println("Suma: " + contexto.ejecutarEstrategia(5, 3));

        // Cambiamos a la estrategia de resta
        contexto.setEstrategia(new EstrategiaResta());
        System.out.println("Resta: " + contexto.ejecutarEstrategia(5, 3));

        // Cambiamos a la estrategia de multiplicación
        contexto.setEstrategia(new EstrategiaMultiplicacion());
        System.out.println("Multiplicación: " + contexto.ejecutarEstrategia(5, 3));
    }
}