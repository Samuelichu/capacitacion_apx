package ch01_java_building_blocks.day_six._02_understanding_an_array_List._03_autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {


    public static void main (String[] args){
        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // [50.5]
        weights.add(new Double(60)); // [50.5, 60.0]
        weights.remove(50.5); // [60.0]
        double first = weights.get(0); // 60.0


        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0); // Error NullPointerException


        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);

        System.out.println(numbers);
    }
}
