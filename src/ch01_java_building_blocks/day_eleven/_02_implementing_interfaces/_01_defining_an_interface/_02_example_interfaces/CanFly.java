package ch01_java_building_blocks.day_eleven._02_implementing_interfaces._01_defining_an_interface._02_example_interfaces;

public interface CanFly {
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}
