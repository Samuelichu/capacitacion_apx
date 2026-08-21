package ch01_java_building_blocks.day_three._01_understanding_java_operators._03_using_additional_binary_operators._05_logical_operators;

public class Operators {
    public static void main (String[] args){
        int y;
        boolean x = true || (y < 4); // siempre true
        System.out.println(x);

       /* if(x != null && x.getValue() < 5) {
            Potege ante errores en caso x sea null
        }
        */

       /* if(x != null & x.getValue() < 5) { // Lanza una excepción si x es null
            Puede que se lance una excepcion
        }
        */

        int x1 = 6;
        boolean y1 = (x1 >= 6) || (++x1 <= 7);

        System.out.println(x1);
    }
}
