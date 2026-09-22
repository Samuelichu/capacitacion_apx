package ch01_java_building_blocks.day_twelve._02_understanding_polymorphism._01_object_vs_reference;

import ch01_java_building_blocks.day_twelve._02_understanding_polymorphism.Primate;

public class Lemur extends Primate {
    Lemur lemur = new Lemur();
    Object LemurAsObject = lemur;
    //No podemos acceder a las caracteristicas de un lemur
    // esto lo solucionamos mediante un cast
}
