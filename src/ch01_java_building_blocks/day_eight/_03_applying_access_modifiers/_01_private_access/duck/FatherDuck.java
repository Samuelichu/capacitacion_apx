package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._01_private_access.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise);
    }

    private void makeNoise() {
        quack();
    }
}
