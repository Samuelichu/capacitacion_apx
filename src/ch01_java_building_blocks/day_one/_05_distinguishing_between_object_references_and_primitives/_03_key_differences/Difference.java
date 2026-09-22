package ch01_java_building_blocks.day_one._05_distinguishing_between_object_references_and_primitives._03_key_differences;

public class Difference {
    String reference = "hello";
    //int value = null; los datos primitivos no pueden ser nulos
    String s = null;
    int len = reference.length();
    //int bad = len.length(); len es un dato primitivo
}
