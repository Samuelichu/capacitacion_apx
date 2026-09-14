package ch01_java_building_blocks.day_ten._03_inheriting_methods._04_overriding_vs_hiding_methods;

public class Marsupial {
    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println(
                "Marsupial walks on two legs: " + isBiped()
        );
    }
}
