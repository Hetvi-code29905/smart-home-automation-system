package smarthome.devices;

import smarthome.Device;

public class Refrigerator implements Device {
    private int temperature = 3;
    private boolean doorOpen = false;

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is OFF.");
    }

    public int checkTemperature() {
        return temperature;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void change_temp(int newTemperature) {
        temperature = newTemperature;
        System.out.println("Temperature logged: " + newTemperature + "°C");

        if (newTemperature > 5) {
            notifyUser();
        }
    }

    public void notifyUser() {
        System.out.println("Alert: Refrigerator door has been left open!");
    }
}