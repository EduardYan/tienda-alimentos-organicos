package com.tiendaorganica.clases;

/**
 * Clase que representa una fruta como producto orgánico.
 */
public class Fruta extends ProductoOrganico {

    private String tipoFruta;

    public Fruta(String nombre, String tipo, double precio, String tipoFruta) {
        super(nombre, tipo, precio);
        this.tipoFruta = tipoFruta;
    }

    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }

    /**
     * Aplica un extra del 10% para frutas que sean extranjeras.
     */
    @Override
    public double calcularPrecioVenta() {
        if (tipoFruta.equalsIgnoreCase("extranjera")) {
            return precio + ((10.0 / 100.0) * precio);
        }
        return precio;
    }

    /**
     * Aplica un descuento del 15% si el precio de la fruta es de más de $2.
     */
    @Override
    public double aplicarDescuento() {
        if (precio > 2.00) {
            return precio - ((15.0 / 100.0) * precio);
        }
        return precio;
    }

    @Override
    public String toString() {
        // Los precios serán mostrados utilizando únicamente dos decimales
        String precioVenta = String.format("%.2f", calcularPrecioVenta());
        String precioConDescuento = String.format("%.2f", aplicarDescuento());

        return super.toString() + ", Tipo de Fruta: " + tipoFruta + ", Precio Venta: $" + precioVenta + ", Precio con Descuento: $" + precioConDescuento;
    }
}
