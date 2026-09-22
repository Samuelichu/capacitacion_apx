package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions._01_subclasses;

public class Bunny2 extends Hopper2 {

    public void hop() { }

}

class Hopper2 {
    public void hop() throws CanNotHopException { }
}