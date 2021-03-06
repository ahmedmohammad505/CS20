
import com.phidget22.*;

public class HotorCold {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);


        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) {
       
        if (temperatureSensor.getTemperature() > 20 && temperatureSensor.getTemperature() < 24) {
       
        greenLED.setState(true);
                 Thread.sleep(1000);

                 
                 System.out.println("Temperature: " + temperatureSensor.getTemperature() + " ?C" );
                 Thread.sleep(150);

        }
       
        else {
       
        redLED.setState(true);
                Thread.sleep(1000);

       
               
                System.out.println("Temperature: " + temperatureSensor.getTemperature() + " ?C" );
                Thread.sleep(150);
           
        }
           
        }
    }
}