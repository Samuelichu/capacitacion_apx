package ch01_java_building_blocks.day_three._01_understanding_java_operators._04_understanding_java_statements._02_the_if_then_else_statement._01_ternary_operator;

public class Operators {
    public static void main(String[] args){
        int y = 10;
        final int x;

        if(y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }

        // Es lo mismo que trabajar con
        int y1 = 10;
        int x1 = (y1 > 5) ? (2 * y1) : (3 * y1);

        System.out.println((y > 5) ? 21 : "Zebra");

       // int animal = (y < 91) ? 9 : "Horse"; No compila debido al tipo de dato

        int y2 = 1;
        int z2 = 1;

        final int x2 = y2 < 10 ? y2++ : z2++;

        System.out.println(y2 + "," + z2); // Output: 2,1


        int y3 = 1;
        int z3 = 1;

        final int x3 = y3 >= 10 ? y3++ : z3++;

        System.out.println(y3 + "," + z3); // Output 1,2
    }
}
