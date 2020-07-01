package Week3;

public class Lamp {

    boolean isOn;
    public static void main(String[] Args){
        Lamp one = new Lamp();
        Lamp two = new Lamp();
        one.turnOff();
        two.turnOn();
    }
    void turnOn(){
        isOn = true;
    }
    void turnOff(){
        isOn = false;
    }
}
