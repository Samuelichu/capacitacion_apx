package ch01_java_building_blocks.day_one._05_distinguishing_between_object_references_and_primitives._02_reference_types;

public class References {
    java.util.Date today;
    String greeting;

    public static void main (String[] args) {
        References r = new References();
        r.today = new java.util.Date();
        r.greeting = "How are you?";
    }
}
