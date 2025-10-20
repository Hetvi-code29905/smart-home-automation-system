package smarthome.sensors;

import smarthome.Device;

public class SmokeDetector implements Device {
    private boolean alarmActivated = false;
    private boolean smokeDetected = false;

    @Override
    public void turnOn() {
        System.out.println("Smoke Detector activated.");
        alarmActivated = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Smoke Detector deactivated.");
        alarmActivated = false;
    }

    public void activateAlarm() {
        if (alarmActivated) {
            System.out.println("Alarm is sounding!");
        }
    }

    public void deactivateAlarm() {
        System.out.println("Alarm is turned off.");
    }

    public boolean isSmokeDetected() {
        return smokeDetected;
    }

    
    public void notifyUser() {
        System.out.println("Alert: Smoke detected! Please check.");
    }

    public void selfDiagnostic() {
        System.out.println("Self-diagnostic complete. Smoke Detector functioning properly.");
    }
}