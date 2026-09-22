package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._08_contains;

public class Contains {
    /*
        boolean contains(String str)
    */

    public static void main (String[] args){
        System.out.println("abc".contains("b")); // Output: true
        System.out.println("abc".contains("B")); // Output: false
    }
}
