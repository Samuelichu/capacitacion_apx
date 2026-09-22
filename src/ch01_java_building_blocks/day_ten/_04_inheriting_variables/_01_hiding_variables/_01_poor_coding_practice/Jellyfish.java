package ch01_java_building_blocks.day_ten._04_inheriting_variables._01_hiding_variables._01_poor_coding_practice;

public class Jellyfish extends Animal{
    public int length = 5;

    public static void main(String[] args) {
        Jellyfish jellyfish = new Jellyfish();
        Animal animal = new Jellyfish();

        System.out.println(jellyfish.length);
        System.out.println(animal.length);
    }
}
