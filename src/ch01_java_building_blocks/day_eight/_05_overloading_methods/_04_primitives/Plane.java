package ch01_java_building_blocks.day_eight._05_overloading_methods._04_primitives;

public class Plane {
    public void fly(int i) {
        System.out.print("int ");
    } // si lo comentamos se considera le segundo metodo

    public void fly(long l) {
        System.out.print("long ");
    }

    public static void main(String[] args) {
        Plane p = new Plane();

        p.fly(123);
        p.fly(123L);
    }
}
