package com.tiendaorganica;

import com.tiendaorganica.clases.TiendaOrganica;
import com.tiendaorganica.clases.Fruta;
import com.tiendaorganica.clases.Verdura;
import java.util.Scanner;

/**
 * Clase principal que contiene el menú interactivo de la tienda.
 */
public class Main {

    public static void main(String[] args) {
        // Instanciando un Scanner y una TiendaOrganica
        Scanner scanner = new Scanner(System.in);
        TiendaOrganica tienda = new TiendaOrganica();

        int opcion;

        // Este bloque siempre se ejecutará mientras la opción no sea salir
        do {
            System.out.println("\n----- MENÚ DE TIENDA ORGÁNICA -----");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Mostrar el inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese tipo general (Fruta/Verdura): ");
                    String tipo = scanner.nextLine();

                    System.out.print("Ingrese precio base: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    if (tipo.equalsIgnoreCase("Fruta")) {
                        System.out.print("Ingrese tipo de fruta (nacional/extranjera): ");
                        String tipoFruta = scanner.nextLine();
                        tienda.agregarProducto(new Fruta(nombre, tipo, precio, tipoFruta));

                    } else if (tipo.equalsIgnoreCase("Verdura")) {
                        System.out.print("Ingrese tipo de verdura (hoja verde/raíz/etc.): ");
                        String tipoVerdura = scanner.nextLine();
                        tienda.agregarProducto(new Verdura(nombre, tipo, precio, tipoVerdura));

                    } else {
                        System.out.println("Tipo no reconocido. Solo se aceptan Fruta o Verdura.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    tienda.eliminarProducto(nombreEliminar);
                    break;

                case 3:
                    tienda.mostrarInventario();
                    break;

                case 4:
                    System.out.println("Hasta pronto :)");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

        // Finalizando el scanner
        scanner.close();
    }
}
