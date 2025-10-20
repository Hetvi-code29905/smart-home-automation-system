//done
package smarthome.devices;
import smarthome.Device;

public class SecuritySystem {
    private boolean isOn=false;

    public void turnOn() {
        isOn=true;
        System.out.println("The Cameras are ON now.");
    }

    public void turnOff() {
        isOn=false;
        System.out.println("The Cameras are OFF now.");
    }

    public void isCameraOn(){
        if(isOn){
            System.out.println("The camera is ON currently!");
        }
        else{
            System.out.println("The camera is OFF currently!");
        }

    }

}
