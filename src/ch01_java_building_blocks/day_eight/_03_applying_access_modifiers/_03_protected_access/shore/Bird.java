package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.shore;

public class Bird {
    protected String text = "floating";

    protected void floatInWater() {
        System.out.println(text);
    }
}
