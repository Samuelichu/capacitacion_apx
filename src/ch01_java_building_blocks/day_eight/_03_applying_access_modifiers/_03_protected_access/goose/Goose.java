package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.goose;

import ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
       /*
           Se incumplen todas las reglas como para trabajar con protected
            Bird other = new Goose();
            other.floatInWater();
            System.out.println(other.text);
        */
    }
}
