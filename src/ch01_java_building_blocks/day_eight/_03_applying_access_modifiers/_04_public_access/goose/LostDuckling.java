package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._04_public_access.goose;

import ch01_java_building_blocks.day_eight._03_applying_access_modifiers._04_public_access.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();

        teacher.swim();
        System.out.println("Thanks" + teacher.name);
    }

}
