package ch01_java_building_blocks.day_eleven._02_implementing_interfaces._04_abstract_methods_and_multiple_inheritance._01_same_method;

public class Bear implements Herbivore, Omnivore {
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
