package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._10_static_imports;

import java.util.Arrays;
import java.util.List;

/*
    import java.util.ArrayList;
    import java.util.*;
 */
public class Static {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two"); // Sin importar asList
    }
}
