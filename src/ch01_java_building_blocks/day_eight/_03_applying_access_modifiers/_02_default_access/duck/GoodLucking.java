package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._02_default_access.duck;

public class GoodLucking {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();

        duck.quack(); // debido a la declaracion del metodo el acceso es por default

        System.out.println(duck.noise); // de igual manera podemos acceder al valor de la variable noise
    }
}
