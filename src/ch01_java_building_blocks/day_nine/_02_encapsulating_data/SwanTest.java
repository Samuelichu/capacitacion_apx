package ch01_java_building_blocks.day_nine._02_encapsulating_data;

public class SwanTest {
    private boolean playing;
    private String name;
    public boolean getPlaying() { return playing; }  // NO CUMPLE CONVENCION
    public boolean isPlaying() { return playing; }
    public String name() { return name; } // NO CUMPLE CONVENCION
    public void updateName(String n) { name = n; } // NO CUMPLE CONVENCION
    public void setname(String n) { name = n; } // NO CUMPLE CONVENCION
}
