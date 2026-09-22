package ch01_java_building_blocks.day_six._02_understanding_an_array_List._01_using_an_arrayList._03_set;

import java.util.ArrayList;
import java.util.List;

public class Set {
    //E set(int index, E newElement)

    public static void main (String[] args){
         List<String> birds = new ArrayList<>();
         birds.add("hawk");
         System.out.println(birds.size()); // Output: 1
         birds.set(0, "robin");
         System.out.println(birds.size()); // Output: 1
         birds.set(1, "robin"); // error de tipo IndexOutOfBoundsException
    }
}
