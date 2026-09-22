package ch01_java_building_blocks.day_three._01_understanding_java_operators._04_understanding_java_statements._02_the_if_then_else_statement;

public class Statement {
    /*
     * Structure
     * if (booleanExpresion) {
     *      // si es true la condicion se ejecuta esta seccion
     * } else {
     *   // si es true la condicion se ejecuta esta seccion
     * }
     */

    public static void main(String[] args){
        int hourOfDay = 2;
        int morningGreetingCount = 4;

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        // El primer if interfiere con la ejecucion del segundo condicional, al ser un condicional excluyente
        if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if(hourOfDay < 11) {
            System.out.println("Good Morning"); // CÓDIGO INALCANZABLE
        } else {
            System.out.println("Good Evening");
        }

       /*
        * No compila debido a que 1 no es considerado como valor booleano
        * int x = 1;
        * if(x) {
        *     ...
        * }
       */


        /*
         * No compila debido al operador de asignacion
         * int x = 1;
         * if(x = 5) {
         *     ...
         * }
        */
    }
}
