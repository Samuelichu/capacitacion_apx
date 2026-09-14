package ch01_java_building_blocks.day_two._05_destroying_objects._01_garbage_collection;

public class Scope {
    public static void main(String[] args){
        String one, two;
        one = new String("a");
        two = new String ("b");
        one = two;
        String three = one;
        one = null;
    }
}
