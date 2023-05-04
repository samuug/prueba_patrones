package org.example.ejercicio2.builders;

import org.example.ejercicio2.components.DispositivosEntrada;
import org.example.ejercicio2.components.DispositivosSalida;
import org.example.ejercicio2.components.UnidadCentral;
import org.example.ejercicio2.laptop.Laptop1;

public class LaptopBuilder implements Builder{
    private UnidadCentral unidadCentral;
    private DispositivosEntrada dispositivosEntrada;
    private DispositivosSalida dispositivosSalida;


    @Override
    public void setUnidadCentral(UnidadCentral unidadCentral) {
        this.unidadCentral = unidadCentral;
    }

    @Override
    public void setDispositivosEntrada(DispositivosEntrada dispositivosEntrada) {
        this.dispositivosEntrada = dispositivosEntrada;
    }

    @Override
    public void setDispositivosSalida(DispositivosSalida dispositivosSalida) {
        this.dispositivosSalida = dispositivosSalida;
    }

    public Laptop1 getLaptop() {
        return new Laptop1(unidadCentral, dispositivosEntrada, dispositivosSalida);
    }
}
