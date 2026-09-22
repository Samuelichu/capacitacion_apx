package ch01_java_building_blocks.day_six._02_understanding_an_array_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /*
     *  imports necesarios:
     *  import java.util.*; importa todo el paquete, incluyendo ArrayList
     *  import java.util.ArrayList; importa solamente ArrayList
     */

    ArrayList list1 = new ArrayList();

    ArrayList list2 = new ArrayList(10);

    ArrayList list3 = new ArrayList(list2);

    // Nueva Estructura Java 5
    ArrayList <String> list4 = new ArrayList<>();
    ArrayList<String> list5 = new ArrayList<>();

    List<String> list6 = new ArrayList<>();
    // ArrayList<String> list7 = new List<>();

}
