package ch01_java_building_blocks.day_ten._03_inheriting_methods._04_overriding_vs_hiding_methods;

public class Kangaroo extends Marsupial {
    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println(
                "Kangaroo hops on two legs: " + isBiped()
        );
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription(); // Output: false
        joey.getKangarooDescription(); // Output: true
    }
}
