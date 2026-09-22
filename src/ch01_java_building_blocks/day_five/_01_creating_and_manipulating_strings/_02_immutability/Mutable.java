package ch01_java_building_blocks.day_five._01_creating_and_manipulating_strings._02_immutability;

public class Mutable {
    private String s;

    public void setS(String newS) {
        s = newS;
    } // El setter causa que sea mutable

    public String getS() {
        return s;
    }
}

final class Immutable {
    private String s = "name";
    public String getS() {
        return s;
    }

    public void example (){
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2); // Output: 12;
    }
}
