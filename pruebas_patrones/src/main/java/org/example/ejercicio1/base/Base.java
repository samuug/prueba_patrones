package org.example.ejercicio1.base;

import org.example.ejercicio1.components.Ambulancia;
import org.example.ejercicio1.components.Nombre;
import org.example.ejercicio1.components.TiempoMedio;

public class Base {
    private Nombre nombre;
    private Ambulancia nAmbulancias;
    private TiempoMedio tiempoMedio;

    public Base(Nombre nombre, Ambulancia nAmbulancias, TiempoMedio tiempoMedio){
        this.nombre = nombre;
        this.nAmbulancias = nAmbulancias;
        this.tiempoMedio = tiempoMedio;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Ambulancia getnAmbulancias() {
        return nAmbulancias;
    }

    public TiempoMedio getTiempoMedio() {
        return tiempoMedio;
    }

    @Override
    public String toString() {
        return "Base{" +
                "nombre=" + nombre +
                ", nAmbulancias=" + nAmbulancias +
                ", tiempoMedio=" + tiempoMedio +
                '}';
    }
}
