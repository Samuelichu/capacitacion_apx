package ch01_java_building_blocks.day_nine._02_encapsulating_data._01_creating_inmutable_classes;

public class ImmutableSwan {
    private int numberEggs;

    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}
