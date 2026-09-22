package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions._01_subclasses;

public class Bunny {
    public void hop() throws CanNotHopException { } // hop no está lanzando un checked exception
}
class CanNotHopException extends Exception { }

class Hopper {
    public void hop() { }
}

