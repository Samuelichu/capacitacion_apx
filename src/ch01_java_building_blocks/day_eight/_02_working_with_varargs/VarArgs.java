package ch01_java_building_blocks.day_eight._02_working_with_varargs;

public class VarArgs {
    public void walk1(int... nums) { }

    public void walk2(int start, int... nums) { }

    //public void walk3(int... nums, int start) { } Al trabajar con varargs en el primer parametro generamos una ambiguedad
    //java podria asumir estructuras diferentes para los parametros que le enviamos incialmente

    //public void walk4(int... start, int... nums) { } La explicacion del error es similar al anterior, java no sabe de que manera trabajar con los argumentos

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main (String[] args){
        walk(1);//Output: 0
        walk(1,2); //Output: 1
        walk(1,2,3); //Output: 2
        walk(1,new int[] {4,5}); //Output: 2


        run(11, 22); // Output: 22
    }
    public static void run(int... nums) {
        System.out.println(nums[1]);
    }
}
