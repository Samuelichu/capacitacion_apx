package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._06_equals_and_equalsignoreCase;

public class Equals {
    /*
        boolean equals(String str)
        boolean equalsIgnoreCase(String str)
     */

    public static void main (String[] args){
        System.out.println("abc".equals("ABC")); // Output: false
        System.out.println("ABC".equals("ABC")); // Output: true
        System.out.println("abc".equalsIgnoreCase("ABC")); // Output: true
    }
}
