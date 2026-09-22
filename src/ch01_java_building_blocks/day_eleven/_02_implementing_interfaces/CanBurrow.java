package ch01_java_building_blocks.day_eleven._02_implementing_interfaces;

public abstract interface CanBurrow {
    public static final int MINIMUM_DEPTH = 2;

    public abstract int getMaximumDepth();
}
