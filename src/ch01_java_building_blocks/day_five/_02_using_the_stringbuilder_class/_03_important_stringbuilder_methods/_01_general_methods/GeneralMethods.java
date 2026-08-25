package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class._03_important_stringbuilder_methods._01_general_methods;

public class GeneralMethods {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder("animals");

        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);

        System.out.println(sub + " " + len + " " + ch);
    }
}
