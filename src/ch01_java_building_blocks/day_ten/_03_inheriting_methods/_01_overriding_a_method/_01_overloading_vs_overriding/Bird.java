package ch01_java_building_blocks.day_ten._03_inheriting_methods._01_overriding_a_method._01_overloading_vs_overriding;

public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}
