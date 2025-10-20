package smarthome.devices;

import smarthome.Device;

public class EntertainmentSystem implements Device {
    private boolean isOn = false;
    private int channel = 1;
    private int volume = 10;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Entertainment System is ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Entertainment System is OFF.");
    }

    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel changed to " + channel);
    }

    public void adjustVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to " + volume);
        displayTV();
    }

    public void displayTV() {
        System.out.println("       __________________________________     ");
        System.out.println("      |   ____________________________   |");
        System.out.println("      |  | Volume set to : " + volume + "         |  |");
        System.out.println("      |  |                            |  |");
        System.out.println("      |  |                            |  |");
        System.out.println("      |  |                            |  |");
        System.out.println("      |  |                            |  |");
        System.out.println("      |  |____________________________|  |");
        System.out.println("      |__________________________________|");
        System.out.println("                     |     |        ");
        System.out.println("                _________________       ");
    }

}
