package ch01_java_building_blocks.day_ten._03_inheriting_methods._01_overriding_a_method._03_example;

public class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
        return 2;
    }
}
