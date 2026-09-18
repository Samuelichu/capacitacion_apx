package ch01_java_building_blocks.day_ten._02_calling_inheried_class_members;

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails(){
        System.out.println("Shark with age: "+getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");
    }

    /* Versiones Alternativas usando this y super
        public void displaySharkDetails() {
            System.out.print("Shark with age: " + this.getAge());
            System.out.print(" and " + this.size + " meters long");
            System.out.print(" with " + this.numberOfFins + " fins");
        }

        public void displaySharkDetails() {
            System.out.print("Shark with age: " + super.getAge());
            System.out.print(" and " + super.size + " meters long");
            System.out.print(" with " + this.numberOfFins + " fins");
        }
     */

    /*
        Falla debido a que unicamente con this podemos acceder a metodos y variables
        de la clase padre y la clase hija

        public void displaySharkDetails() {
            System.out.print("Shark with age: " + super.getAge());
            System.out.print(" and " + super.size + " meters long");
            System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE
        }
     */

    /*
        El uso de super() y super es similar al uso que le damos a this y this()

        public Rabbit(int age) {
            super();
            super.setAge(10);
        }

        No compila debido a que super() hace referencia al contructor de la clase padre
        y super hace referencia a un miembro definido en la clase padre
        public Rabbit(int age) {
            super;
            super().setAge(10);
        }
     */
}
