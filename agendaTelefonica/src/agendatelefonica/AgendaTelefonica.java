package agendatelefonica;

public class AgendaTelefonica {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("|     AGENDA TELEFONICA     |");
        System.out.println("1. Guardar contacto");
        System.out.println("2. Ver todos los contactos");
        System.out.println("3. Buscar un contacto");
        System.out.println("4. Salir");
        System.out.println("Ingrese el numero de opcion: ");
        opcion = entrada.nextInt();
        
    }
    
}
