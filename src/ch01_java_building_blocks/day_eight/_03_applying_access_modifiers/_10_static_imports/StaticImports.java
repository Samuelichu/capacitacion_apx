package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._10_static_imports;

import java.util.List;
import static java.util.Arrays.asList; // importacion static

public class StaticImports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // ya no necesitamos Arrays
    }
}
