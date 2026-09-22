package ch01_java_building_blocks.day_six._02_understanding_an_array_List._04_converting_between_array_and_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converting {
    public static void main (String[] args){
         // ArrayList -> List
         List<String> list = new ArrayList<>();
         list.add("hawk");
         list.add("robin");
         Object[] objectArray = list.toArray();
         System.out.println(objectArray.length); // Output: 2
         String[] stringArray = list.toArray(new String[0]);
         System.out.println(stringArray.length); // Output: 2

        // Array -> List
         String[] array = { "hawk", "robin" };
         List<String> lista = Arrays.asList(array);
         System.out.println(lista.size()); // Output: 2
         lista.set(1, "test");
         array[0] = "new";
         for (String b : array) System.out.print(b + " "); // new test
         lista.remove(1); // Error: UnsupportedOperationException
    }
}
