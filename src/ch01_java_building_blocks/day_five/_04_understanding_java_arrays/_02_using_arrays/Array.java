package ch01_java_building_blocks.day_five._04_understanding_java_arrays._02_using_arrays;

public class Array {
    public static void main (String[] args){
         String[] mammals = {"monkey", "chimp", "donkey"};
         System.out.println(mammals.length); // Output: 3
         System.out.println(mammals[0]);     // Output: monkey
         System.out.println(mammals[1]);     // Output: chimp
         System.out.println(mammals[2]);     // Output: donkey


        // length
        String[] birds = new String[6];
        System.out.println(birds.length);// Output: 6 , a pesar de que son valores nulos

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
                 numbers[i] = i + 5;
        numbers[10] = 3; // provoca error
        numbers[numbers.length] = 5; // provoca error
        for (int i = 0; i <= numbers.length; i++)
            numbers[i] = i + 5;
    }
}
