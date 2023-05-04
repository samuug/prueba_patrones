package org.example.ejercicio1.unidadAdministrativa;

import org.example.ejercicio1.base.Base;

import java.util.List;

public class UnidadAdministrativa {
    List<Base> bases;

    public UnidadAdministrativa(List<Base> bases){
        this.bases = bases;
    }

    public List<Base> getBases(){
        return bases;
    }

    @Override
    public String toString() {
        return "UnidadAdministrativa{" +
                "bases=" + bases +
                '}';
    }
}
