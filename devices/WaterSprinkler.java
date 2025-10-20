package smarthome.devices;
import smarthome.Device;
public class WaterSprinkler {
    private boolean isOn=false;
    private int minutes=0;

    public void turnOn() {
        isOn=true;
        System.out.println("The water sprinkler is ON now.");
    }

    public void turnOff() {
        System.out.println("The water sprinkler is OFF now.");
    }

    public void setschedule(int m){
        minutes=m;
        System.out.println("The scheduled time for the water sprinkler is set to "+ minutes + " minutes");
    }
}


