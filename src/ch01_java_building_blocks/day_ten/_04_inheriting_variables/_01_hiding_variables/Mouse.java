package ch01_java_building_blocks.day_ten._04_inheriting_variables._01_hiding_variables;

public class Mouse extends Rodent {
    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
        /*
            Output: [parentTail=4]
            [tail=8,parentTail=4]
         */
    }
}
