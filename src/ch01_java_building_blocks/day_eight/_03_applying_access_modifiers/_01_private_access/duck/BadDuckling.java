package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._01_private_access.duck;

public class BadDuckling {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        //duck.quack(); error debido a que el emtodo declarado es privado
    }
}
