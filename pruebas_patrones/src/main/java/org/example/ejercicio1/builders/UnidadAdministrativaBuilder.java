package org.example.ejercicio1.builders;

import org.example.ejercicio1.base.Base;
import org.example.ejercicio1.components.Bases;
import org.example.ejercicio1.unidadAdministrativa.UnidadAdministrativa;

import java.util.ArrayList;
import java.util.List;

public class UnidadAdministrativaBuilder implements BuilderUnidadAdministrativa{

    private Bases bases;

    @Override
    public void setBases(Bases bases) {
        this.bases = bases;
    }

    public UnidadAdministrativa getUnidadAdministrativa(){
        return new UnidadAdministrativa(new ArrayList<>());
    }
}
