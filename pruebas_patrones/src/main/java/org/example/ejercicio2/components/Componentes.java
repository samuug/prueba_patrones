package org.example.ejercicio2.components;

public abstract class Componentes {
    protected String nombreFabricante;
    protected String modelo;
    protected int precio;

    public Componentes(String nombreFabricante, String modelo, int precio) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }
}
