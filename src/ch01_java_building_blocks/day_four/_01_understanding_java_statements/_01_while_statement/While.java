package ch01_java_building_blocks.day_four._01_understanding_java_statements._01_while_statement;

public class While {
    /*
      * while(booleanExpresion) {
      *     body
      * }
    */

    int roomInBelly = 5;

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public void loop (){
        int x = 2;
        int y = 5;

        while(x < 10)
            System.out.println(y++);
    }

    public static void main (String[] args){
        While w = new While();
        w.eatCheese(10);
        w.loop();
    }
}
