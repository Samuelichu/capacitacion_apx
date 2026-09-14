package ch01_java_building_blocks.day_twelve._03_polymorphic_parameters;

public class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile " + reptile.getName());
    }

    public static void main(String[] args){
        feed(new Alligator()); // Output: Feeding: Alligator
        feed(new Crocodile()); // Output: Feeding: Crocodile
        feed(new Reptile()); // Output: Feeding: Reptile
    }
}
