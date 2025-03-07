// Ejemplo del Patrón Estructural - Adaptador en Java
// Los patrones estructurales ayudan a definir cómo las clases y objetos se organizan para formar estructuras más grandes
// El patrón Adaptador permite que dos interfaces incompatibles trabajen juntas

// Interfaz existente (que ya tenemos y queremos reutilizar)
interface EnchufeEuropeo {
    void conectar();
}

// Implementación concreta del enchufe europeo
class EnchufeEuropeoImpl implements EnchufeEuropeo {
    public void conectar() {
        System.out.println("Enchufe europeo conectado");
    }
}

// Interfaz esperada en otro sistema (con una interfaz diferente)
interface EnchufeAmericano {
    void plugIn();
}

// Adaptador que convierte un EnchufeEuropeo en un EnchufeAmericano
class AdaptadorEnchufe implements EnchufeAmericano {
    private EnchufeEuropeo enchufeEuropeo;

    // El adaptador recibe un enchufe europeo y lo convierte
    public AdaptadorEnchufe(EnchufeEuropeo enchufeEuropeo) {
        this.enchufeEuropeo = enchufeEuropeo;
    }

    // Implementación del método plugIn usando el enchufe europeo
    public void plugIn() {
        System.out.println("Adaptando de enchufe europeo a americano...");
        enchufeEuropeo.conectar();
    }
}

// Clase de prueba para demostrar el uso del patrón Adaptador
public class AdaptadorTest {
    public static void main(String[] args) {
        // Tenemos un enchufe europeo
        EnchufeEuropeo enchufeEuropeo = new EnchufeEuropeoImpl();

        // Queremos usarlo en un sistema americano usando el adaptador
        EnchufeAmericano enchufeAdaptado = new AdaptadorEnchufe(enchufeEuropeo);

        // Ahora podemos conectar el enchufe europeo en un sistema americano
        enchufeAdaptado.plugIn();
    }
}
