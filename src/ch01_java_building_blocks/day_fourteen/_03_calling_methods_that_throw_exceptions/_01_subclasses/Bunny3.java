package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions._01_subclasses;

public class Bunny3 extends Hopper3 {
    public void hop() throws CanNotHopException2 { }

}

class Hopper3 {
    public void hop() throws Exception { }
}

class CanNotHopException2 extends Exception { }