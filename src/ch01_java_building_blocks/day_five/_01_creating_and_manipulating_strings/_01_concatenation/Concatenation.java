package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._01_concatenation;

public class Concatenation {
    public void console (){
        System.out.println(1 + 2);        // Output: 3
        System.out.println("a" + "b");    // Output: ab
        System.out.println("a" + "b" + 3); // Output: ab3
        System.out.println(1 + 2 + "c");  // Output: 3c
    }

    public void examExample () {
        int three = 3;
        String four = "4";
        System.out.println("EXAM EXAMPLE: ");
        System.out.println(1 + 2 + three + four);
    }

    public void example(){
        String s = "1"; // Output: "1"
        s+="2"; // Output: "2"
        s +=3; // Output: 123
        System.out.println(s); // Output: 123

    }
    public static void main (String[] args){
        Concatenation c = new Concatenation();
        c.console();
        c.examExample();
    }
}
