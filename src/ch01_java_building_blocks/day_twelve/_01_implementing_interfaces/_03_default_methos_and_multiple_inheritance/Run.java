package ch01_java_building_blocks.day_twelve._01_implementing_interfaces._03_default_methos_and_multiple_inheritance;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
