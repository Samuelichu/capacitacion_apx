package ch01_java_building_blocks.day_ten._03_inheriting_methods._01_overriding_a_method._03_example;

public class Snake extends Reptile {
    protected boolean hasLegs() {
        return false;
    }

    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
}
