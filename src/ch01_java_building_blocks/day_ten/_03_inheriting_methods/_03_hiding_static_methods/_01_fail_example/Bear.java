package ch01_java_building_blocks.day_ten._03_inheriting_methods._03_hiding_static_methods._01_fail_example;

public class Bear {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}
