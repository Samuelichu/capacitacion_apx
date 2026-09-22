package ch01_java_building_blocks.day_three._01_understanding_java_operators._02_working_with_unary_operators._02_increment_and_decrement_operators;

public class Operators {
    public static void main (String[] args){
       int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is "+ x);
        System.out.println("y is "+ y);

        /* int y = 4 * 5 / x-- + --x;
         *  int y = 4 * 5 / 4 + --x;
         *  int y = 4 * 5 / 4 + 2;
         *  x = 2 , y = 7
         */

    }
}
