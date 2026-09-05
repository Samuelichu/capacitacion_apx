package ch01_java_building_blocks.day_twelve._01_implementing_interfaces._04_static_interface_methods;

public class Bunny implements Hop{
    public void printDetails(){
        // System.out.println(getJumpHeight());
        System.out.println(Hop.getJumpHeight()); // Accedemos sin necesidad de crear una instancia
    }
}
