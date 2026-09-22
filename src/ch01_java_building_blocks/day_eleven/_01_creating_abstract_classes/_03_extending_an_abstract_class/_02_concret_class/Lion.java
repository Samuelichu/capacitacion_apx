package ch01_java_building_blocks.day_eleven._01_creating_abstract_classes._03_extending_an_abstract_class._02_concret_class;

public class Lion extends BigCat{
    public String getName() {
        return "Lion";
    }

    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
