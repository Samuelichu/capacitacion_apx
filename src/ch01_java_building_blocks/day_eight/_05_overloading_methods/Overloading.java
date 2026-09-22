package ch01_java_building_blocks.day_eight._05_overloading_methods;

public class Overloading {
    //public void fly(int numMiles) { }

    //public void fly(short numFeet) { }

    public boolean fly() { return false; }

    void fly(int numMiles, short numFeet) { }

    public void fly(short numFeet, int numMiles) throws Exception { }

    /*
        Error
        public void fly(int numMiles) { }
        public int fly(int numMiles) { } Mismos parametros que metodo anterior
     */

    /*
        Error
         public void fly(int numMiles) { }
         public static void fly(int numMiles) { } Mismos parametros que metodo anterior
     */

    public void fly(int numMiles) {
        System.out.println("short");
    }

    public void fly(short numFeet) {
        System.out.println("short");
    }
}
