package ch01_java_building_blocks.day_six._02_understanding_an_array_List._01_using_an_arrayList._06_contains;

import java.util.ArrayList;
import java.util.List;

public class Contains {
    //boolean contains(Object object)
    public static void main (String[] args){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));  // Output: true
        System.out.println(birds.contains("robin")); // Output: false
    }
}
