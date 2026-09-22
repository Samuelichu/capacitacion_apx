package ch01_java_building_blocks.day_five._04_understanding_java_arrays._01_creating_an_array_with_reference_variables;

public class ArrayType {
    public static void main(String args[]) {
        String[] bugs = { "cricket", "beetle", "ladybug" };
        String[] alias = bugs;

        System.out.println(bugs.equals(alias)); // Output: true
        System.out.println(bugs.toString());    // [Ljava.lang.String;@160bc7c0


        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); Sigue siendo un String [] No compila
        objects[0] = new StringBuilder();

    }
}

class Names {
    String names[]; // null
}

class NamesArray {
    String names[] = new String[2];// Array con dos espacios vacios "nulos"
}
