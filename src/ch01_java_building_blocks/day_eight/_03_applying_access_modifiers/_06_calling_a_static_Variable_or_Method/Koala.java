package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._06_calling_a_static_Variable_or_Method;

public class Koala {
    public static int count = 0; // variable static

    public static void main(String[] args) { // método static
        System.out.println(count);
    }
}
