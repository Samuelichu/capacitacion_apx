package ch01_java_building_blocks.day_nine._01_creating_constructors._03_final_fields;

public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";

    public MouseHouse(int length, int width, int height) {
        volume = length * width * height;
    }
}
