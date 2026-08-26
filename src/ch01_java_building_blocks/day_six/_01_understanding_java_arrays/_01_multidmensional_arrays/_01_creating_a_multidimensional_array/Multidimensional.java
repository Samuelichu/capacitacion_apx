package ch01_java_building_blocks.day_six._01_understanding_java_arrays._01_multidmensional_arrays._01_creating_a_multidimensional_array;

public class Multidimensional {
    String [][] bidimensional = new String [2][2];

    int[][] vars1;              // array 2D
    int vars2[][];              // array 2D
    int[] vars3[];              // array 2D
    int[] vars4[], space[][];   // un array 2D Y uno 3D

public void bidimensionalMethod (){
    String[][] rectangle = new String[3][2];
    rectangle[0][1] = "set";
}

public void methods (){
    //Irregular Arrays
    int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

    // Otra Forma
    int[][] args = new int[4][];

    args[0] = new int[5]; // [ 0 ] → [  ] [  ] [  ] [  ] [  ]
    args[1] = new int[3]; // [ 1 ] → [  ] [  ] [  ]
}

}
