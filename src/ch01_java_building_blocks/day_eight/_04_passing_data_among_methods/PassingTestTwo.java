package ch01_java_building_blocks.day_eight._04_passing_data_among_methods;

public class PassingTestTwo {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name); // Output: Webby
    }

    public static void speak(StringBuilder s) {
        s.append("Webby");
    }
}
