package ch01_java_building_blocks.day_three._01_understanding_java_operators._03_using_additional_binary_operators._03_compound_assignment_operators;

public class Operators {
    public static void main(String[] args){
        long x = 10;
        int y = 5;
        // y = y * x; NO COMPILA asignacion long -> int

        long x1 = 10;
        int y1 = 5;

        y1 *= x1; // lo mismo que aplicar y1 = (int) y1 * x1
        System.out.println(y1);

        long x2 = 5;
        long y2 = (x2=3);
        System.out.println(x2); // output: 3
        System.out.println(y2); // output: 3
    }
}
