package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._07_starts_with_and_ends_with;

public class StarsEnds {
    /*
        boolean startsWith(String prefix)
        boolean endsWith(String suffix)
     */
    public static void main (String[] args){
        System.out.println("abc".startsWith("a")); // Output: true
        System.out.println("abc".startsWith("A")); // Output: false
        System.out.println("abc".endsWith("c")); // Output: true
        System.out.println("abc".endsWith("a")); // Output: false
    }
}
