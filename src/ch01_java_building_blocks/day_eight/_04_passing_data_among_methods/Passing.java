package ch01_java_building_blocks.day_eight._04_passing_data_among_methods;

public class Passing {
    public static void main(String[] args) {
        int num = 4;
        newNumber(5);
        System.out.println(num); // 4
    }

    public static void newNumber(int num) {
        num = 8;
    }
}
