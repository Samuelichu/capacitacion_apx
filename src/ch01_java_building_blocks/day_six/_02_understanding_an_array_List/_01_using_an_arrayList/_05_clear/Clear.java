package ch01_java_building_blocks.day_six._02_understanding_an_array_List._01_using_an_arrayList._05_clear;

import java.util.ArrayList;
import java.util.List;

public class Clear {
    //void clear()
    public static void main (String[] args){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
        birds.clear(); // ArrayList size = 0
        System.out.println(birds.isEmpty()); // Output: true
        System.out.println(birds.size()); // Output: 0
    }
}
