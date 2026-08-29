package ch01_java_building_blocks.day_nine._01_creating_constructors;

public class BunnyTwo {
    private String color;
    private int height;
    private int length;

    public BunnyTwo (int length, int theHeight) {
        length = this.length; // se esta asignando al revés
        height = theHeight;
        this.color = "white";
    }

   public static void main(String[] args) {
        BunnyTwo b = new BunnyTwo(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);// Output: 0 2 white
    }
}
