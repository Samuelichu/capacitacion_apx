package ch01_java_building_blocks.day_twelve._04_polymorphism_and_method_overriding;

public class ZooKeeper {
    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
    }
}
