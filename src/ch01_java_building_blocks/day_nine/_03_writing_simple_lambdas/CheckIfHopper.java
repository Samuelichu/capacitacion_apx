package ch01_java_building_blocks.day_nine._03_writing_simple_lambdas;

public class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a) {
        return a.canHop();
    }
}
