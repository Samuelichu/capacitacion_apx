package ch01_java_building_blocks.day_four._02_understanding_avanced_flow_control._04_tthe_cotinue_statement;

public class ContinueStatement {
    /*
     * optionaLabel: while(booleanExpresion){
     *     body
     *     Somewhere in loop
     *     continue optionaLabel;
     * }
     */

    public static void main (String[] args){
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                    // la salida puede variar si es que quitamos el continue o el label existente
                System.out.print(" " + a + x);
            }
        }
    }
}
