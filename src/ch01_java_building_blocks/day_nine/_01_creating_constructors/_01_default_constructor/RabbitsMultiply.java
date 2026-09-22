package ch01_java_building_blocks.day_nine._01_creating_constructors._01_default_constructor;

public class RabbitsMultiply {
    public static void main(String[] args) {
       Rabbit1 r1 = new Rabbit1();
       Rabbit2 r2 = new Rabbit2();
       Rabbit3 r3 = new Rabbit3(true);
       //Rabbit4 r4 = new Rabbit4(); falla debido a constructor private
    }
}

class Rabbit1 {
} // cuenta con constructor predeterminado

class Rabbit2 {
    public Rabbit2() { }
}

class Rabbit3 {
    public Rabbit3(boolean b) { }
}

class Rabbit4 {
    private Rabbit4() { }
}



