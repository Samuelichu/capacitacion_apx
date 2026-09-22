package ch01_java_building_blocks.day_twelve._02_understanding_polymorphism._03_virtual_methods;

public class Peacock extends Bird{
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
    }
}
