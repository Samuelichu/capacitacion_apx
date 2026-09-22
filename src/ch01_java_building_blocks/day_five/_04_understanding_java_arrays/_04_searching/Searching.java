package ch01_java_building_blocks.day_five._04_understanding_java_arrays._04_searching;

import java.util.Arrays;

public class Searching {
    public static void main (String[] args){
        int[] numbers = {2,4,6,8};

        System.out.println(Arrays.binarySearch(numbers, 2)); // Output: 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // Output: 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // Output: -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // Output: -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // Output: -5


        // Arreglo desordenado:
        int[] numbers2 = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers2, 2));
        System.out.println(Arrays.binarySearch(numbers2, 3));
    }
}
