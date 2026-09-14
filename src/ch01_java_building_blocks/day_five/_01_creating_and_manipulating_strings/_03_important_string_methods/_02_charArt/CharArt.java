package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._02_charArt;

public class CharArt {

    // char charAt(int index)

    public static void main (String[] args){
        String string = "animals";

        System.out.println(string.charAt(0)); // Output: a
        System.out.println(string.charAt(6)); // Output: s
        System.out.println(string.charAt(7)); // lanza una excepción
        /*
           Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
            at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            at java.base/java.lang.String.charAt(String.java:1519)
            at ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._02_charArt.CharArt.main(CharArt.java:12)
         */
    }
}
