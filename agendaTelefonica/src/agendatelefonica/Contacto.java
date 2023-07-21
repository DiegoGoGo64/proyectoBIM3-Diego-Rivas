package agendatelefonica;

class Contacto {
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

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
