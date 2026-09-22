package ch01_java_building_blocks.day_nine._03_writing_simple_lambdas._02_predicates;

import java.util.ArrayList;
import java.util.List;

public class Bunny {
    public static void main (String[] args){
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // Output: [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies); // Output: [hoppy]
    }

}
