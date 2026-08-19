package ch01_java_building_blocks.day_one._04_creating_objects._04_order_of_initialization;

public class Egg {
    public Egg(){
        number = 5;
    }
    public static void main (String[] args){
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3;
    {number = 4;}

    //output: 5
}
