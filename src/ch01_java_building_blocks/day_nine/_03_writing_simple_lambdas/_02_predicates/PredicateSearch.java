package ch01_java_building_blocks.day_nine._03_writing_simple_lambdas._02_predicates;

import ch01_java_building_blocks.day_nine._03_writing_simple_lambdas.Animal;

import java.util.*;
import java.util.function.*;
public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        print(animals, a -> a.canHop());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) System.out.print(animal + " ");
        }
        System.out.println();
    }
}
