package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._06_calling_a_static_Variable_or_Method;

public class KoalaNew {
    public static void main(String[] args) {
        System.out.println(Koala.count);
        Koala.main(new String[0]);

        Koala k = new Koala();
        System.out.println(k.count); //Output: 0
        k = null;
        System.out.println(k.count);//Output: 0


        //Todos los objetos comparten la misma variable static
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count); // Output: 5
    }
}
