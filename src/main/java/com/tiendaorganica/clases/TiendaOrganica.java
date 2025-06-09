package com.tiendaorganica.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que representa la tienda y gestiona el inventario de productos
 * orgánicos.
 */
public class TiendaOrganica {

    private final List<ProductoOrganico> inventario;

    public TiendaOrganica() {
        this.inventario = new ArrayList<>();
    }

    /**
     * Agrega un producto al inventario.
     */
    public void agregarProducto(ProductoOrganico producto) {
        inventario.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    /**
     * Elimina un producto por nombre.
     */
    public void eliminarProducto(String nombre) {
        Iterator<ProductoOrganico> iterator = inventario.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            ProductoOrganico producto = iterator.next();
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("Producto eliminado: " + nombre);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado: " + nombre);
        }
    }

    /**
     * Muestra todos los productos que tenga el inventario.
     */
    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("\n--- Inventario de Productos ---");
            for (ProductoOrganico producto : inventario) {
                System.out.println(producto);
            }
        }
    }
}
