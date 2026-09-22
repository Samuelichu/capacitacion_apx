package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._07_static_vs_instance;

public class Counter {
    private static int count;
    public Counter() { count++; }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // usamos count en lugar de Counter.count
        System.out.println(count); // Output: 3
    }
}
