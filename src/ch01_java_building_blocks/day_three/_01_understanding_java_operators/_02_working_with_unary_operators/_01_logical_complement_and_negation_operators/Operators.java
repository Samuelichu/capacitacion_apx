package ch01_java_building_blocks.day_three._01_understanding_java_operators._02_working_with_unary_operators._01_logical_complement_and_negation_operators;

public class Operators {
    public static void main (String[] args){
        boolean x = false;
        System.out.println(x); // false
        x=!x;
        System.out.println(x); // true


        double y = 1.21;
        System.out.println(y);// 1.21
        y=-y;
        System.out.println(y);// - 1.21
        y=-y;
        System.out.println(y);// 1.21

        // int x = !5; NO COMPILA
        // boolean y = -true; NO COMPILA
        // boolean z = !0; NO COMPILA
    }
}
