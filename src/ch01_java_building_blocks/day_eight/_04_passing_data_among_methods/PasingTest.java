package ch01_java_building_blocks.day_eight._04_passing_data_among_methods;

public class PasingTest {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name);
    }

    public static void speak(String name) {
        name = "Sparky";
    }
}
