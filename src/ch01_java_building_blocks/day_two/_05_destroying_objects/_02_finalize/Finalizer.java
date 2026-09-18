package ch01_java_building_blocks.day_two._05_destroying_objects._02_finalize;

public class Finalizer {
    protected void finalize(){
        System.out.println("Calling Finalize");
    }
    public static void main(String[] args){
        Finalizer f = new Finalizer();
    }
}
