package ch01_java_building_blocks.day_twelve._02_understanding_polymorphism._03_virtual_methods;

public class Bird {
    public String getName() {
        return "Unknown";
    }

    public void displayInformation() {
        System.out.println("The bird name is: " + getName());
    }
}
