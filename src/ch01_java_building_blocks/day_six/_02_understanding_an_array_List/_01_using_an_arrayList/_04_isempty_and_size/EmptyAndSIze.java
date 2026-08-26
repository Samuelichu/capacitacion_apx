package ch01_java_building_blocks.day_six._02_understanding_an_array_List._01_using_an_arrayList._04_isempty_and_size;

import java.util.ArrayList;
import java.util.List;

public class EmptyAndSIze {
    //boolean isEmpty()
    //int size()
    public static void main (String[] args){
        List<String> birds = new ArrayList<>();

        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size());    // 0

        birds.add("hawk");
        birds.add("hawk");

        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size());    // 2
    }
}
