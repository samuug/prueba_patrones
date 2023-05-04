package org.example.ejercicio1;

import org.example.ejercicio1.base.Base;
import org.example.ejercicio1.builders.BaseBuilder;
import org.example.ejercicio1.builders.UnidadAdministrativaBuilder;
import org.example.ejercicio1.director.Director;
import org.example.ejercicio1.unidadAdministrativa.UnidadAdministrativa;

public class Application {
    public static void app(){
        Director director = new Director();

        BaseBuilder baseBuilder = new BaseBuilder();
        director.constructBase(baseBuilder);
        Base base = baseBuilder.getBase();
        System.out.println(base);

        UnidadAdministrativaBuilder unidadAdministrativaBuilder = new UnidadAdministrativaBuilder();
        director.constructUnidadAdministrativa(unidadAdministrativaBuilder);
        UnidadAdministrativa unidadAdministrativa = unidadAdministrativaBuilder.getUnidadAdministrativa();
        System.out.println(unidadAdministrativa);
    }
}
