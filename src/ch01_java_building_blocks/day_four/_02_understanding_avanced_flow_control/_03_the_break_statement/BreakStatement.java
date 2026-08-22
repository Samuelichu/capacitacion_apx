package ch01_java_building_blocks.day_four._02_understanding_avanced_flow_control._03_the_break_statement;

public class BreakStatement {
    /*
     * optionaLabel: while(booleanExpresion){
     *     body
     *     Somewhere in loop
     *     break optionaLabel;
     * }
     */
     public static void main (String[] args){
         int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
         int searchValue = 2;

         int positionX = -1;
         int positionY = -1;

         PARENT_LOOP: // sin la etiqueta saldria del for mas interno que existe más no del principal
         for(int i = 0; i < list.length; i++) {

             for(int j = 0; j < list[i].length; j++) {

                 if(list[i][j] == searchValue) {
                     positionX = i;
                     positionY = j;
                     break PARENT_LOOP;
                 }
             }
         }

         if(positionX == -1 || positionY == -1) {
             System.out.println("Value " + searchValue + " not found");
         } else {
             System.out.println("Value " + searchValue + " found at: " +
                     "(" + positionX + "," + positionY + ")");
         }
     }

}
