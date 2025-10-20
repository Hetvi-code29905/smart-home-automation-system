package smarthome.devices;

import smarthome.Device;

public class EnergyMonitor implements Device {

    private boolean powerSavingMode = false;

    @Override
    public void turnOn() {
        System.out.println("Energy Monitor is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Energy Monitor is OFF.");
    }

    public void enablePowerSavingMode() {
        powerSavingMode = true;
        System.out.println("Power Saving Mode ENABLED.");
    }

    public void disablePowerSavingMode() {
        powerSavingMode = false;
        System.out.println("Power Saving Mode DISABLED.");
    }

}
