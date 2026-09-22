package ch01_java_building_blocks.day_nine._03_writing_simple_lambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        print(animals, new CheckIfHopper());

        // print(animals, a -> a.canHop());
        // Animales que no pueden nadar: print(animals, a -> ! a.canSwim());
        // Animales que pueden nadar: print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) System.out.print(animal + " ");
        }
        System.out.println();
    }
}
