package ch01_java_building_blocks.day_four._01_understanding_java_statements._02_do_while_statement;

import ch01_java_building_blocks.day_four._01_understanding_java_statements._01_while_statement.While;

public class DoWhile {
    /*
     * do {
     *     body
     * } while(booleanExpresion);
     */
    public static void main (String[] args){
        int x = 0;
        do {
            x++;
        } while(false);

        System.out.println(x); // Output: 1

        // ambos cumplen la misma funcion
        while(x > 10) {
            x--;
        }

        if(x > 10) {
            do {
                x--;
            } while(x > 10);
        }

        // Podemos aprovechar la segunda estructura según se requiera
        if(x > 10) {
            do {
                x--;
            } while(x > 10);
        } else {
            x++;
            System.out.println(x);
        }
    }

}
