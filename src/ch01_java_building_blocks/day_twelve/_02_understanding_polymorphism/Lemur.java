package ch01_java_building_blocks.day_twelve._02_understanding_polymorphism;

public class Lemur extends Primate implements HasTail{
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age); // Output: 10
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped()); // Output: false
        Primate primate = lemur;
        System.out.println(primate.hasHair()); // Output: true


        /*
        Esto no funcionaria debido a que ambos solo con sus metodos definidos respectivamente
        en la interfaz y en la clase.
            System.out.println(hasTail.age);
            System.out.println(primate.isTailStriped());
         */


    }
}
