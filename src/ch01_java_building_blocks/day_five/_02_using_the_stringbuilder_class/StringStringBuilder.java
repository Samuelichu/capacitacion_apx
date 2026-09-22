package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class;

public class StringStringBuilder {
    StringBuilder a = new StringBuilder();
    public static void main (String[] args){
    //Uso de String
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
         System.out.println(alpha);

         //Uso de StingBuilder, permite trabajar con menos objetos, no es inmutable
        StringBuilder alphaBuilder = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alphaBuilder.append(current);
        System.out.println(alphaBuilder);
    }
}
