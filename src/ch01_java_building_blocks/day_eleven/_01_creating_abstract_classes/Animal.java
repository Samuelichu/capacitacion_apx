package ch01_java_building_blocks.day_eleven._01_creating_abstract_classes;

public abstract class Animal {
    protected int age;

    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}
