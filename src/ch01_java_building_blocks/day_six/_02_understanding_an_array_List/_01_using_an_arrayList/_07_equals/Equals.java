package ch01_java_building_blocks.day_six._02_understanding_an_array_List._01_using_an_arrayList._07_equals;

import java.util.ArrayList;
import java.util.List;

public class Equals {
    //boolean contains(Object object)
    public static void main (String[] args){
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // Output: true
        one.add("a");
        System.out.println(one.equals(two)); // Output: false
        two.add("a");
        System.out.println(one.equals(two)); // Output: true
        one.add("b");
        two.add(0, "b");
        System.out.println(one.equals(two)); // Output: false
    }
}
