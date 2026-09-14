package ch01_java_building_blocks.day_eight._01_designing_methods._01_return_type;

public class ReturnType {

    public void walk1(){}
    public void walk2 () {return;}
    public String walk3(){ return ""; }
    //public String walk4(){ } Debemos retornar un String No compila
    // public wal5(){} falta el tipo de retorno No compila
    // String walk6(int a){if (a==4) return "";} puede que mediante la condicional no se llegue a retornar nada No compila


    int integer() {
        return 9;
    }

    /*
        No compila debido a que espero retornar
        no un valor de tipo long sino de tipo int
        int long() {
            return 9L;
        }
     */

    int integerExpanded() {
        int temp = 9;
        return temp;
    }

    /*
        No compila debido a que no podemos asignar un long a un entero
        int longExpanded() {
            int temp = 9L; // NO COMPILA
            return temp;
        }
     */

}
