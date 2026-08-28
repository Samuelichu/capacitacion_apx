package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._02_default_access.duck;

public class MotherDuck {
    String noise = "quack";

    void quack() {
        System.out.println(noise);
    }

    private void makeNoise() {
        quack();
    }
}
