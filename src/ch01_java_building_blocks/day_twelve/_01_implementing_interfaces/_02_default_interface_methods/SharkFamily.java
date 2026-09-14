package ch01_java_building_blocks.day_twelve._01_implementing_interfaces._02_default_interface_methods;

public interface SharkFamily {
    public default int getNumberOfFins() {
        return 8;
    }
    public double getLongestFinLength();

   /*
    public boolean doFinsHaveScales() {
        return false;
    } Falta definir el metodo como default
    */

}
