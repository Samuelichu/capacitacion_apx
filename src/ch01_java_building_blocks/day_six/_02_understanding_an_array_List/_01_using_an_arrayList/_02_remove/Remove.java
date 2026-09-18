package ch01_java_building_blocks.day_six._02_understanding_an_array_List._01_using_an_arrayList._02_remove;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    //boolean remove(Object object)
    //E remove(int index)

    public static void main (String[] args){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal")); // Output: false
        System.out.println(birds.remove("hawk")); // Output: true
        System.out.println(birds.remove(0));
        System.out.println(birds);

        birds.remove(100); // java.lang.IndexOutOfBoundsException
    }
}
