package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._02_default_access.swan;


import ch01_java_building_blocks.day_eight._03_applying_access_modifiers._02_default_access.duck.MotherDuck;

;
public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        /*
            Debido al acceso por default no podemos acceder a estos metodos ni a variables declaradas
            duck.quack();
            System.out.println(duck.noise);
         */
    }
}
