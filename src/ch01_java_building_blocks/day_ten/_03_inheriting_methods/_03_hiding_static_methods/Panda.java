package ch01_java_building_blocks.day_ten._03_inheriting_methods._03_hiding_static_methods;

public class Panda extends Bear{
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    public static void main(String[] args) {
        Panda.eat();
    }
}
