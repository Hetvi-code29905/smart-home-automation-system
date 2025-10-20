//done
package smarthome.devices;
import smarthome.Device;

public class AirConditioning implements Device{
    private boolean isOn=false;
    private float temperature=24;

    @Override
    public void turnOn() {
        isOn=true;
        System.out.println("The A.C. is ON.");
    }

    @Override
    public void turnOff() {
        isOn=false;
        System.out.println("The A.C. is OFF.");
    }

    public void setTemperature(float t){
        temperature=t;
        System.out.println("the temperature of the A.C. is now set to "+ t + " °C");
    }
}
