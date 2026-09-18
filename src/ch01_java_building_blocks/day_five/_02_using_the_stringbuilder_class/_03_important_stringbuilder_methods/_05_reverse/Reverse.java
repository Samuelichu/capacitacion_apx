package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class._03_important_stringbuilder_methods._05_reverse;

public class Reverse {
    /*
        StringBuilder reverse()
    */
    public void reverseMethod(){
        StringBuilder sb = new StringBuilder("ABC");

        sb.reverse();

        System.out.println(sb);
    }
}
