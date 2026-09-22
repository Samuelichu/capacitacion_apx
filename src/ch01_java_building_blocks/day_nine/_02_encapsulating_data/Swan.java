package ch01_java_building_blocks.day_nine._02_encapsulating_data;

public class Swan {
    // int numberEggs; no tenemos control sobre la edicion que puede sufrir esta variable
    private int numberEggs; // private

    public int getNumberEggs() {
       return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {
       if (numberEggs >= 0) this.numberEggs = numberEggs; // guard condition
    }
}
