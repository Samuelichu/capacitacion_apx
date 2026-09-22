package ch01_java_building_blocks.day_twelve._01_implementing_interfaces._02_default_interface_methods;

public interface IsWarmBlooded {
    boolean hasScales();

    public default double getTemperature() {
        return 10.0;
    }
}
