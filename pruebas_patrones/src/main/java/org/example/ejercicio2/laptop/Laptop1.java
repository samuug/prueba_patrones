package org.example.ejercicio2.laptop;

import org.example.ejercicio2.components.DispositivosEntrada;
import org.example.ejercicio2.components.DispositivosSalida;
import org.example.ejercicio2.components.UnidadCentral;

public class Laptop1 {
    private UnidadCentral unidadCentral;
    private DispositivosEntrada dispositivosEntrada;
    private DispositivosSalida dispositivosSalida;

    public Laptop1(UnidadCentral unidadCentral, DispositivosEntrada dispositivosEntrada, DispositivosSalida dispositivosSalida) {
        this.unidadCentral = unidadCentral;
        this.dispositivosEntrada = dispositivosEntrada;
        this.dispositivosSalida = dispositivosSalida;
    }

    public UnidadCentral getUnidadCentral() {
        return unidadCentral;
    }

    public DispositivosEntrada getDispositivosEntrada() {
        return dispositivosEntrada;
    }

    public DispositivosSalida getDispositivosSalida() {
        return dispositivosSalida;
    }


}
