package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.swan;

import ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();

        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();

       /*
            El error se debe a que el objeto creado es de tipo Bird y se rompen las reglas del protected
           other.floatInWater();
           System.out.println(other.text);
       */

    }
}
