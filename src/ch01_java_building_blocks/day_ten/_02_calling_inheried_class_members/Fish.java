package ch01_java_building_blocks.day_ten._02_calling_inheried_class_members;

public class Fish {
    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
