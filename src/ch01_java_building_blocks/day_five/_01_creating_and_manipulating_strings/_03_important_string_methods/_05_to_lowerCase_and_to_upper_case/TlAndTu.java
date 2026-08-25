package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._05_to_lowerCase_and_to_upper_case;

public class TlAndTu {
    /*
        String toLowerCase(String str)
        String toUpperCase(String str)
     */
    public static void main (String[] args){
        String string = "animals";

        System.out.println(string.toUpperCase()); // Output: ANIMALS
        System.out.println("Abc123".toLowerCase()); // Output: abc123
    }
}
