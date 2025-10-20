//done 
package smarthome.devices;

import smarthome.Device;

public class LightsControl implements Device{
    private boolean isOn=false;
    private String color="white";

    @Override
    public void turnOn() {
        isOn=true;
        System.out.println("The lights are ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("The lights are OFF.");
    }

    public void setColor(String c){
        isOn=true;
        color=c;
        System.out.println("The color of the light is successfully set to "+ color);
    }
    
}