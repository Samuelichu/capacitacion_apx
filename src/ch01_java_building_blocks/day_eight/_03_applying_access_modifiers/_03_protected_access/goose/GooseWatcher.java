package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._03_protected_access.goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        /*
            El hecho de que goose herede de Bird no significa que las clases que llaman a Goose
            puedan llamar a los metodos de Bird
            goose.floatInWater();
         */
    }
}
