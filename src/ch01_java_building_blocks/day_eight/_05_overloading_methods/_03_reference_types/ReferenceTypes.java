package ch01_java_building_blocks.day_eight._05_overloading_methods._03_reference_types;

public class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }

    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();

        r.fly("test"); // Utiliza String
        r.fly(56); // Utiliza Object
    }
}
