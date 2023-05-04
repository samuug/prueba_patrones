package org.example.ejercicio1.builders;

import org.example.ejercicio1.base.Base;
import org.example.ejercicio1.components.Ambulancia;
import org.example.ejercicio1.components.Nombre;
import org.example.ejercicio1.components.TiempoMedio;

public class BaseBuilder implements BuilderBase {
    private Nombre nombre;
    private Ambulancia nAmbulancias;
    private TiempoMedio tiempoMedio;

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
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setNAmbulancias(Ambulancia nAmbulancias) {
        this.nAmbulancias = nAmbulancias;
    }

    @Override
    public void setTiempoMedio(TiempoMedio tiempoMedio) {
        this.tiempoMedio = tiempoMedio;
    }

    public Base getBase(){
        return new Base(this.nombre, this.nAmbulancias, this.tiempoMedio);
    }
}
