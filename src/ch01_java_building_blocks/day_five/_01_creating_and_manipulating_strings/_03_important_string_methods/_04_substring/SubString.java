package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._04_substring;

public class SubString {

    /*
        String substring(int beginIndex)
        String substring(int beginIndex, int endIndex)
     */

    public static void main (String[] args){
        String string = "animals";

        System.out.println(string.substring(3)); // Output: mals
        System.out.println(string.substring(string.indexOf('m'))); // Output:mals
        System.out.println(string.substring(3, 4)); // Output: m
        System.out.println(string.substring(3, 7)); // Output: mals


        System.out.println(string.substring(3, 3)); // Output: string vacío
        System.out.println(string.substring(3, 2)); // lanza una excepción
        System.out.println(string.substring(3, 8)); // lanza una excepción
    }
}
