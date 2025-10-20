package smarthome.devices;

import smarthome.Device;

public class HeatingSystem {
    private float temperature=28.5f;

    
    public void turnOn() {
        System.out.println("The heater is ON.");
    }

    public void turnOff() {
        System.out.println("The heater is OFF.");
    }

    public void setTemperature(float t){
        temperature=t;
        System.out.println("The temperature is now set to "+ temperature +" °C");
    }

}
