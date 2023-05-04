package org.example.ejercicio1.director;

import org.example.ejercicio1.builders.BuilderBase;
import org.example.ejercicio1.builders.BuilderUnidadAdministrativa;
import org.example.ejercicio1.components.Ambulancia;
import org.example.ejercicio1.components.Bases;
import org.example.ejercicio1.components.Nombre;
import org.example.ejercicio1.components.TiempoMedio;

import java.util.ArrayList;

public class Director {

    public void constructBase(BuilderBase builderBase) {
        builderBase.setNombre(new Nombre(""));
        builderBase.setNAmbulancias(new Ambulancia(0));
        builderBase.setTiempoMedio(new TiempoMedio(10));
    }

    public void constructUnidadAdministrativa(BuilderUnidadAdministrativa builderUnidadAdministrativa) {
        builderUnidadAdministrativa.setBases(new Bases(new ArrayList<>()));
    }
}
