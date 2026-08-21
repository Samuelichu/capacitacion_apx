package ch01_java_building_blocks.day_three._01_understanding_java_operators._04_understanding_java_statements._01_the_if_then_statement;

public class Statement {
    /*
     * Structure
     * if (booleanExpresion) {
     *      // si es true la condicion se ejecuta esta seccion
     * }
     */

    public static void main(String[] args){
        int hourOfDay = 2;
        int morningGreetingCount = 4;

        if(hourOfDay < 11)
            System.out.println("Good Morning");

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }
    }
}
