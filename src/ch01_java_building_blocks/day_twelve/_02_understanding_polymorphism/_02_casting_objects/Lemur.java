package ch01_java_building_blocks.day_twelve._02_understanding_polymorphism._02_casting_objects;

import ch01_java_building_blocks.day_twelve._02_understanding_polymorphism.Primate;

public class Lemur extends Primate {
    int age = 10;

    public static void main (String[] args){
        Lemur lemur = new Lemur();
        Primate primate = lemur;
       /*
        Lemur lemur2 = primate;
        */

        Lemur lemur3 = (Lemur) primate;
        System.out.println(lemur3.age);
    }
}
