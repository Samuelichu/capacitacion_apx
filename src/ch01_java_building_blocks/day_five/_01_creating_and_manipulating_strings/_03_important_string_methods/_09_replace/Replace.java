package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._09_replace;

public class Replace {
    /*
        String replace(char oldChar, char newChar)
        String replace(CharSequence oldChar, CharSequence newChar)
     */

    public static void main (String[] args){
        System.out.println("abcabc".replace('a', 'A')); // Output: AbcAbc
        System.out.println("abcabc".replace("a", "A")); // Output: AbcAbc
    }
}
