package ch01_java_building_blocks.day_two._02_understanding_default_initialization_of_variables._01_local_variables;

public class Default {

   /* public int notValid(){
        int y = 10;
        int x;
        int reply = x+y;
        return reply;
    } El valor de x no está inicializado
    */

    public int valid(){
        int y = 10;
        int x; // x se declara aqui
        x = 3; // se inicializa aqui
        int reply = x+y;
        return reply;
    }

    public void findAnswer(boolean check){
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;

        } else {
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); NO COMPILA
    }
    public static void main (String[] args){
        Default d = new Default();
        //System.out.println(d.notValid());
        d.findAnswer(true);
    }

}
