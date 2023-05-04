package org.example.ejercicio2.components;

public class DispositivosEntrada extends Componentes{
    private TipoEntrada tipoEntrada;

    public DispositivosEntrada(String nombreFabricante, String modelo, int precio, TipoEntrada tipoEntrada) {
        super(nombreFabricante, modelo, precio);
        this.tipoEntrada = tipoEntrada;
    }
}
