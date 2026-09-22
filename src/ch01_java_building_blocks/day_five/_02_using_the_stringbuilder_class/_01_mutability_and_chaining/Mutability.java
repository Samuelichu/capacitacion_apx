package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class._01_mutability_and_chaining;

public class Mutability {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"


        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a); // Output: abcdefg
        System.out.println("b=" + b); // Output: abcdefg
    }
}
