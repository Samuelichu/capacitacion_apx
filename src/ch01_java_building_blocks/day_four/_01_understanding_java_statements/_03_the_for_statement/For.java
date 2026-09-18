package ch01_java_building_blocks.day_four._01_understanding_java_statements._03_the_for_statement;

public class For {
    /*
     * for(initialization; booleanExpression; updateStatement){
     *     body
     * }
     */

    public static void main (String[] args){
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        } // Output: 0 1 2 3 4 5 6 7 8 9

        // bucle infinito
        /*  for( ; ; ) {
         *       System.out.println("Hello World");
         *  }
         *
         */

        //Agregar más terminos a la instruccion
        int x1 = 0;

        for(long y = 0, z = 4; x1 < 5 && y < 10; x1++, y++) {
            System.out.print(y + " ");
        }

        System.out.print(x1); // Output: 0 1 2 3 4



        // Doble declaración
        int x2 = 0;

        /*  for(long y2 = 0, x2 = 4; x2 < 5 && y2 < 10; x2++, y2++) {
         *       System.out.print(x2 + " ");
         *  } No compila debido a que se inicializa antes y en el bucle for.
         */

        // Corregido con inicializacion de varibales
        int x3 = 0;
        long y3 = 10;

        for(y3 = 0, x3 = 4; x3 < 5 && y3 < 10; x3++, y3++) {
            System.out.print(x3 + " ");
        }



        // Tipos de datos no compatibles
        /*  for(long y4 = 0,int x4 = 4; x4 < 5 && y4 < 10; x4++, y4++) {
         *       System.out.print(x4 + " ");
         *  } No compila
         */

        //Usar variables del bucle, fuera del bloque
        for(long y4 = 0, x4 = 4; x4 < 5 && y4 < 10; x4++, y4++) {
            System.out.print(y4 + " ");
        }

        // System.out.print(x4); NO existe fuera del bucle for

    }

}
