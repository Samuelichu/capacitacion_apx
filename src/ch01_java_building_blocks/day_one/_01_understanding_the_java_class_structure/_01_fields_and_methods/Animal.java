package ch01_java_building_blocks.day_one._01_understanding_the_java_class_structure._01_fields_and_methods;

public class Animal {
    String name;

    public String getName(){
        return name;
    }

    public void setname(String newName){
      name = newName;
    }

    public int numberVisitors(int month) {
        return month + 1;
    }
}
