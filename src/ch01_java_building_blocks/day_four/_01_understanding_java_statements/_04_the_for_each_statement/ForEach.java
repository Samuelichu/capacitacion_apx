package ch01_java_building_blocks.day_four._01_understanding_java_statements._04_the_for_each_statement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    /*
     * for(datatype instance : collection){
     *     body
     * }
     */

    public static void main (String[] args){

        final String[] names = new String[3];

        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for(String name : names) {
            System.out.print(name + ", ");
        } // Output: Lisa, Kevin, Roger,



        java.util.List<String> values = new java.util.ArrayList<String>();

        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");

        for(String value : values) {
            System.out.print(value + ", ");
        } //Output: Lisa, Kevin, Roger,



        /* No compila ya que names no es un array u objeto iterable
            String names = "Lisa";

            for(String name : names) {
                System.out.print(name + " ");
            }

         */

        /* No compila ya que el tipo de la variable no es compatible
         * con el del array names
            String[] names = new String[3];

            for(int name : names) { // NO COMPILA
                System.out.print(name + " ");
            }
         */


        //Conversion de for each a for
        for(String name : names) {
            System.out.print(name + ", ");
        }

        for(int i=0; i < names.length; i++) {
            String name = names[i];
            System.out.print(name + ", ");
        }

        List<Integer> valuesInt = new ArrayList<>();
        valuesInt.add(10);
        valuesInt.add(20);
        valuesInt.add(30);

        for(int value : valuesInt){
            System.out.println(value+",");
        }

        for (java.util.Iterator<Integer> i = valuesInt.iterator(); i.hasNext();) {
            int value = i.next();
            System.out.println("Values for");
            System.out.println(value+", ");
        }


        // Uso de for para evitar ultima coma en output
        java.util.List<String> namesNew = new java.util.ArrayList<String>();

        namesNew.add("Lisa");
        namesNew.add("Kevin");
        namesNew.add("Roger");

        for(int i = 0; i < namesNew.size(); i++) {
            String name = namesNew.get(i);

            if(i > 0) {
                System.out.print(", ");
            }

            System.out.print(name);
        }

        // Uso de bucle for al comparar varios elementos
        int[] valuesCompare = new int[3];

        valuesCompare[0] = 10;
        valuesCompare[1] = new Integer(5);
        valuesCompare[2] = 15;

        for(int i = 1; i < valuesCompare.length; i++) {
            System.out.print(valuesCompare[i] - valuesCompare[i-1]+", ");
        }

    }
}
