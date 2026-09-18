package ch01_java_building_blocks.day_six._01_understanding_java_arrays._01_multidmensional_arrays._02_using_a_multidimensional_array;

public class Multidimensional {
    public static void main (String[] args){

        // Una Forma
        int[][] twoD = new int[3][2];

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // imprimir cada elemento

            System.out.println(); // pasamos a una nueva fila
        }

        //Otra forma
        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

    }
}
