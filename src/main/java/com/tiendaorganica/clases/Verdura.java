package com.tiendaorganica.clases;

/**
 * Clase que representa una verdura como producto orgánico.
 */
public class Verdura extends ProductoOrganico {

    private String tipoVerdura;

    public Verdura(String nombre, String tipo, double precio, String tipoVerdura) {
        super(nombre, tipo, precio);
        this.tipoVerdura = tipoVerdura;
    }

    public String getTipoVerdura() {
        return tipoVerdura;
    }

    public void setTipoVerdura(String tipoVerdura) {
        this.tipoVerdura = tipoVerdura;
    }

    /**
     * Aplica un extra del 5% para verduras que sean hoja verde.
     */
    @Override
    public double calcularPrecioVenta() {
        if (tipoVerdura.equalsIgnoreCase("hoja verde")) {
            return precio + ((5.0 / 100.0) * precio);
        }
        return precio;
    }

    /**
     * Aplica un descuento del 10% si el precio de la verdura es de más de $2.
     */
    @Override
    public double aplicarDescuento() {
        if (precio > 2.00) {
            return precio - ((10.0 / 100.0) * precio);
        }
        return precio;
    }

    @Override
    public String toString() {
        // Los precios serán mostrados utilizando únicamente dos decimales
        String precioVenta = String.format("%.2f", this.calcularPrecioVenta());
        String precioConDescuento = String.format("%.2f", this.aplicarDescuento());

        return super.toString() + ", Tipo de Verdura: " + tipoVerdura + ", Precio Venta: $" + precioVenta + ", Precio con Descuento: $" + precioConDescuento;
    }
}
