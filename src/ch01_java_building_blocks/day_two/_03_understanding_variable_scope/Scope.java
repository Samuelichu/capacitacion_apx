package ch01_java_building_blocks.day_two._03_understanding_variable_scope;

public class Scope {
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    } // 2 variables locales

    public void eatIfHungry(boolean hungry){
        if (hungry) {
            int bitesOfCheese = 1;
        } // limite de scope para bitesOfCheese
        // System.out.println(bitesOfCheese); Error: Cannot resolve symbol 'bitesOfCheese'
    }

    public void eatIfHungryTwo(boolean hungry){
        if (hungry){
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        // System.out.println(teenyBit); Cannot resolve symbol 'teenyBit'
    }

    public void eatMore(boolean hungry, int amountOfFood){
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0){
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }// fin de scope amountEaten
        } //fin de scope TimeToEat
        System.out.println(amountOfFood);
    }// fin de scope hungry, amountOfFood, roomInBelly
}
