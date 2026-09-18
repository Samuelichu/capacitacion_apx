package ch01_java_building_blocks.day_three._01_understanding_java_operators._01_working_with_binary_arithmethic_operators._01_arithmetic_operators;

public class ArithmeticOperators {

    int x = 2 * 5 + 3 * 4 - 8;
    // x = 10 + 12 - 8;

    // parentheses
    int y = 2 * ((5 + 3) * 4 - 8);
    //int y = 2 * (8 * 4 - 8);
    //int y = 2 * (32 - 8)
    // int y = 2 * 24

    public static void main (String[] args){
        System.out.println(9 / 3); // Ouputs: 3
        System.out.println(9 % 3); // Ouputs: 0
        System.out.println( 10 / 3); // Ouputs: 3
        System.out.println(10 % 3); // Ouputs: 1
        System.out.println(11 / 3); // Ouputs: 3
        System.out.println(11 % 3); // Ouputs: 2
        System.out.println(12 / 3); // Ouputs: 4
        System.out.println(12 % 3); // Ouputs: 0
    }
}
