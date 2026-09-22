package ch01_java_building_blocks.day_ten._04_inheriting_variables._01_hiding_variables;

public class Rodent {
    protected int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + "]");
    }
}
