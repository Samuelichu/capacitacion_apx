package ch01_java_building_blocks.day_ten._01_introducing_class_inheritance._04_defining_constructors;

public class Zebra extends Animal{
        public Zebra(int age) {
            super(age);
        }

        public Zebra() {
            this(4);
        }
}
