package ch01_java_building_blocks.day_ten._01_introducing_class_inheritance._04_defining_constructors;

public class Gorilla extends AnimalTwo{
   // se utiliza cualquier constructor valido
    public Gorilla(int age) {
        super(age, "Gorilla");
    }

    public Gorilla() {
        super(5);
    }
}
