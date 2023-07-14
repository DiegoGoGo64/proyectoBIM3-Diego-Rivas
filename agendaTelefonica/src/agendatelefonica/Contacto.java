package agendatelefonica;

public class Contacto {

    private String numero;
    private String nombre;
    private String domicilio;

    public Contacto(String numero, String nombre, String domicilio) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
}
