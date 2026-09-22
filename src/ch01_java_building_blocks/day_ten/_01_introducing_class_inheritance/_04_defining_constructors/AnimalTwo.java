package ch01_java_building_blocks.day_ten._01_introducing_class_inheritance._04_defining_constructors;

public class AnimalTwo {
    private int age;
    private String name;

    public AnimalTwo(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public AnimalTwo(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}
