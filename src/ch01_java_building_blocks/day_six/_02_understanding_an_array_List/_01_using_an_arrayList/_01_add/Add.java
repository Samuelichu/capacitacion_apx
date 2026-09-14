package ch01_java_building_blocks.day_six._02_understanding_an_array_List._01_using_an_arrayList._01_add;

import java.util.ArrayList;
import java.util.List;

public class Add {

    //boolean add(E element)
    //void add(int index, E element)
    public static void main (String[] args){
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list); // Output: [hawk, true]

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE);  debido al tipo definido para le arreglo genérico NO COMPILA

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        System.out.println(birds); // Output: [blue jay, cardinal, hawk, robin]
    }
}
