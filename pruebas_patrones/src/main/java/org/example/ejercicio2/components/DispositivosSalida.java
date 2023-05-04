package org.example.ejercicio2.components;

public class DispositivosSalida extends Componentes{
    private TipoSalida tipoSalida;

    public DispositivosSalida(String nombreFabricante, String modelo, int precio, TipoSalida tipoSalida) {
        super(nombreFabricante, modelo, precio);
        this.tipoSalida = tipoSalida;
    }
}
