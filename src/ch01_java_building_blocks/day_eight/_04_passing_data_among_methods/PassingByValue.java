package ch01_java_building_blocks.day_eight._04_passing_data_among_methods;

public class PassingByValue {
    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;

        swap(original1, original2);

        System.out.println(original1); // 1
        System.out.println(original2); // 2
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
