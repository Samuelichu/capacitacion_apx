package ch01_java_building_blocks.day_five._04_understanding_java_arrays._03_sorting;

import java.util.Arrays;

public class Sorting {
    /*
        Imports a usar con Arrays
        import java.util.*;
        import java.util.Arrays;
     */
    public static void main (String[] args){
        int[] numbers = { 6, 9, 1 };

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " "); // Output: 1, 6, 9

        // El orden es de manera alfabetica
        String[] strings = { "10", "9", "100" };

        Arrays.sort(strings);

        for (String string : strings)
            System.out.print(string + " ");
    }
}
