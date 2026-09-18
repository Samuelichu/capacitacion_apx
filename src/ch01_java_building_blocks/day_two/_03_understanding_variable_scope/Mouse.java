package ch01_java_building_blocks.day_two._03_understanding_variable_scope;

public class Mouse {
    static int MAX_LENGHT = 5; //Class Variable - scope hasta que termina el programa
    int lenght; // Instance Variable - scope mientras exista el objeto
    public void grow (int inches){
        if (lenght < MAX_LENGHT){
            int newSize = lenght + inches;
            lenght = newSize;
        } // fin scope newSize
    } // fin scope inches
}
