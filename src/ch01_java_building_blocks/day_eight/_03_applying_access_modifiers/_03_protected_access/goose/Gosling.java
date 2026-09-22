package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.goose;

import ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.shore.Bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }
}
