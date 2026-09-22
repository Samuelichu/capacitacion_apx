package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.shore;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();

        bird.floatInWater();
        System.out.println(bird.text);
    }
}
