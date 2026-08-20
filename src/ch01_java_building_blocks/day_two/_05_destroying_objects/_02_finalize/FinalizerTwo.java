package ch01_java_building_blocks.day_two._05_destroying_objects._02_finalize;

import java.util.ArrayList;
import java.util.List;

public class FinalizerTwo {
    private static List objects = new ArrayList();
    protected void finalize(){
        objects.add(this);  // No debemos hacerlo
    }
}
