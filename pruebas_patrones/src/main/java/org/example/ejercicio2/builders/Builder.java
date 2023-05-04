package org.example.ejercicio2.builders;

import org.example.ejercicio2.components.DispositivosEntrada;
import org.example.ejercicio2.components.DispositivosSalida;
import org.example.ejercicio2.components.UnidadCentral;

public interface Builder {
    void setUnidadCentral(UnidadCentral unidadCentral);
    void setDispositivosEntrada(DispositivosEntrada dispositivosEntrada);
    void setDispositivosSalida(DispositivosSalida dispositivosSalida);



}
