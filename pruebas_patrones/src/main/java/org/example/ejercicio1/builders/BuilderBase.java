package org.example.ejercicio1.builders;

import org.example.ejercicio1.components.Ambulancia;
import org.example.ejercicio1.components.Nombre;
import org.example.ejercicio1.components.TiempoMedio;

public interface BuilderBase {
    void setNombre(Nombre nombre);
    void setNAmbulancias(Ambulancia nAmbulancias);
    void setTiempoMedio(TiempoMedio tiempoMedio);
}
