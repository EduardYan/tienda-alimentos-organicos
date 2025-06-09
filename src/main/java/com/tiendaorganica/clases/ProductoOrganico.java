package com.tiendaorganica.clases;

/**
 * Clase abstracta que representa un producto orgánico genérico
 */
public abstract class ProductoOrganico {

    protected String nombre;
    protected String tipo;
    protected double precio;

    /* Constructor de clase */
    public ProductoOrganico(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Este método calcula el precio de venta del producto.
     *
     * @return precio de venta
     */
    public abstract double calcularPrecioVenta();

    /**
     * Est método aplica un descuento al producto según unas condiciones.
     *
     * @return precio con descuento aplicado
     */
    public abstract double aplicarDescuento();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo: " + tipo + ", Precio Base: $" + precio;
    }
}
