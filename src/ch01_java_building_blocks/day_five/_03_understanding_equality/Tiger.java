package ch01_java_building_blocks.day_five._03_understanding_equality;

public class Tiger {
    String name;
    public static void main (String[] args){
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;

        System.out.println(t1 == t1);     // Output: true
        System.out.println(t1 == t2);     // Output: false
        System.out.println(t1.equals(t2)); // Output: false
    }
}
