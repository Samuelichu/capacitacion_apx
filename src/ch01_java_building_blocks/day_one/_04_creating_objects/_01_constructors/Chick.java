package ch01_java_building_blocks.day_one._04_creating_objects._01_constructors;

import java.util.Random;

public class Chick {
    Random r = new Random();
    int numEggs = 0; // inicializar en linea
    String name;

    public Chick(){
        name = "Duke";// inicializar en constructor
        System.out.println("in constructor");
    }

    //public void Chick(){} No es constructor
}
