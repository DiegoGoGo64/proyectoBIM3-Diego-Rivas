package agendatelefonica;

import java.util.Scanner;

public class AgendaTelefonica {

    static Contacto[] contactos = new Contacto[15];
    static int contador = 0;

    public static void main(String[] args) {

        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        while (opcion != 5) {
            System.out.println("|     AGENDA TELEFONICA     |");
            System.out.println("1. Guardar contacto");
            System.out.println("2. Ver todos los contactos");
            System.out.println("3. Buscar un contacto");
            System.out.println("4. Actualizar contacto");
            System.out.println("5. Salir");
            System.out.println("Ingrese el numero de opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    guardarContacto();
                    break;
                case 2:
                    System.out.println("-------- Todos los contactos ---------");
                    verContactos();
                    break;
                case 3:
                    System.out.println("-------- Buscar contacto ---------");
                    System.out.println("Ingrese el número de telefono: ");
                    Scanner teclado = new Scanner(System.in);
                    String numero = teclado.nextLine();
                    buscarContacto(numero);
                    break;
                case 4:
                    System.out.println("-------- Actualizar contacto ---------");
                    System.out.println("Ingrese el número de teléfono: ");
                    Scanner tecladoActualizar = new Scanner(System.in);
                    String numeroActualizar = tecladoActualizar.nextLine();
                    actualizarContacto(numeroActualizar);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                case 6:
                    System.out.println("OpciOn incorrecta");
                    break;
            }

        }

    }

    static public void guardarContacto() {
        if (contador >= 15) {
            System.out.println("La agenda esta llena. No es posible guardar mas contactos.");
        } else {
            Scanner teclado = new Scanner(System.in);
            System.out.println("------ Nuevo contacto -------");
            System.out.println("Ingrese el numero de telefono: ");
            String numero = teclado.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el domicilio: ");
            String domicilio = teclado.nextLine();
            contactos[contador] = new Contacto(numero, nombre, domicilio);
            System.out.println("Contacto guardado exitosamente.");
            contador++;
        }
    }

    static public void verContactos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Numero de telefono: " + contactos[i].getNumero());
            System.out.println("Nombre: " + contactos[i].getNombre());
            System.out.println("Domicilio: " + contactos[i].getDomicilio());
            System.out.println("##################################");
        }
    }

    static public void buscarContacto(String numero) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNumero().equals(numero)) {
                System.out.println("Numero de telefono: " + contactos[i].getNumero());
                System.out.println("Nombre: " + contactos[i].getNombre());
                System.out.println("Domicilio: " + contactos[i].getDomicilio());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    static public void actualizarContacto(String numero) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNumero().equals(numero)) {
                System.out.println("Ingrese el nuevo nombre: ");
                Scanner teclado = new Scanner(System.in);
                String nuevoNombre = teclado.nextLine();
                System.out.println("Ingrese el nuevo numero de telefono: ");
                String nuevoNumero = teclado.nextLine();
                System.out.println("Ingrese el nuevo domicilio: ");
                String nuevoDomicilio = teclado.nextLine();
                contactos[i].setNombre(nuevoNombre);
                contactos[i].setNumero(nuevoNumero);
                contactos[i].setDomicilio(nuevoDomicilio);
                System.out.println("Contacto actualizado exitosamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

}
