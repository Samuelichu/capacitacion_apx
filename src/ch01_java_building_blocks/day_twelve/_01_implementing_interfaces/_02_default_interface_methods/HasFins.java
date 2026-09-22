package ch01_java_building_blocks.day_twelve._01_implementing_interfaces._02_default_interface_methods;

public interface HasFins {
    public default int getNumberOfFins() {
        return 4;
    }
    public default double getLongestFinLength() {
        return 20.0;
    }
    public default boolean doFinsHaveScales() {
        return true;
    }
}
