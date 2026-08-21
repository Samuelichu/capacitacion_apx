package ch01_java_building_blocks.day_three._01_understanding_java_operators._03_using_additional_binary_operators._06_equality_operators;

import java.io.File;

public class Operators {

    public static void main (String[] args){
        /* No compila al comparar diferentes tipos de datos
         *   boolean x = true == 3;
         *  boolean y = false != "Giraffe";
         *  boolean z = 3 == "Kangaroo";
         */

        boolean y = false;
        boolean x = (y = true);
        System.out.println(x); // Output: true

        File x1 = new File("myFile.txt");
        File y1 = new File("myFile.txt");
        File z1 = x1;

        System.out.println(x1 == y1); // Output: false
        System.out.println(x1 == z1); // Output: true
    }

}
