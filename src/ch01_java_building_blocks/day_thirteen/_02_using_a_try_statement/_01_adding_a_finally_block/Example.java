package ch01_java_building_blocks.day_thirteen._02_using_a_try_statement._01_adding_a_finally_block;

public class Example {
    public static void main (String[] args) {
        String s = "";

        try {
            s += "t";
        } catch(Exception e) {
            s += "c";
        } finally {
            s += "f";
        }

        s += "a";

        System.out.print(s); // Output: tfa
    }
}
