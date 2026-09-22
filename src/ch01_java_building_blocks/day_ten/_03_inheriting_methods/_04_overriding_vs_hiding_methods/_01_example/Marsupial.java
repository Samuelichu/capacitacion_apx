package ch01_java_building_blocks.day_ten._03_inheriting_methods._04_overriding_vs_hiding_methods._01_example;

public class Marsupial {
    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println(
                "Marsupial walks on two legs: " + isBiped()
        );
    }
}
