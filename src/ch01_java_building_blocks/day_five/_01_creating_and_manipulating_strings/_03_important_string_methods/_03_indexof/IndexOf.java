package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._03_important_string_methods._03_indexof;

public class IndexOf {
    /*
        int indexOf(char ch)
        int indexOf(char ch, int fromIndex)
        int indexOf(String str)
        int indexOf(String str, int fromIndex)
     */
    public static void main (String[] args){
        String string = "animals";

        System.out.println(string.indexOf('a')); // Output: 0
        System.out.println(string.indexOf("al")); // Output: 4
        System.out.println(string.indexOf('a', 4)); // Output: 4
        System.out.println(string.indexOf("al", 5)); // Output: -1
    }
}
