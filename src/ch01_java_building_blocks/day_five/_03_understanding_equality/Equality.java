package ch01_java_building_blocks.day_five._03_understanding_equality;

public class Equality {
    public static void main (String... args){
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");

        System.out.println(one == two);   // Output: false
        System.out.println(one == three); // Output: true



        String x = "Hello World";
        String y = "Hello World";

        System.out.println(x == y); // Output: true



        String x2 = "Hello World";
        String z = " Hello World".trim(); // ya no apuntan a la misma referencia

        System.out.println(x2 == z); // Output: false



        String x3 = new String("Hello World");
        String y3 = "Hello World";

        System.out.println(x == y3); // Output: false


        String x4 = "Hello World";
        String z4 = " Hello World".trim();

        System.out.println(x.equals(z4)); // Output: true
    }
}
