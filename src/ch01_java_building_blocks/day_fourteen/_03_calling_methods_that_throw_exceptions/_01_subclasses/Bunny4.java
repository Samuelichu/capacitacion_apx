package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions._01_subclasses;

public class Bunny4 {
    class Hopper {
        public void hop() { }
    }

    class Bunny extends Hopper {
        public void hop() throws IllegalStateException { }
    }
}
